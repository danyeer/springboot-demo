package com.ddzb.coppermall.portal.dao;

import com.ddzb.coppermall.portal.vo.UmsMemberDetailsVo;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberDao {
    UmsMemberDetailsVo selectUserInfo(@Param("id") Long id);
}
