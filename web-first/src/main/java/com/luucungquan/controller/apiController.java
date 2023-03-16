package com.luucungquan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.luucungquan.entities.gioHang;
import com.luucungquan.entities.mauSanPham;
import com.luucungquan.service.nhanVienService;

@Controller
@RequestMapping("/api")
@SessionAttributes({ "email", "gioHang" })
public class apiController {
	@Autowired
	nhanVienService nhanVienService;
	@GetMapping("dangnhap")
	@ResponseBody
	public String kiemTraDangNhap(@RequestParam String email, @RequestParam String matKhau, ModelMap modelMap) {
		boolean kiemTra = nhanVienService.kiemTraDangNhap(email, matKhau);
		modelMap.addAttribute("email", email);

		return "" + kiemTra;
	}

	@GetMapping("themGioHang")
	@ResponseBody
	public void themGioHang(@RequestParam int maSanPham, @RequestParam int maSize, @RequestParam int maMau,
			@RequestParam String tenSanPham, @RequestParam String giaTien, @RequestParam String tenMau,
			@RequestParam String tenSize, @RequestParam int soLuong, HttpSession httpSession) {
	if(  httpSession.getAttribute("gioHang")== null) {
			List<gioHang> listGioHangs = new ArrayList<>();
			gioHang gioHang = new gioHang();
			gioHang.setMaSanPham(maSanPham);
			gioHang.setMaSize(maSize);
			gioHang.setMaMau(maMau);
			gioHang.setTenSanPham(tenSanPham);
			gioHang.setGiaTien(giaTien);
			gioHang.setTenMau(tenMau);
			gioHang.setTenSize(tenSize);
			gioHang.setSoLuong(1);
			listGioHangs.add(gioHang);
			httpSession.setAttribute("gioHang", listGioHangs);
			
		

		}else {
			int viTri = kiemTraSanPhamDaTonTaiGioHang(httpSession, maSanPham, maSize, maMau);
		  if ( viTri == - 1) {
			  List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
			  gioHang gioHang = new gioHang();
				gioHang.setMaSanPham(maSanPham);
				gioHang.setMaSize(maSize);
				gioHang.setMaMau(maMau);
				gioHang.setTenSanPham(tenSanPham);
				gioHang.setGiaTien(giaTien);
				gioHang.setTenMau(tenMau);
				gioHang.setTenSize(tenSize);
				gioHang.setSoLuong(1);
				gioList.add(gioHang);
			
		  }else {
			  List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
			  int soLuongMoi = gioList.get(viTri).getSoLuong()+1;
			  gioList .get(viTri).setSoLuong(soLuongMoi);
		  }
		  List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
		  for (gioHang gioHang : gioList) {
			System.out.println(gioHang.getTenSanPham()+"-"+gioHang.getSoLuong());
		}
		  
		}
	}
	private int kiemTraSanPhamDaTonTaiGioHang( HttpSession httpSession,int maSanPham, int maSize, int maMau) {
		List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
		for (int i = 0; i < gioList.size(); i++) {
			if(gioList.get(i).getMaSanPham()==maSanPham &&gioList.get(i).getMaSize()==maSize&&gioList.get(i).getMaMau()==maMau) {
				return i;
			}
		}
		return -1;
	}
	@GetMapping("laysoluonggiohang")
	@ResponseBody
	public String laySoluongGioHang( HttpSession httpSession) {
		if (null != httpSession.getAttribute("gioHang") ) {
			List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
			return lisGioHangs.size()+"";
		}
		return "";
		
	}
}
