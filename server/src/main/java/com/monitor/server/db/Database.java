package com.monitor.server.db;

/**
 * Created by biezhi on 2017/1/6.
 */
public interface Database {

    String get(String key);

    void set(String key, String value);

}
