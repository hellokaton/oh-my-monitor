package com.monitor.server.controller.api;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.PathParam;
import com.blade.mvc.annotation.RestController;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.blade.mvc.http.Request;
import com.blade.mvc.view.RestResponse;
import com.monitor.model.Host;
import com.monitor.server.db.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by biezhi on 2017/1/6.
 */
@RestController("api/client")
public class ClientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @Inject
    private Database database;

    /**
     * 获取客户端配置信息
     *
     * @return
     */
    @Route(value = "config/:hostid", method = HttpMethod.GET)
    public RestResponse config(@PathParam("hostid") String hostid){
        RestResponse restResponse = new RestResponse();
        try {
            Host host = database.get(Host.class, "host:" + hostid);
            restResponse.setPayload(host);
            restResponse.setSuccess(true);
        } catch (Exception e){
            LOGGER.error("获取客户端配置失败", e);
            restResponse.setMsg(e.getMessage());
        }
        return restResponse;
    }

    /**
     * 向服务端上报数据
     *
     * @return
     */
    @Route(value = "service_report", method = HttpMethod.POST)
    public RestResponse service_report(Request request){
        RestResponse restResponse = new RestResponse();
        String body = request.body().asString();

        System.out.println("body = " + body);
        restResponse.setSuccess(true);
        return restResponse;
    }

}
