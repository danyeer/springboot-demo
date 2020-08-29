package com.ddzb.coppermall.portal.dao;

import com.ddzb.coppermall.portal.vo.SysDynamic1Vo;
import com.ddzb.coppermall.portal.vo.SysDynamic2Vo;

import java.util.List;

public interface SysDynamicInfoDao {

    List<SysDynamic1Vo> queryDynamic1List();
    List<SysDynamic2Vo> queryDynamic2List();
}
