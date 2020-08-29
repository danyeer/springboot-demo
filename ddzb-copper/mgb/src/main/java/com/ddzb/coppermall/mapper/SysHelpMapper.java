package com.ddzb.coppermall.mapper;

import com.ddzb.coppermall.model.SysHelp;
import com.ddzb.coppermall.model.SysHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysHelpMapper {
    long countByExample(SysHelpExample example);

    int deleteByExample(SysHelpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysHelp record);

    int insertSelective(SysHelp record);

    List<SysHelp> selectByExampleWithBLOBs(SysHelpExample example);

    List<SysHelp> selectByExample(SysHelpExample example);

    SysHelp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysHelp record, @Param("example") SysHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") SysHelp record, @Param("example") SysHelpExample example);

    int updateByExample(@Param("record") SysHelp record, @Param("example") SysHelpExample example);

    int updateByPrimaryKeySelective(SysHelp record);

    int updateByPrimaryKeyWithBLOBs(SysHelp record);

    int updateByPrimaryKey(SysHelp record);
}