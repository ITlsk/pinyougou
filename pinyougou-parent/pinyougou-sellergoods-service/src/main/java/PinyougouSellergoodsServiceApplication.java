<<<<<<< HEAD:pinyougou-parent/pinyougou-sellergoods-service/src/main/java/PinyougouSellergoodsServiceApplication.java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
=======
package com.pinyougou.sellergoods.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
>>>>>>> e81f3bd4be7bfc6bb312a0bbe355caa92376f8c3:pinyougou-parent/pinyougou-sellergoods-service/src/main/java/com/pinyougou/sellergoods/service/impl/PinyougouSellergoodsServiceApplication.java

@ComponentScan("com.pinyougou")
@SpringBootApplication
//@MapperScan("com.pinyougou")
public class PinyougouSellergoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouSellergoodsServiceApplication.class, args);
    }

}
