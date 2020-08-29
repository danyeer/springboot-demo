package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.OmsOrderBatch;
import com.ddzb.coppermall.model.OmsOrderBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderBatchMapper {
    long countByExample(OmsOrderBatchExample example);

    int deleteByExample(OmsOrderBatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderBatch record);

    int insertSelective(OmsOrderBatch record);

    List<OmsOrderBatch> selectByExample(OmsOrderBatchExample example);

    OmsOrderBatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderBatch record, @Param("example") OmsOrderBatchExample example);

    int updateByExample(@Param("record") OmsOrderBatch record, @Param("example") OmsOrderBatchExample example);

    int updateByPrimaryKeySelective(OmsOrderBatch record);

    int updateByPrimaryKey(OmsOrderBatch record);
}