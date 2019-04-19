package com.pinyougou.manager.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan("com.pinyougou")
public class PinyougouManagerWebApplication {


        /**
         * lsk
         *
         * @param args
         */
        public static void main(String[] args) {
            SpringApplication.run(PinyougouManagerWebApplication.class, args);
        }

    }