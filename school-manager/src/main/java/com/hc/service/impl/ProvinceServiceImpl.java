package com.hc.service.impl;

import com.hc.dao.ProvinceMapper;
import com.hc.model.Province;
import com.hc.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/1/10.
 */
@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
    @Resource(name = "provinceMapper")
    ProvinceMapper provinceMapper;

    public List<Province> getAll() {
        return provinceMapper.getAll();
    }

    public int delete(int id) {
        return provinceMapper.deleteByPrimaryKey(id);
    }

    public int update(Province province) {
        return provinceMapper.updateByPrimaryKeySelective(province);
    }

    public int insert(Province province) {
        return provinceMapper.insertSelective(province);
    }
}
