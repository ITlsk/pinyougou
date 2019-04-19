package com.pinyougou.manager.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
<<<<<<< HEAD
public class PinyougouManagerWebApplication{
=======
@ComponentScan("com.pinyougou")
public class PinyougouManagerWebApplication {
>>>>>>> e81f3bd4be7bfc6bb312a0bbe355caa92376f8c3

    /**
     * lsk
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PinyougouManagerWebApplication.class, args);
    }

}
