package com.shishunan.service;

import java.util.List;

import com.shishunan.entity.Brand;
import com.shishunan.entity.Condition;
import com.shishunan.entity.Goods;
import com.shishunan.entity.Type;

public interface GoodsService {

	List<Goods> list(Condition con);

	List<Type> ty();

	List<Brand> bd();

	void add(Goods goods, String bd, String te);

}
