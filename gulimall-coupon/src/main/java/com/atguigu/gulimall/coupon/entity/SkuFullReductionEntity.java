package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * å•†å“æ»¡å‡ä¿¡æ¯
 * 
 * @author JustinLiu
 * @email champion1981@gmail.com
 * @date 2020-08-30 16:02:53
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private BigDecimal fullPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal reducePrice;
	/**
	 * $column.comments
	 */
	private Integer addOther;

}
