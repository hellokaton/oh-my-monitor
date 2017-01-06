package com.monitor.client;

import com.blade.kit.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by biezhi on 2017/1/4.
 */
public class MonitorClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(MonitorClient.class);

    private String baseUrl = Constant.config.get("server_url");

    public void loadConfig(){
        String body = HttpRequest.get(baseUrl + Urls.CONFIG).body();
        LOGGER.info("response => {}", body);
    }

    public void foreverRun(){
        boolean exit = false;
        int config_last_update_time = 0;
        while(!exit){

        }
    }

}
