package com.luucungquan.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.luucungquan.entities.chiTietSanPham;
import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.gioHang;
import com.luucungquan.entities.sanPham;
import com.luucungquan.service.danhMucSanPhamService;
import com.luucungquan.service.sanPhamService;

@Controller
@RequestMapping("chitietsanpham/")
@SessionAttributes({"gioHang","email"})
public class chiTietSanPhamController {
	@Autowired
	sanPhamService sanPhamService;
	@Autowired
	danhMucSanPhamService danhMucSanPhamService;

	@GetMapping("{maSanPham}")
	public String Default(ModelMap modelMap, HttpSession httpSession, @PathVariable int maSanPham) {

		if (httpSession.getAttribute("email") != null) {
			String email = (String) httpSession.getAttribute("email");

			String chuCaiDau = email.substring(0, 1);
			modelMap.addAttribute("chuCaiDau", chuCaiDau);
		}

		sanPham sanPham = sanPhamService.layChiTietSanPham(maSanPham);
		modelMap.addAttribute("sanPham", sanPham);
		List<chiTietSanPham> chiTietSanPham = sanPhamService.chiTietSanPham(maSanPham);
		List<danhMucSanPham> danhMucSanPham = danhMucSanPhamService.danhMucSanPham();
		modelMap.addAttribute("chiTietSanPham", chiTietSanPham);
		modelMap.addAttribute("danhMucSanPham", danhMucSanPham);
		if (null != httpSession.getAttribute("gioHang")) {
			List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
			modelMap.addAttribute("soLuongSanPham", lisGioHangs.size());
		}

	
		
		return "chitietsanpham";
	}
	

}
