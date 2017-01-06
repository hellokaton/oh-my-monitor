package com.monitor.client.luncher;

import com.monitor.client.MonitorClient;

/**
 * Created by biezhi on 2017/1/6.
 */
public class Luncher {

    public static void main(String[] args) {
        MonitorClient monitorClient = new MonitorClient();
        try {
            monitorClient.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
