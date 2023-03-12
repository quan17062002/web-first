package com.luucungquan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luucungquan.entities.sanPham;
import com.luucungquan.service.nhanVienService;
import com.luucungquan.service.sanPhamService;

@Controller
@RequestMapping("/")
public class trangChuController {
	
	@Autowired
	sanPhamService sanPhamService;

	@GetMapping("trangchu/")
	@Transactional
	public String Default(ModelMap modelMap, HttpSession httpSession) {

		if (httpSession.getAttribute("email") != null) {
			String email = (String) httpSession.getAttribute("email");

			String chuCaiDau = email.substring(0, 1);
			modelMap.addAttribute("chuCaiDau", chuCaiDau);
		}
		List<sanPham>listSanPham = sanPhamService.listSanPhamLimit(0);
	 modelMap.addAttribute("listSanPham", listSanPham);
		return "trangchu";
	}
	

}
