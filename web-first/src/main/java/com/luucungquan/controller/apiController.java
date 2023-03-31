package com.luucungquan.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luucungquan.entities.chiTietSanPham;
import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.gioHang;
import com.luucungquan.entities.mauSanPham;
import com.luucungquan.entities.sanPham;
import com.luucungquan.entities.sizeSanPham;
import com.luucungquan.service.nhanVienService;
import com.luucungquan.service.sanPhamService;

@Controller
@RequestMapping("/api")
@SessionAttributes({ "email", "gioHang" })
public class apiController {
	@Autowired
	nhanVienService nhanVienService;
	@Autowired
	sanPhamService sanPhamService;

	@PostMapping("dangnhap")
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
			@RequestParam String tenSize, @RequestParam int soLuong, @RequestParam String hinhAnh,
			@RequestParam int maChiTiet, HttpSession httpSession) {
		if (httpSession.getAttribute("gioHang") == null) {
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
			gioHang.setHinhAnh(hinhAnh);
			gioHang.setMaChiTiet(maChiTiet);
			listGioHangs.add(gioHang);
			httpSession.setAttribute("gioHang", listGioHangs);

		} else {
			int viTri = kiemTraSanPhamDaTonTaiGioHang(httpSession, maSanPham, maSize, maMau);
			if (viTri == -1) {
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
				gioHang.setHinhAnh(hinhAnh);
				gioHang.setMaChiTiet(maChiTiet);
				gioList.add(gioHang);

			} else {
				List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
				int soLuongMoi = gioList.get(viTri).getSoLuong() + 1;
				gioList.get(viTri).setSoLuong(soLuongMoi);
			}
			List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
			for (gioHang gioHang : gioList) {
				System.out.println(gioHang.getTenSanPham() + "-" + gioHang.getSoLuong());
			}

		}
	}

	private int kiemTraSanPhamDaTonTaiGioHang(HttpSession httpSession, int maSanPham, int maSize, int maMau) {
		List<gioHang> gioList = (List<com.luucungquan.entities.gioHang>) httpSession.getAttribute("gioHang");
		for (int i = 0; i < gioList.size(); i++) {
			if (gioList.get(i).getMaSanPham() == maSanPham && gioList.get(i).getMaSize() == maSize
					&& gioList.get(i).getMaMau() == maMau) {
				return i;
			}
		}
		return -1;
	}

	@GetMapping("laysoluonggiohang")
	@ResponseBody
	public String laySoluongGioHang(HttpSession httpSession) {
		if (null != httpSession.getAttribute("gioHang")) {
			List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
			return lisGioHangs.size() + "";
		}
		return "";

	}

	@GetMapping("xoaGioHang")
	@ResponseBody
	public void xoaGioHang(HttpSession httpSession, @RequestParam int maSanPham, @RequestParam int maSize,
			@RequestParam int maMau) {
		if (httpSession.getAttribute("gioHang") != null) {
			int viTri = kiemTraSanPhamDaTonTaiGioHang(httpSession, maSanPham, maSize, maMau);
			List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
			lisGioHangs.remove(viTri);

		}

	}

	@GetMapping(value = "updateSanPham", produces = "text/plain; charset=utf-8")
	@ResponseBody
	public void updateSanPham(HttpSession httpSession, @RequestParam int maSanPham, @RequestParam int maSize,
			@RequestParam int maMau, @RequestParam int soLuong) {
		if (httpSession.getAttribute("gioHang") != null) {
			int viTri = kiemTraSanPhamDaTonTaiGioHang(httpSession, maSanPham, maSize, maMau);
			List<gioHang> lisGioHangs = (List<gioHang>) httpSession.getAttribute("gioHang");
			lisGioHangs.get(viTri).setSoLuong(soLuong);
		}
	}

	@GetMapping("laySanPham")
	@ResponseBody
	public String laySanPham(@RequestParam int spBatDau) {
		String html = "";
		List<sanPham> lisPhams = sanPhamService.listSanPhamLimit(spBatDau);
		for (sanPham sanPham : lisPhams) {
			html += "<tr>";
			html += "<td> <div class='form-check'><label class='form-check-label'> <input type='checkbox' class='form-check-input' value='"
					+ sanPham.getMaSanPham() + "'></label></div></td>";
			html += "<td class='tenSanPham' data-maSanPham='" + sanPham.getMaSanPham() + "'>" + sanPham.getTenSanPham()
					+ "</td>";
			html += "<td class='giaTien'>" + sanPham.getGiaTien() + "</td>";
			html += "<td class='danhCho'>" + sanPham.getGianhCho() + "</td>";
			html += "</tr>";

		}

		System.out.println(html);
		return html;

	}

	@GetMapping("xoasanpham")
	@ResponseBody
	public String xoaSanPhamTheoMa(@RequestParam int maSanPham) {
		sanPhamService.xoaSanPhamTheoMa(maSanPham);

		return "";
	}

	@Autowired
	ServletContext servletContext;

	@PostMapping("UpLoadFile")
	@ResponseBody
	public String upLoadFile(MultipartHttpServletRequest request) {

		String path_save_file = servletContext.getRealPath("/resources/images/sanpham/");
		Iterator<String> lisIterator = request.getFileNames();
		MultipartFile multipartFile = request.getFile(lisIterator.next());
		File file = new File(path_save_file + multipartFile.getOriginalFilename());
		try {
			multipartFile.transferTo(file);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(path_save_file);

		return "true";
	}

	@PostMapping("themsanpham")
	@ResponseBody
	public void themSanPham(@RequestParam String datajson) {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode json;
		try {
			sanPham sanPham = new sanPham();
			json = mapper.readTree(datajson);
			danhMucSanPham danhMucSanPham = new danhMucSanPham();
			danhMucSanPham.setMaDanhMuc(json.get("danhMucSanPham").asInt());

			JsonNode jsonChiTiet = json.get("chiTietSanPham");
			Set<chiTietSanPham> listChiTietSanPhams = new HashSet<chiTietSanPham>();
			for (JsonNode objectChitiet : jsonChiTiet) {
				chiTietSanPham chiTietSanPham = new chiTietSanPham();

				mauSanPham mauSanPham = new mauSanPham();
				mauSanPham.setMaMau(objectChitiet.get("mauSanPham").asInt());

				sizeSanPham sizeSanPham = new sizeSanPham();
				sizeSanPham.setMaSize(objectChitiet.get("sizeSanPham").asInt());
                chiTietSanPham.setMaSanPham(sanPham);
				chiTietSanPham.setMaMau(mauSanPham);
				chiTietSanPham.setMaSize(sizeSanPham);
				chiTietSanPham.setSoLuong(objectChitiet.get("soLuong").asInt());
				listChiTietSanPhams.add(chiTietSanPham);
			}
			String tenSanPham = json.get("tenSanPham").asText();
			String giaTien = json.get("giaTien").asText();
			String moTa = json.get("moTa").asText();
			String hinhSanPham = json.get("hinhSanPham").asText();
			String gianhCho = json.get("gianhCho").asText();

			sanPham.setChiTietSanPhams(listChiTietSanPhams);
			sanPham.setMaDanhMuc(danhMucSanPham);
			sanPham.setTenSanPham(tenSanPham);
			sanPham.setGiaTien(giaTien);
			sanPham.setMoTa(moTa);
			sanPham.setHinhSanPham(hinhSanPham);
			sanPham.setGianhCho(gianhCho);

			sanPhamService.themSanPham(sanPham);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
