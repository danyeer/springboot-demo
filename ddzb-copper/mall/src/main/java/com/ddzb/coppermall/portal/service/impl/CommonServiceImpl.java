package com.ddzb.coppermall.portal.service.impl;

import com.ddzb.coppermall.mapper.AreaCityMapper;
import com.ddzb.coppermall.mapper.AreaCountyMapper;
import com.ddzb.coppermall.mapper.AreaProvinceMapper;
import com.ddzb.coppermall.mapper.AreaStreetMapper;
import com.ddzb.coppermall.model.*;
import com.ddzb.coppermall.portal.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private AreaProvinceMapper provinceMapper;

    @Autowired
    private AreaCityMapper cityMapper;

    @Autowired
    private AreaCountyMapper countyMapper;

    @Autowired
    private AreaStreetMapper streetMapper;


    @Override
    public List<AreaProvince> queryProvinceList() {
        List<Long> ids = new ArrayList<>();
        ids.add(32L);
        ids.add(33L);
        ids.add(34L);
        AreaProvinceExample example = new AreaProvinceExample();
        example.createCriteria().andProvinceIdNotIn(ids);
        return provinceMapper.selectByExample(example);
    }

    @Override
    public List<AreaCity> queryCityListByProvinceId(Long provinceId) {
        AreaCityExample example = new AreaCityExample();
        example.createCriteria().andProvinceIdEqualTo(provinceId);
        return cityMapper.selectByExample(example);
    }

    @Override
    public List<AreaCounty> queryCountyListByCityId(Long cityId) {
        AreaCountyExample example = new AreaCountyExample();
        example.createCriteria().andCityIdEqualTo(cityId);
        return countyMapper.selectByExample(example);
    }

    @Override
    public List<AreaStreet> queryStreetListByCountyId(Long countyId) {
        AreaStreetExample example = new AreaStreetExample();
        example.createCriteria().andCounryIdEqualTo(countyId);
        return streetMapper.selectByExample(example);
    }

}
