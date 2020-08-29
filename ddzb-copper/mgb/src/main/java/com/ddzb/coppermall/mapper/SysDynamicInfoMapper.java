package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.SysDynamicInfo;
import com.ddzb.coppermall.model.SysDynamicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDynamicInfoMapper {
    long countByExample(SysDynamicInfoExample example);

    int deleteByExample(SysDynamicInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDynamicInfo record);

    int insertSelective(SysDynamicInfo record);

    List<SysDynamicInfo> selectByExampleWithBLOBs(SysDynamicInfoExample example);

    List<SysDynamicInfo> selectByExample(SysDynamicInfoExample example);

    SysDynamicInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDynamicInfo record, @Param("example") SysDynamicInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SysDynamicInfo record, @Param("example") SysDynamicInfoExample example);

    int updateByExample(@Param("record") SysDynamicInfo record, @Param("example") SysDynamicInfoExample example);

    int updateByPrimaryKeySelective(SysDynamicInfo record);

    int updateByPrimaryKeyWithBLOBs(SysDynamicInfo record);

    int updateByPrimaryKey(SysDynamicInfo record);
}