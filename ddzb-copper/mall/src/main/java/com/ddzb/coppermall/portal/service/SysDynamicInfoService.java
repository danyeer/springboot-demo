package com.ddzb.coppermall.portal.service;

import com.ddzb.coppermall.portal.dto.PageParam;
import com.ddzb.coppermall.portal.vo.SysDynamic1Vo;
import com.ddzb.coppermall.portal.vo.SysDynamic2Vo;

import java.util.List;

public interface SysDynamicInfoService {
    /**
     * 获取媒体数据
     * @param param
     * @return
     */
    List<SysDynamic1Vo> getDynamic1List(PageParam param);

    /**
     * 获取公告信息
     * @param param
     * @return
     */
    List<SysDynamic2Vo> getDynamic2List(PageParam param);
}
