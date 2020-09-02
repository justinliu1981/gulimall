package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * é¦–é¡µä¸“é¢˜è¡¨ã€jdé¦–é¡µä¸‹é¢å¾ˆå¤šä¸“é¢˜ï¼Œæ¯ä¸ªä¸“é¢˜é“¾æŽ¥æ–°çš„é¡µé¢ï¼Œå±•ç¤ºä¸“é¢˜å•†å“ä¿¡æ¯ã€‘
 *
 * @author JustinLiu
 * @email champion1981@gmail.com
 * @date 2020-08-30 16:02:53
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

