package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * è®¢å•é€€è´§ç”³è¯·
 * 
 * @author JustinLiu
 * @email champion1981@gmail.com
 * @date 2020-08-30 16:35:22
 */
@Data
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long orderId;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private String orderSn;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private String memberUsername;
	/**
	 * $column.comments
	 */
	private BigDecimal returnAmount;
	/**
	 * $column.comments
	 */
	private String returnName;
	/**
	 * $column.comments
	 */
	private String returnPhone;
	/**
	 * $column.comments
	 */
	private Integer status;
	/**
	 * $column.comments
	 */
	private Date handleTime;
	/**
	 * $column.comments
	 */
	private String skuImg;
	/**
	 * $column.comments
	 */
	private String skuName;
	/**
	 * $column.comments
	 */
	private String skuBrand;
	/**
	 * $column.comments
	 */
	private String skuAttrsVals;
	/**
	 * $column.comments
	 */
	private Integer skuCount;
	/**
	 * $column.comments
	 */
	private BigDecimal skuPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal skuRealPrice;
	/**
	 * $column.comments
	 */
	private String reason;
	/**
	 * $column.comments
	 */
	private String description;
	/**
	 * $column.comments
	 */
	private String descPics;
	/**
	 * $column.comments
	 */
	private String handleNote;
	/**
	 * $column.comments
	 */
	private String handleMan;
	/**
	 * $column.comments
	 */
	private String receiveMan;
	/**
	 * $column.comments
	 */
	private Date receiveTime;
	/**
	 * $column.comments
	 */
	private String receiveNote;
	/**
	 * $column.comments
	 */
	private String receivePhone;
	/**
	 * $column.comments
	 */
	private String companyAddress;

}
