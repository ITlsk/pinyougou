package com.pinyougou.dao;

import com.pinyougou.pojo.TbBrand;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface TbBrandMapper extends Mapper<TbBrand> {

    List<TbBrand> selectByExample(Example example);
}