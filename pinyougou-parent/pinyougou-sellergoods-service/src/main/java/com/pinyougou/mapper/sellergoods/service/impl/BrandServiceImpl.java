package com.pinyougou.mapper.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.dao.TbBrandMapper;
import com.pinyougou.mapper.pojo.TbBrand;
import com.pinyougou.mapper.sellergoods.service.BrandService;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

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

		Example example = new Example(TbBrand.class);
		return brandMapper.selectByExample(example);
	}
}
