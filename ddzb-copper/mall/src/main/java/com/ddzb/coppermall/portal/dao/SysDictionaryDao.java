package com.ddzb.coppermall.portal.dao;

import com.ddzb.coppermall.model.SysDictionary;

import java.util.List;

public interface SysDictionaryDao {

    List<SysDictionary> selectDictionaryByParent();
}
