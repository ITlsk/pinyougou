package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.sellergoods.service.BrandService;
<<<<<<< HEAD
=======
import com.pinyougou.mapper.TbBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.TbBrand;

import java.util.List;
>>>>>>> e81f3bd4be7bfc6bb312a0bbe355caa92376f8c3

@Service
public class BrandServiceImpl implements BrandService {

<<<<<<< HEAD
	@Override
	public String sayHello() {
		return "hello dubbo";
=======
//	@Autowired
//	private TbBrandMapper brandMapper;

	@Override
	public String testDubbo() {
		return "dubbo service is ok !";
	}

	@Override
	public List<TbBrand> findAll() {

		return null;
>>>>>>> e81f3bd4be7bfc6bb312a0bbe355caa92376f8c3
	}
}
