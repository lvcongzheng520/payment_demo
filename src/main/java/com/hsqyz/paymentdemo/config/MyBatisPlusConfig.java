package com.hsqyz.paymentdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatisPlus配置
 */
@Configuration
@EnableTransactionManagement // 开启事物回滚
@MapperScan("com.hsqyz.paymentdemo.mapper")
public class MyBatisPlusConfig {

}
