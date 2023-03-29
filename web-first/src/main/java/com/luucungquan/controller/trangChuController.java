package com.luucungquan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.gioHang;
import com.luucungquan.entities.sanPham;
import com.luucungquan.service.danhMucSanPhamService;
import com.luucungquan.service.sanPhamService;

@Controller
@RequestMapping("/")

public class trangChuController {
	
	@Autowired
	sanPhamService sanPhamService;
	@Autowired
	danhMucSanPhamService danhMucSanPhamService;


	@GetMapping("trangchu/")
	
	public String Default(ModelMap modelMap, HttpSession httpSession) {

		if (httpSession.getAttribute("email") != null) {
			String email = (String) httpSession.getAttribute("email");

			String chuCaiDau = email.substring(0, 1);
			modelMap.addAttribute("chuCaiDau", chuCaiDau);
		}
		if (null != httpSession.getAttribute("gioHang")) {
			List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
			modelMap.addAttribute("soLuongSanPham", lisGioHangs.size());
			modelMap.addAttribute("lisGioHangs", lisGioHangs);
		}
		List<sanPham>listSanPham = sanPhamService.listSanPhamLimit(-1);
	 modelMap.addAttribute("listSanPham", listSanPham);
	 List<danhMucSanPham> danhMucSanPham = danhMucSanPhamService.danhMucSanPham();
	 modelMap.addAttribute("danhMucSanPham", danhMucSanPham);
		return "trangchu";
	}
	

}
