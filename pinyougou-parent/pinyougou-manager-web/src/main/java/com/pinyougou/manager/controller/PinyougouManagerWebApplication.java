package com.pinyougou.manager.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.pinyougou")
public class PinyougouManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouManagerWebApplication.class, args);
    }

}
