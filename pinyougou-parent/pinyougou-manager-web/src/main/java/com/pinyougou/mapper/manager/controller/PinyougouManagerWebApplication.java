package com.pinyougou.mapper.manager.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
//(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class PinyougouManagerWebApplication {

    public static void main(String[] args) {
            SpringApplication.run(PinyougouManagerWebApplication.class, args);
        }}