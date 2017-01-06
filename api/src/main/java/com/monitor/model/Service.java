package com.monitor.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Service implements Serializable{

    /**
     * 服务名
     */
    private String name;

    /**
     * 服务监控间隔，单位/秒，默认一分钟
     */
    private int interval = 60;

    /**
     * 最后一次执行时间
     */
    private int lastInvoke;

    /**
     * 服务子项
     */
    private List<ServiceItem> items;

    /**
     * 是否有子项
     */
    private boolean hasSubService;

    /**
     * 服务备注
     */
    private String bak;

    public String getName() {
        return name;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public int getInterval() {
        return interval;
    }

    public Service setInterval(int interval) {
        this.interval = interval;
        return this;
    }

    public List<ServiceItem> getItems() {
        return items;
    }

    public Service setItems(List<ServiceItem> items) {
        this.items = items;
        return this;
    }

    public boolean isHasSubService() {
        return hasSubService;
    }

    public Service setHasSubService(boolean hasSubService) {
        this.hasSubService = hasSubService;
        return this;
    }

    public String getBak() {
        return bak;
    }

    public Service setBak(String bak) {
        this.bak = bak;
        return this;
    }

    public int getLastInvoke() {
        return lastInvoke;
    }

    public void setLastInvoke(int lastInvoke) {
        this.lastInvoke = lastInvoke;
    }
}
