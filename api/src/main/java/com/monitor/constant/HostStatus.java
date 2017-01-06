package com.monitor.constant;

/**
 * 主机存活状态
 *
 * Created by biezhi on 2017/1/4.
 */
public enum HostStatus {

    ONLINE("在线"),
    OFFLINE("离线");

    private String desc;

    HostStatus(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
