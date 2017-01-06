package com.monitor.model;

import java.io.Serializable;

/**
 * 上报数据对象
 *
 * Created by biezhi on 2017/1/6.
 */
public class ReportModel implements Serializable {

    /**
     * 上报数据的uuid
     */
    private String id;

    /**
     * 客户端主机id
     */
    private String host_id;

    /**
     * 服务名
     */
    private String service;

    /**
     * 上报数据
     */
    private Object data;

    /**
     * 上报时间
     */
    private int time = (int) (System.currentTimeMillis() / 1000);

    public ReportModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
