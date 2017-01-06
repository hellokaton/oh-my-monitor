package com.monitor.server.db;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by biezhi on 2017/1/6.
 */
public class HashMapImpl implements Database {

    private Map<String, Object> pool = new HashMap<>();

    @Override
    public <T> T get(Class<T> type, String key) {
        Object obj = pool.get(key);
        return null != obj ? type.cast(obj) : null;
    }

    @Override
    public void set(String key, Object value) {
        pool.put(key, value);
    }
}
