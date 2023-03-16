package com.luucungquan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luucungquan.entities.gioHang;

@Controller
@RequestMapping("giohang/")
public class gioHangController {
	 @GetMapping
	public String Default(HttpSession httpSession, ModelMap modelMap) {
		 if (null != httpSession.getAttribute("gioHang")) {
				List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
				modelMap.addAttribute("soLuongSanPham", lisGioHangs.size());
				modelMap.addAttribute("lisGioHangs", lisGioHangs);
			}
		return "giohang";
	}

}
