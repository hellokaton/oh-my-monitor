package com.monitor.server.controller;

import com.blade.mvc.annotation.Controller;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;

/**
 * Created by biezhi on 2017/1/6.
 */
@Controller
public class IndexController {

    @Route(value = "", method = HttpMethod.GET)
    public void index(){

    }

}
