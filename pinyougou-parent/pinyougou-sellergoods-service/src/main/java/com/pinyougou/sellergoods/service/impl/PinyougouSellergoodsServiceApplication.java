package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@MapperScan(basePackages = "com.pinyougou.mapper")
//@DubboComponentScan("com.pinyougou")
//@EnableTransactionManagement
//@ComponentScan("com.pinyougou")
@EnableTransactionManagement
@SpringBootApplication
@EnableAutoConfiguration
public class PinyougouSellergoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouSellergoodsServiceApplication.class, args);
    }

}
