package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.service.BrandService;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import org.springframework.context.annotation.ComponentScan;
>>>>>>> e81f3bd4be7bfc6bb312a0bbe355caa92376f8c3
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;

	@RequestMapping("/test")
	public String testDubbo(){
		return brandService.testDubbo();
	}

	@RequestMapping("/findAll")
	public String findAll(){
		return brandService.sayHello();
	}
	
}
