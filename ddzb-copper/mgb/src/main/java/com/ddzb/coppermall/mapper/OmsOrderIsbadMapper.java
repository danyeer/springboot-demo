package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.OmsOrderIsbad;
import com.ddzb.coppermall.model.OmsOrderIsbadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderIsbadMapper {
    long countByExample(OmsOrderIsbadExample example);

    int deleteByExample(OmsOrderIsbadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderIsbad record);

    int insertSelective(OmsOrderIsbad record);

    List<OmsOrderIsbad> selectByExample(OmsOrderIsbadExample example);

    OmsOrderIsbad selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderIsbad record, @Param("example") OmsOrderIsbadExample example);

    int updateByExample(@Param("record") OmsOrderIsbad record, @Param("example") OmsOrderIsbadExample example);

    int updateByPrimaryKeySelective(OmsOrderIsbad record);

    int updateByPrimaryKey(OmsOrderIsbad record);
}