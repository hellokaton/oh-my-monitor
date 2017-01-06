package com.monitor.server.config;

import com.blade.Blade;
import com.blade.config.BaseConfig;
import com.blade.config.Configuration;
import com.blade.ioc.annotation.Component;
import com.monitor.server.db.Database;
import com.monitor.server.db.MapDbImpl;

/**
 * Created by biezhi on 2017/1/6.
 */
@Component
public class DBConfig implements BaseConfig {

    @Override
    public void config(Configuration configuration) {
        Database database = new MapDbImpl();
        Blade.$().ioc().addBean(database);
    }
}
