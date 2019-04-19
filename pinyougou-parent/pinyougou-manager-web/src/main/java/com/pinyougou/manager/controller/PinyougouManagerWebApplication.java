package com.pinyougou.manager.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
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