package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * é¦–é¡µä¸“é¢˜è¡¨ã€jdé¦–é¡µä¸‹é¢å¾ˆå¤šä¸“é¢˜ï¼Œæ¯ä¸ªä¸“é¢˜é“¾æŽ¥æ–°çš„é¡µé¢ï¼Œå±•ç¤ºä¸“é¢˜å•†å“ä¿¡æ¯ã€‘
 * 
 * @author JustinLiu
 * @email champion1981@gmail.com
 * @date 2020-08-30 16:02:53
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private String name;
	/**
	 * $column.comments
	 */
	private String title;
	/**
	 * $column.comments
	 */
	private String subTitle;
	/**
	 * $column.comments
	 */
	private Integer status;
	/**
	 * $column.comments
	 */
	private String url;
	/**
	 * $column.comments
	 */
	private Integer sort;
	/**
	 * $column.comments
	 */
	private String img;

}
