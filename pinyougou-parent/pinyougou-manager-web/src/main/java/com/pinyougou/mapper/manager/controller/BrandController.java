package com.pinyougou.mapper.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.mapper.sellergoods.service.BrandService;
import com.pinyougou.pojo.TbBrand;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
	public List<TbBrand> findAll(){
		return brandService.findAll();
	}
	
}
