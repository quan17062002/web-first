package com.luucungquan.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luucungquan.entities.chiTietHoaDon;
import com.luucungquan.entities.chiTietHoaDonID;
import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.gioHang;
import com.luucungquan.entities.hoaDon;
import com.luucungquan.service.chiTietHoaDonService;
import com.luucungquan.service.danhMucSanPhamService;
import com.luucungquan.service.hoaDonService;

@Controller
@RequestMapping("giohang/")
public class gioHangController {
	@Autowired
	hoaDonService hoaDonService;
	@Autowired
	chiTietHoaDonService chiTietHoaDonService;
	@Autowired
	danhMucSanPhamService danhMucSanPhamService;

	@GetMapping
	public String Default(HttpSession httpSession, ModelMap modelMap) {
		List<danhMucSanPham> danhMucSanPham = danhMucSanPhamService.danhMucSanPham();
		 modelMap.addAttribute("danhMucSanPham", danhMucSanPham);
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
		return "giohang";
	}

	@PostMapping
	public String themHoaDon(HttpSession httpSession, @RequestParam String tenKhachHang, @RequestParam String soDT,
			@RequestParam String diaChiGiaoHang, @RequestParam String phuongThucThanhToan,
			@RequestParam String ghiChu) {
	
		if (null != httpSession.getAttribute("gioHang")) {
			List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
			hoaDon hoaDon = new hoaDon();
			hoaDon.setTenKhachHang(tenKhachHang);
			hoaDon.setDiaChiGiaoHang(diaChiGiaoHang);
			hoaDon.setPhuongThucThanhToan(phuongThucThanhToan);
			hoaDon.setGhiChu(ghiChu);
			hoaDon.setSoDT(soDT);
			int id = hoaDonService.themHoaDon(hoaDon);
			if (id > 0) {
				Set<chiTietHoaDon> chiTietHoaDons = new HashSet<>();
				for (gioHang gioHang : gioList) {
					chiTietHoaDonID chiTietHoaDonID = new chiTietHoaDonID();
					chiTietHoaDonID.setMaChiTietSanPham(gioHang.getMaChiTiet());
					chiTietHoaDonID.setMaHoaDon(hoaDon.getMaHoaDon());
					chiTietHoaDon chiTietHoaDon = new chiTietHoaDon();
					chiTietHoaDon.setChiTietHoaDonID(chiTietHoaDonID);
					chiTietHoaDon.setGiaTien(gioHang.getGiaTien().toString());
					chiTietHoaDon.setSoLuong(gioHang.getSoLuong());
					chiTietHoaDonService.themChiTietHoaDon(chiTietHoaDon);
				}
			}else {
				System.out.println("them tb");
			}

		}

		return "giohang";
	}

}
