package com.pinyougou.pojo;

import javax.persistence.*;

@Table(name = "tb_provinces")
public class TbProvinces {
    /**
     * 唯一ID
     */
    @Id
    private Integer id;

    /**
     * 省份ID
     */
    private String provinceid;

    /**
     * 省份名称
     */
    private String province;

    /**
     * 获取唯一ID
     *
     * @return id - 唯一ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一ID
     *
     * @param id 唯一ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取省份ID
     *
     * @return provinceid - 省份ID
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * 设置省份ID
     *
     * @param provinceid 省份ID
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * 获取省份名称
     *
     * @return province - 省份名称
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份名称
     *
     * @param province 省份名称
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}