package com.monitor.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by biezhi on 2017/1/4.
 */
public class HostGroup implements Serializable{

    private String name;
    private List<Template> templates;
    private String bak;

    public String getName() {
        return name;
    }

    public HostGroup setName(String name) {
        this.name = name;
        return this;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public HostGroup setTemplates(List<Template> templates) {
        this.templates = templates;
        return this;
    }

    public String getBak() {
        return bak;
    }

    public HostGroup setBak(String bak) {
        this.bak = bak;
        return this;
    }
}
