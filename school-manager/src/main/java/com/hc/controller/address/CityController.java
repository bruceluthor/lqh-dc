package com.hc.controller.address;

import com.hc.model.City;
import com.hc.service.CityService;
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
@RequestMapping(value = "/city")
public class CityController {
    @Resource(name = "cityService")
    CityService cityService;

    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public @ResponseBody Object insert (@RequestParam Map map){
        System.out.print(map);
        City city=new City();
        city.setCity(map.get("cityName").toString());
        city.setCityId(Integer.parseInt(map.get("cityId").toString()));
        city.setFatherId(Integer.parseInt(map.get("fatherId").toString()));
        return cityService.insert(city);
    }
    @RequestMapping(value="/getCitiesByProvinceId")
    public @ResponseBody Object getCitiesByProvinceId (@RequestParam Map map){
        return cityService.getCitiesByProvinceId(Integer.parseInt(map.get("id").toString()));
    }
    @RequestMapping(value="/delete")
    public @ResponseBody Object delete (@RequestParam Map map){
        return cityService.delete(Integer.parseInt(map.get("id").toString()));
    }
}
