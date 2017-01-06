package com.monitor.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.blade.kit.DateKit;
import com.blade.kit.StringKit;
import com.blade.kit.http.HttpRequest;
import com.monitor.client.utils.ThreadPool;
import com.monitor.client.utils.UUID;
import com.monitor.constant.Global;
import com.monitor.model.Host;
import com.monitor.model.ReportModel;
import com.monitor.model.Service;
import com.monitor.model.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by biezhi on 2017/1/4.
 */
public class MonitorClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(MonitorClient.class);

    private static final ThreadPoolExecutor threadPoolExecutor = ThreadPool.getThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 2, Integer.MAX_VALUE);

    /**
     * 服务接口地址
     */
    private String baseUrl = Constant.config.get("server_url");

    /**
     * 请求超时设置
     */
    private int requestTimeout = Constant.config.getInt("request_timeout", 5000);

    /**
     * 配置更新间隔，单位/秒
     */
    private int update_inverval = Constant.config.getInt("config_update_inverval", 300);

    /**
     * 客户端主机id
     */
    private String hostId = Constant.config.get("hostid");

    /**
     * 通信密钥
     */
    private String keepKey = Constant.config.get("server_keep_key", "");

    /**
     * 要监控的服务列表
     */
    private Set<Service> services = new HashSet<>();

    /**
     * 加载客户端配置信息
     */
    public void loadConfig(){
        String configUrl = baseUrl + Urls.CONFIG + "/" + hostId;
        LOGGER.debug("request url => {}", configUrl);
        String body = HttpRequest.get(configUrl).header(Global.KEEP_KEY_FIELD, keepKey).connectTimeout(requestTimeout).body();
        LOGGER.debug("response => {}", body);
        if(StringKit.isNotBlank(body)){
            JSONObject response = JSON.parseObject(body);
            if(null != response && response.getBoolean("success")){
                String payload = response.get("payload").toString();
                Host host = JSON.parseObject(payload, Host.class);
                if(null != host && null != host.getTemplates()){
                    for(Template template : host.getTemplates()){
                        services.addAll(template.getServices());
                    }
                }
            }
        }
    }


    public void execute() throws Exception {
        boolean exit = false;
        int config_last_update_time = 0;
        while(!exit){
            if(DateKit.getCurrentUnixTime() - config_last_update_time > update_inverval){
                this.loadConfig();
                LOGGER.info("Loaded latest config: {}", services);
                config_last_update_time = DateKit.getCurrentUnixTime();
            }
            for(Service service : services){
                int monitor_interval = service.getInterval();
                int lastInvokeTime = service.getLastInvoke();
                int current = DateKit.getCurrentUnixTime();
                if(current - lastInvokeTime > monitor_interval){
                    String d1 = DateKit.formatDateByUnixTime(lastInvokeTime, "yyyy-MM-dd HH:mm:ss");
                    String d2 = DateKit.formatDateByUnixTime(current, "yyyy-MM-dd HH:mm:ss");
                    LOGGER.info("Last invoke [{}], Current [{}]", d1, d2);
                    service.setLastInvoke(current);
                    this.invoke(service.getName());
                    LOGGER.debug("Go Ping monitor [{}]", service.getName());
                } else {
                    // 心跳
                    LOGGER.debug("Go Ping monitor [{}] in [{}] secs", service.getName(), monitor_interval - (current - lastInvokeTime));
                }
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public void invoke(final String serviceName){
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                ReportModel reportModel = new ReportModel();
                reportModel.setHost_id(hostId);
                reportModel.setService(serviceName);
                reportModel.setData(28);
                reportModel.setId(UUID.UU16());

                String data = JSON.toJSONString(reportModel);

                String body = HttpRequest.post(baseUrl + Urls.SERVICE_REPORT)
                        .header(Global.KEEP_KEY_FIELD, keepKey).connectTimeout(requestTimeout).send(data).body();
                LOGGER.debug("response => {}", body);
            }
        });
    }
}