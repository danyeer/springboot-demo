package com.ddzb.coppermall.portal.service;


import com.ddzb.coppermall.model.SysDictionary;
import com.ddzb.coppermall.portal.dto.SysDictionaryParam;
import com.ddzb.coppermall.portal.dto.SysDictionaryQuery2Param;
import com.ddzb.coppermall.portal.dto.SysDictionaryQueryParam;

import java.util.List;
import java.util.Map;

public interface SysDictionaryService {
    List<SysDictionary> querySysDictionaryList(SysDictionaryQueryParam dictionaryParam, Integer pageNum, Integer pageSize);

    boolean saveSysDictionary(SysDictionaryParam dictionaryParam);

    boolean updateSysDictionary(SysDictionaryParam dictionaryParam);

    Map<String, String> deleteSysDictionary(SysDictionaryParam dictionaryParam);

    SysDictionary querySysDictionaryById(SysDictionaryParam dictionaryParam);

    Map<String, String> codeNameVerification(SysDictionaryParam dictionaryParam);

    /**
     * 查询所有父节点
     * @return
     */
    List<SysDictionary> dictionaryQueryParent();

    List<SysDictionary> queryDictionaryByParentCode(SysDictionaryQuery2Param param);
}
