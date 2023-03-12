package com.luucungquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.luucungquan.service.nhanVienService;

@Controller
@RequestMapping("/api")
@SessionAttributes("email")
public class apiController {
	@Autowired
	nhanVienService nhanVienService;

	@GetMapping
	@Transactional
	@ResponseBody
	public String kiemTraDangNhap(@RequestParam String email, @RequestParam String matKhau, ModelMap modelMap) {
		boolean kiemTra = nhanVienService.kiemTraDangNhap(email, matKhau);
		modelMap.addAttribute("email", email);

		return ""+kiemTra;
	}
}
