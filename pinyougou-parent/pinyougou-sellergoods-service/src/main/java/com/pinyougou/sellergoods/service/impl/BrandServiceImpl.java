package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.sellergoods.service.BrandService;
import pojo.TbBrand;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

//	@Autowired
//	private TbBrandMapper brandMapper;

	@Override
	public String testDubbo() {
		return "dubbo service is ok !";
	}

	@Override
	public List<TbBrand> findAll() {

		return null;
	}
}
