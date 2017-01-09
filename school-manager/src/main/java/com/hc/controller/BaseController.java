package com.hc.controller;

import com.hc.model.Admin;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping(value = "/access")
public class BaseController {
    @RequestMapping(value = "/signin",method = RequestMethod.GET)
    public @ResponseBody Object get(@RequestParam Map map) {
       System.out.println(map);
        String name=map.get("username").toString();
        String des=map.get("password").toString();
        Admin admin=new Admin();
        admin.setName(name);
        admin.setDescription(des);
        return admin;
    }
}