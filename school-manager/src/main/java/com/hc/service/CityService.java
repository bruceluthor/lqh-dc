package com.hc.service;

import com.hc.model.City;

import java.util.List;

/**
 * Created by lenovo on 2017/1/10.
 */
public interface CityService {
    List<City> getCitiesByProvinceId(int id);
    int delete(int id);
    int update(City city);
    int insert(City city);
}
