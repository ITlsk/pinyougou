package com.pinyougou.pojo;

import javax.persistence.*;

@Table(name = "tb_specification")
public class TbSpecification {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 名称
     */
    @Column(name = "spec_name")
    private String specName;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return spec_name - 名称
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * 设置名称
     *
     * @param specName 名称
     */
    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }
}