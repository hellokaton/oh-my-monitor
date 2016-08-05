package com.monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String index(){
        return "index";
    }

    @RequestMapping("chart")
    public String chart(){
        return "chart";
    }

}
