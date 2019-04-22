package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.sellergoods.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Override
	public String testDubbo() {
		return "dubbo service is ok !";
	}

	@Override
	public String findAll() {

		return "hello dubbo";

//		return brandMapper.selectByExample(null);
	}
}
