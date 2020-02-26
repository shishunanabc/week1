package com.shishunan.entity;

public class Condition {
	private String tname;
	private String bname;
	private Double p1;
	private Double p2;
	private String name;
	private String ename;
	private String biaoqian;
	public Condition() {
		super();
	}
	public Condition(String tname, String bname, Double p1, Double p2, String name, String ename, String biaoqian) {
		super();
		this.tname = tname;
		this.bname = bname;
		this.p1 = p1;
		this.p2 = p2;
		this.name = name;
		this.ename = ename;
		this.biaoqian = biaoqian;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
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
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	@Override
	public String toString() {
		return "Condition [tname=" + tname + ", bname=" + bname + ", p1=" + p1 + ", p2=" + p2 + ", name=" + name
				+ ", ename=" + ename + ", biaoqian=" + biaoqian + "]";
	}
	
}
