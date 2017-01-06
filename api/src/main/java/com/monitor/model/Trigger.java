package com.monitor.model;

import com.monitor.constant.Severity;

import java.io.Serializable;

/**
 * Created by biezhi on 2017/1/4.
 */
public class Trigger implements Serializable {

    private String name;
    private Severity severity;
    private boolean enabled;
    private String bak;

    public String getName() {
        return name;
    }

    public Trigger setName(String name) {
        this.name = name;
        return this;
    }

    public Severity getSeverity() {
        return severity;
    }

    public Trigger setSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Trigger setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getBak() {
        return bak;
    }

    public Trigger setBak(String bak) {
        this.bak = bak;
        return this;
    }
}
