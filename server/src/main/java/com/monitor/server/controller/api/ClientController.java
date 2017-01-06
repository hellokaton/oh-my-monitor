package com.monitor.server.controller.api;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.Controller;
import com.blade.mvc.annotation.RestController;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.blade.mvc.view.RestResponse;
import com.monitor.server.db.Database;

/**
 * Created by biezhi on 2017/1/6.
 */
@RestController("api/client")
public class ClientController {

    @Inject
    private Database database;

    @Route(value = "config", method = HttpMethod.GET)
    public RestResponse config(){
        RestResponse restResponse = new RestResponse();
        restResponse.setSuccess(true);
        return restResponse;
    }

}
