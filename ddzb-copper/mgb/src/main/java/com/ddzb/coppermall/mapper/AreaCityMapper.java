package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.AreaCity;
import com.ddzb.coppermall.model.AreaCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaCityMapper {
    long countByExample(AreaCityExample example);

    int deleteByExample(AreaCityExample example);

    int deleteByPrimaryKey(Long cityId);

    int insert(AreaCity record);

    int insertSelective(AreaCity record);

    List<AreaCity> selectByExample(AreaCityExample example);

    AreaCity selectByPrimaryKey(Long cityId);

    int updateByExampleSelective(@Param("record") AreaCity record, @Param("example") AreaCityExample example);

    int updateByExample(@Param("record") AreaCity record, @Param("example") AreaCityExample example);

    int updateByPrimaryKeySelective(AreaCity record);

    int updateByPrimaryKey(AreaCity record);
}