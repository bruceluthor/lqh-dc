package com.hc.service.impl;

import com.hc.dao.CityMapper;
import com.hc.model.City;
import com.hc.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/1/10.
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource(name = "cityMapper")
    CityMapper cityMapper;
    public List<City> getCitiesByProvinceId(int id) {
        return cityMapper.getCitiesByProvinceId(id);
    }

    public int delete(int id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    public int update(City city) {
        return cityMapper.updateByPrimaryKeySelective(city);
    }

    public int insert(City city) {
        return cityMapper.insertSelective(city);
    }
}
