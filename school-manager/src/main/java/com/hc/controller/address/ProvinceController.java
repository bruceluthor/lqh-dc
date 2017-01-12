package com.hc.controller.address;

import com.hc.service.ProvinceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by lenovo on 2017/1/10.
 */
@Controller
@RequestMapping(value = "/province")
public class ProvinceController {
    @Resource(name = "provinceService")
    ProvinceService provinceService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public @ResponseBody Object getAll(){
        return provinceService.getAll();
    }

    @RequestMapping(value="/tpl_province")
    public String getTpl_province (){
        return "address/province";
    }
}
