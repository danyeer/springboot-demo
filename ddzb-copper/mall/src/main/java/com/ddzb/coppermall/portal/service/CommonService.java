package com.ddzb.coppermall.portal.service;


import com.ddzb.coppermall.model.AreaCity;
import com.ddzb.coppermall.model.AreaCounty;
import com.ddzb.coppermall.model.AreaProvince;
import com.ddzb.coppermall.model.AreaStreet;

import java.util.List;

public interface CommonService {

    List<AreaProvince> queryProvinceList();

    List<AreaCity> queryCityListByProvinceId(Long provinceId);

    List<AreaCounty> queryCountyListByCityId(Long cityId);

    List<AreaStreet> queryStreetListByCountyId(Long countyId);
}
