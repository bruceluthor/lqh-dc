package com.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/access")
public class BaseController {
    @RequestMapping(value = "/signin")
    public String get() {
       System.out.println(1111);
        return "tpl/app_dashboard_v1";
    }
}