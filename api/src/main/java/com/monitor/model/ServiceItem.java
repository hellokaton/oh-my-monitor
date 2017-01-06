package com.monitor.model;

import java.io.Serializable;

/**
 * Created by biezhi on 2017/1/4.
 */
public class ServiceItem implements Serializable {

    private String name;
    private String key;
    private Class<? extends Serializable> dataType;
    private String bak;

    public String getName() {
        return name;
    }

    public ServiceItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getKey() {
        return key;
    }

    public ServiceItem setKey(String key) {
        this.key = key;
        return this;
    }

    public Class<? extends Serializable> getDataType() {
        return dataType;
    }

    public ServiceItem setDataType(Class<? extends Serializable> dataType) {
        this.dataType = dataType;
        return this;
    }

    public String getBak() {
        return bak;
    }

    public ServiceItem setBak(String bak) {
        this.bak = bak;
        return this;
    }
}
