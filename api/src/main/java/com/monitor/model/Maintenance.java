package com.monitor.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Maintenance implements Serializable {

    private String name;
    private List<Host> hosts;
    private List<HostGroup> hostGroups;
    private String content;
    private Date startTime;
    private Date endTime;

    public String getName() {
        return name;
    }

    public Maintenance setName(String name) {
        this.name = name;
        return this;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public Maintenance setHosts(List<Host> hosts) {
        this.hosts = hosts;
        return this;
    }

    public List<HostGroup> getHostGroups() {
        return hostGroups;
    }

    public Maintenance setHostGroups(List<HostGroup> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Maintenance setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Maintenance setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Maintenance setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }
}
