package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.AreaCounty;
import com.ddzb.coppermall.model.AreaCountyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaCountyMapper {
    long countByExample(AreaCountyExample example);

    int deleteByExample(AreaCountyExample example);

    int deleteByPrimaryKey(Long countyId);

    int insert(AreaCounty record);

    int insertSelective(AreaCounty record);

    List<AreaCounty> selectByExample(AreaCountyExample example);

    AreaCounty selectByPrimaryKey(Long countyId);

    int updateByExampleSelective(@Param("record") AreaCounty record, @Param("example") AreaCountyExample example);

    int updateByExample(@Param("record") AreaCounty record, @Param("example") AreaCountyExample example);

    int updateByPrimaryKeySelective(AreaCounty record);

    int updateByPrimaryKey(AreaCounty record);
}