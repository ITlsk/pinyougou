package com.pinyougou.sellergoods.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PinyougouSellergoodsServiceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PinyougouSellergoodsServiceApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(PinyougouSellergoodsServiceApplication.class, args);
    }

}
