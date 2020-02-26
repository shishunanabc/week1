package com.shishunan.entity;

import java.util.List;

public class Goods {
	private Integer id;
	private String name;
	private String ename;
	private Integer size;
	private Double price;
	private Integer num;
	private String biaoqian;
	private String pic;
	private List<Type> types;
	private List<Brand> brands;
	public Goods() {
		super();
	}
	public Goods(Integer id, String name, String ename, Integer size, Double price, Integer num, String biaoqian,
			String pic, List<Type> types, List<Brand> brands) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.num = num;
		this.biaoqian = biaoqian;
		this.pic = pic;
		this.types = types;
		this.brands = brands;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public List<Brand> getBrands() {
		return brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", ename=" + ename + ", size=" + size + ", price=" + price
				+ ", num=" + num + ", biaoqian=" + biaoqian + ", pic=" + pic + ", types=" + types + ", brands=" + brands
				+ "]";
	}
	
}
