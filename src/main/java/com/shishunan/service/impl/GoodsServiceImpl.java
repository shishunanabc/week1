package com.shishunan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shishunan.dao.GoodsDao;
import com.shishunan.entity.Brand;
import com.shishunan.entity.Condition;
import com.shishunan.entity.Goods;
import com.shishunan.entity.Type;
import com.shishunan.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsDao dao;

	public List<Goods> list(Condition con) {
		// TODO Auto-generated method stub
		return dao.list(con);
	}

	public List<Type> ty() {
		// TODO Auto-generated method stub
		return dao.ty();
	}

	public List<Brand> bd() {
		// TODO Auto-generated method stub
		return dao.bd();
	}

	public void add(Goods goods, String bd, String te) {
		// TODO Auto-generated method stub
		dao.addg(goods);
		dao.addt(goods.getId(),bd,te);
	}
}
