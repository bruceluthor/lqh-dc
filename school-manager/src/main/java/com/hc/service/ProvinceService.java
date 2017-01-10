package com.hc.service;

import com.hc.model.Province;

import java.util.List;

/**
 * Created by lenovo on 2017/1/10.
 */
public interface ProvinceService {
    List<Province> getAll();
    int delete(int id);
    int update(Province province);
    int insert(Province province);
}
