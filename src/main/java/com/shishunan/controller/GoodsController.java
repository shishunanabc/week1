package com.shishunan.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shishunan.entity.Brand;
import com.shishunan.entity.Condition;
import com.shishunan.entity.Goods;
import com.shishunan.entity.Type;
import com.shishunan.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list.do")
	public String list(Model m,@RequestParam(defaultValue = "1")int pageNum,Condition con) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> list=service.list(con);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		m.addAttribute("list", list);
		m.addAttribute("pg", page);
		m.addAttribute("con", con);
		return "list";
	}
	
	@RequestMapping("type.do")
	@ResponseBody
	public List<Type> ty(){
		return service.ty();
	}
	
	@RequestMapping("brand.do")
	@ResponseBody
	public List<Brand> bd(){
		return service.bd();
	}
	
	@RequestMapping("add.do")
	public String add(Goods goods,@RequestParam("f")MultipartFile file,String bd,String te) throws IllegalStateException, IOException {
		System.out.println(goods);
		System.out.println(bd);
		System.out.println(te);
		if (file.getSize()>0) {
			String path="D:\\img";
			String filename = file.getOriginalFilename();
			File file2=new File(path, filename);
			file.transferTo(file2);
			goods.setPic("/img/"+filename);
		}
		service.add(goods,bd,te);
		return "redirect:list.do";
	}
}
