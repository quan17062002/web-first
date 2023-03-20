package com.luucungquan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.sanPham;
import com.luucungquan.service.danhMucSanPhamService;
import com.luucungquan.service.sanPhamService;

@Controller
@RequestMapping("/sanpham")
public class sanPhamController {
	@Autowired 
	sanPhamService sanPhamService;
	
	@Autowired
	danhMucSanPhamService danhMucSanPhamService;

	
	@GetMapping("/{id}/{tenDanhMuc}")
	public String Default( ModelMap modelMap,@PathVariable int id,@PathVariable String tenDanhMuc) {
		 List<danhMucSanPham> danhMucSanPham = danhMucSanPhamService.danhMucSanPham();
		 modelMap.addAttribute("danhMucSanPham", danhMucSanPham);
		  List<sanPham> lisSanPhams = sanPhamService.laySanPhamTheoMaDanhMuc(id);
		 modelMap.addAttribute("tenDanhMuc", tenDanhMuc);
		 modelMap.addAttribute("listSanPham", lisSanPhams);
		return "sanpham";
	}

}
