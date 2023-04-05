package com.luucungquan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luucungquan.entities.chiTietHoaDon;
import com.luucungquan.service.chiTietHoaDonService;

@Controller
@RequestMapping("/hoadon")
public class hoaDonController {
	@Autowired
	chiTietHoaDonService chiTietHoaDonService;
	
	
	@GetMapping
	 public String Default(ModelMap modelMap) {
		List<chiTietHoaDon>chiTietHoaDons = chiTietHoaDonService.hoaDons();
		modelMap.addAttribute("chitiethoadon", chiTietHoaDons);
		System.out.println(chiTietHoaDons);
		 return "hoadon";
	 }
	
	}


