package com.monitor.model;

import com.monitor.constant.HostStatus;
import com.monitor.constant.MonitorType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Host implements Serializable{

    private String name;
    private String ipAddr;
    private List<HostGroup> groups;
    private List<Template> templates;
    private MonitorType monitorType;
    private HostStatus status;
    private int aliveInterval;

    public String getName() {
        return name;
    }

    public Host setName(String name) {
        this.name = name;
        return this;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public Host setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
        return this;
    }

    public List<HostGroup> getGroups() {
        return groups;
    }

    public Host setGroups(List<HostGroup> groups) {
        this.groups = groups;
        return this;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public Host setTemplates(List<Template> templates) {
        this.templates = templates;
        return this;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public Host setMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType;
        return this;
    }

    public HostStatus getStatus() {
        return status;
    }

    public Host setStatus(HostStatus status) {
        this.status = status;
        return this;
    }

    public int getAliveInterval() {
        return aliveInterval;
    }

    public Host setAliveInterval(int aliveInterval) {
        this.aliveInterval = aliveInterval;
        return this;
    }
}
