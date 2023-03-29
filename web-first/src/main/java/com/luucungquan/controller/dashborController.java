package com.luucungquan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashbor/")
public class dashborController {
	
	@GetMapping
	public String Default() {
		return "dashbor";
	}

}
