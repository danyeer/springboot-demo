package com.ddzb.coppermall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.ddzb.coppermall.mapper","com.ddzb.coppermall.portal.dao"})
public class MyBatisConfig {
}
