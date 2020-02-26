package com.shishunan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shishunan.entity.Brand;
import com.shishunan.entity.Condition;
import com.shishunan.entity.Goods;
import com.shishunan.entity.Type;

public interface GoodsDao {

	List<Goods> list(Condition con);
	@Select("select * from type")
	List<Type> ty();
	@Select("select * from brand")
	List<Brand> bd();
	void addg(Goods goods);
	void addt(@Param("id")Integer id, @Param("bd")String bd, @Param("te")String te);

}
