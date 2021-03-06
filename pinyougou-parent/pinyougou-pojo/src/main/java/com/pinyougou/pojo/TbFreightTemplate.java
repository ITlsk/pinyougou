package com.pinyougou.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_freight_template")
public class TbFreightTemplate {
    @Id
    private Long id;

    /**
     * 商家ID
     */
    @Column(name = "seller_id")
    private String sellerId;

    /**
     * 是否默认   （‘Y’是   'N'否）
     */
    @Column(name = "is_default")
    private String isDefault;

    /**
     * 模版名称
     */
    private String name;

    /**
     * 发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）
     */
    @Column(name = "send_time_type")
    private String sendTimeType;

    /**
     * 统一价格
     */
    private Long price;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商家ID
     *
     * @return seller_id - 商家ID
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * 设置商家ID
     *
     * @param sellerId 商家ID
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * 获取是否默认   （‘Y’是   'N'否）
     *
     * @return is_default - 是否默认   （‘Y’是   'N'否）
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认   （‘Y’是   'N'否）
     *
     * @param isDefault 是否默认   （‘Y’是   'N'否）
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * 获取模版名称
     *
     * @return name - 模版名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置模版名称
     *
     * @param name 模版名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）
     *
     * @return send_time_type - 发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）
     */
    public String getSendTimeType() {
        return sendTimeType;
    }

    /**
     * 设置发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）
     *
     * @param sendTimeType 发货时间（1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ）
     */
    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType == null ? null : sendTimeType.trim();
    }

    /**
     * 获取统一价格
     *
     * @return price - 统一价格
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置统一价格
     *
     * @param price 统一价格
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}