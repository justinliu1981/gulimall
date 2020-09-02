package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1l);
		brandEntity.setDescript("苹果手机iPhone11");
//		brandEntity.setName("苹果");
//		brandService.save(brandEntity);
//		brandService.updateById(brandEntity);
		List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq( "brand_id", 1L ));
		brandEntities.forEach((item)->{
			System.out.println("brandEntity is ......." + item);
		});

	}

}
