package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.AreaProvince;
import com.ddzb.coppermall.model.AreaProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaProvinceMapper {
    long countByExample(AreaProvinceExample example);

    int deleteByExample(AreaProvinceExample example);

    int deleteByPrimaryKey(Long provinceId);

    int insert(AreaProvince record);

    int insertSelective(AreaProvince record);

    List<AreaProvince> selectByExample(AreaProvinceExample example);

    AreaProvince selectByPrimaryKey(Long provinceId);

    int updateByExampleSelective(@Param("record") AreaProvince record, @Param("example") AreaProvinceExample example);

    int updateByExample(@Param("record") AreaProvince record, @Param("example") AreaProvinceExample example);

    int updateByPrimaryKeySelective(AreaProvince record);

    int updateByPrimaryKey(AreaProvince record);
}