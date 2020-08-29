package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.SysOperationLog;
import com.ddzb.coppermall.model.SysOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOperationLogMapper {
    long countByExample(SysOperationLogExample example);

    int deleteByExample(SysOperationLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOperationLog record);

    int insertSelective(SysOperationLog record);

    List<SysOperationLog> selectByExample(SysOperationLogExample example);

    SysOperationLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOperationLog record, @Param("example") SysOperationLogExample example);

    int updateByExample(@Param("record") SysOperationLog record, @Param("example") SysOperationLogExample example);

    int updateByPrimaryKeySelective(SysOperationLog record);

    int updateByPrimaryKey(SysOperationLog record);
}