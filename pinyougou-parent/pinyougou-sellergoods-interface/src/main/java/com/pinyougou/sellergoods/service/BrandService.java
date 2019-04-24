package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;


/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	public String testDubbo();

	public List<TbBrand> findAll();

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	

}
