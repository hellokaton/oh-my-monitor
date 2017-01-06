package com.monitor.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Action implements Serializable {

    private String name;
    private List<HostGroup> groups;
    private List<Host> hosts;
    private List<Trigger> triggers;
    private int interval;
    private List<ActionOperation> operations;
    private boolean recoverNotice;
    private String recoverSubject;
    private String recoverMessage;
    private boolean enabled;

    public String getName() {
        return name;
    }

    public Action setName(String name) {
        this.name = name;
        return this;
    }

    public List<HostGroup> getGroups() {
        return groups;
    }

    public Action setGroups(List<HostGroup> groups) {
        this.groups = groups;
        return this;
    }

    public List<Host> getHosts() {
        return hosts;
    }

    public Action setHosts(List<Host> hosts) {
        this.hosts = hosts;
        return this;
    }

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public Action setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public int getInterval() {
        return interval;
    }

    public Action setInterval(int interval) {
        this.interval = interval;
        return this;
    }

    public List<ActionOperation> getOperations() {
        return operations;
    }

    public Action setOperations(List<ActionOperation> operations) {
        this.operations = operations;
        return this;
    }

    public boolean isRecoverNotice() {
        return recoverNotice;
    }

    public Action setRecoverNotice(boolean recoverNotice) {
        this.recoverNotice = recoverNotice;
        return this;
    }

    public String getRecoverSubject() {
        return recoverSubject;
    }

    public Action setRecoverSubject(String recoverSubject) {
        this.recoverSubject = recoverSubject;
        return this;
    }

    public String getRecoverMessage() {
        return recoverMessage;
    }

    public Action setRecoverMessage(String recoverMessage) {
        this.recoverMessage = recoverMessage;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Action setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
