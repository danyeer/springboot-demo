package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.AreaStreet;
import com.ddzb.coppermall.model.AreaStreetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaStreetMapper {
    long countByExample(AreaStreetExample example);

    int deleteByExample(AreaStreetExample example);

    int deleteByPrimaryKey(Long streetId);

    int insert(AreaStreet record);

    int insertSelective(AreaStreet record);

    List<AreaStreet> selectByExample(AreaStreetExample example);

    AreaStreet selectByPrimaryKey(Long streetId);

    int updateByExampleSelective(@Param("record") AreaStreet record, @Param("example") AreaStreetExample example);

    int updateByExample(@Param("record") AreaStreet record, @Param("example") AreaStreetExample example);

    int updateByPrimaryKeySelective(AreaStreet record);

    int updateByPrimaryKey(AreaStreet record);
}