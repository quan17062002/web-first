package com.luucungquan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dangnhap/")
public class dangNhapController {
	@GetMapping
	public String Default() {
		return "dangnhap";
	}
	

	
}
