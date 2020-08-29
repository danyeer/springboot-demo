package com.ddzb.coppermall.portal.service.impl;

import com.ddzb.coppermall.portal.dao.SysDynamicInfoDao;
import com.ddzb.coppermall.portal.dto.PageParam;
import com.ddzb.coppermall.portal.service.SysDynamicInfoService;
import com.ddzb.coppermall.portal.vo.SysDynamic1Vo;
import com.ddzb.coppermall.portal.vo.SysDynamic2Vo;
import com.github.pagehelper.PageHelper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDynamicInfoServiceImpl implements SysDynamicInfoService {
    @Autowired
    SysDynamicInfoDao sysDynamicInfoDao;

    @Override
    public List<SysDynamic1Vo> getDynamic1List(PageParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return sysDynamicInfoDao.queryDynamic1List();
    }

    @Override
    public List<SysDynamic2Vo> getDynamic2List(PageParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return sysDynamicInfoDao.queryDynamic2List();
    }
}
