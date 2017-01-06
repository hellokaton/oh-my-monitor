package com.monitor.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Template implements Serializable {

    private String name;
    private List<Service> services;
    private List<Trigger> triggers;

    public String getName() {
        return name;
    }

    public Template setName(String name) {
        this.name = name;
        return this;
    }

    public List<Service> getServices() {
        return services;
    }

    public Template setServices(List<Service> services) {
        this.services = services;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public Template setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }
}
