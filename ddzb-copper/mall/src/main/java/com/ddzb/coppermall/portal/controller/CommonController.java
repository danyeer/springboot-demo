package com.ddzb.coppermall.portal.controller;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.model.AreaCity;
import com.ddzb.coppermall.model.AreaCounty;
import com.ddzb.coppermall.model.AreaProvince;
import com.ddzb.coppermall.model.AreaStreet;
import com.ddzb.coppermall.portal.service.CommonService;
import com.ddzb.coppermall.portal.service.CommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 公用的类
 */
@Controller
@RequestMapping("/common")
@Api(tags = "00公用工具", description = "公用工具")
public class CommonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonController.class);
    @Autowired
    private CommonService commonService;

    @ApiOperation("获取省份")
    @RequestMapping(value = "/queryProvinceList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryProvinceList() {
        List<AreaProvince> provinces = commonService.queryProvinceList();
        return CommonResult.success(provinces);
    }

    @ApiOperation("获取市列表")
    @RequestMapping(value = "/queryCityList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryCityList(Long provinceId) {
        if (StringUtils.isEmpty(provinceId))
            return CommonResult.validateFailed("ID IS NULL");
        List<AreaCity> cities = commonService.queryCityListByProvinceId(provinceId);
        return CommonResult.success(cities);
    }

    @ApiOperation("获取区县列表")
    @RequestMapping(value = "/queryCountyList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryCountyList(Long cityId) {
        if (StringUtils.isEmpty(cityId))
            return CommonResult.validateFailed("ID IS NULL");
        List<AreaCounty> counties = commonService.queryCountyListByCityId(cityId);
        return CommonResult.success(counties);
    }

    @ApiOperation("获取街道列表")
    @RequestMapping(value = "/queryStreetList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryStreetList(Long countyId) {
        if (StringUtils.isEmpty(countyId))
            return CommonResult.validateFailed("ID IS NULL");
        List<AreaStreet> streets = commonService.queryStreetListByCountyId(countyId);
        return CommonResult.success(streets);
    }

}
