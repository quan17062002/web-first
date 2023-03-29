package com.luucungquan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.mauSanPham;
import com.luucungquan.entities.sanPham;
import com.luucungquan.entities.sizeSanPham;
import com.luucungquan.service.danhMucSanPhamService;
import com.luucungquan.service.mauSanPhamService;
import com.luucungquan.service.sanPhamService;
import com.luucungquan.service.sizeSanPhamService;

@Controller
@RequestMapping("themsanpham/")
public class themSanPhamController {
	@Autowired
	sanPhamService sanPhamService;
	@Autowired
	danhMucSanPhamService danhMucSanPhamService;
	@Autowired
	mauSanPhamService mauSanPhamService;
	@Autowired
	sizeSanPhamService sizeSanPhamService;

	@GetMapping
	public String Default(ModelMap modelMap) {
		List<sanPham> lisPhams = (List<sanPham>) sanPhamService.listSanPhamLimit(0);
		List<sanPham>lisPhams2 = (List<sanPham>) sanPhamService.listSanPhamLimit(-1);
		double tongSanPham = Math.ceil((double)lisPhams2.size()/5);
		modelMap.addAttribute("lisPhams", lisPhams);
		modelMap.addAttribute("lisPhams2", lisPhams2);
		modelMap.addAttribute("tongSanPham", tongSanPham);
		 List<danhMucSanPham> danhMucSanPham = danhMucSanPhamService.danhMucSanPham();
		 modelMap.addAttribute("danhMucSanPham", danhMucSanPham);
		  List<mauSanPham>lisMauSanPhams = mauSanPhamService.layDanhSachMauSanPham();
		  modelMap.addAttribute("danhSachMauSanPham", lisMauSanPhams);
		  List<sizeSanPham> lisSizeSanPhams = sizeSanPhamService.layDanhSachSize();
		  modelMap.addAttribute("laySizeSanPham", lisSizeSanPhams);
		return "themsanpham";
	}

}
