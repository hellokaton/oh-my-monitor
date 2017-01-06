package com.monitor.server.db;

/**
 * Created by biezhi on 2017/1/6.
 */
public interface Database {

    <T> T get(Class<T> type, String key);

    void set(String key, Object value);

}
