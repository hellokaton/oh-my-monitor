package com.monitor.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Service implements Serializable{
    private String name;
    private int interval;
    private List<ServiceItem> items;
    private boolean hasSubService;
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
}
