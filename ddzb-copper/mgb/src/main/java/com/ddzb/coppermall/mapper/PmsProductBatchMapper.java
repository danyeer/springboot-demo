package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.PmsProductBatch;
import com.ddzb.coppermall.model.PmsProductBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductBatchMapper {
    long countByExample(PmsProductBatchExample example);

    int deleteByExample(PmsProductBatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductBatch record);

    int insertSelective(PmsProductBatch record);

    List<PmsProductBatch> selectByExample(PmsProductBatchExample example);

    PmsProductBatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductBatch record, @Param("example") PmsProductBatchExample example);

    int updateByExample(@Param("record") PmsProductBatch record, @Param("example") PmsProductBatchExample example);

    int updateByPrimaryKeySelective(PmsProductBatch record);

    int updateByPrimaryKey(PmsProductBatch record);
}