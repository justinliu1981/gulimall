package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * ä¼˜æƒ åˆ¸ä¿¡æ¯
 *
 * @author JustinLiu
 * @email champion1981@gmail.com
 * @date 2020-08-30 16:02:53
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

