package com.pinyougou.mapper.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.mapper.sellergoods.service.BrandService;
import com.pinyougou.pojo.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;

	@Override
	public String testDubbo() {
		return "dubbo service is ok !";
	}

	@Override
	public List<TbBrand> findAll() {

		return brandMapper.selectByExample(null);
	}
}
