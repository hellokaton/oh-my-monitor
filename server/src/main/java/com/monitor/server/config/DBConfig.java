package com.monitor.server.config;

import com.blade.Blade;
import com.blade.config.BaseConfig;
import com.blade.config.Configuration;
import com.blade.ioc.annotation.Component;
import com.monitor.model.Host;
import com.monitor.model.Service;
import com.monitor.model.Template;
import com.monitor.server.db.Database;
import com.monitor.server.db.HashMapImpl;

import java.util.Arrays;

/**
 * Created by biezhi on 2017/1/6.
 */
@Component
public class DBConfig implements BaseConfig {

    @Override
    public void config(Configuration configuration) {
        Database database = new HashMapImpl();

        Host host = new Host();
        host.setName("asasas");
        Template template = new Template();
        Service service = new Service();
        service.setName("cup_usage");
        service.setInterval(5);
        template.setServices(Arrays.asList(service));
        host.setTemplates(Arrays.asList(template));

        database.set("host:2", host);
        Blade.$().ioc().addBean(database);
    }
}
