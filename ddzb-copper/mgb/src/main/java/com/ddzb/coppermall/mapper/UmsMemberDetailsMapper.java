package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.UmsMemberDetails;
import com.ddzb.coppermall.model.UmsMemberDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberDetailsMapper {
    long countByExample(UmsMemberDetailsExample example);

    int deleteByExample(UmsMemberDetailsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberDetails record);

    int insertSelective(UmsMemberDetails record);

    List<UmsMemberDetails> selectByExample(UmsMemberDetailsExample example);

    UmsMemberDetails selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberDetails record, @Param("example") UmsMemberDetailsExample example);

    int updateByExample(@Param("record") UmsMemberDetails record, @Param("example") UmsMemberDetailsExample example);

    int updateByPrimaryKeySelective(UmsMemberDetails record);

    int updateByPrimaryKey(UmsMemberDetails record);
}