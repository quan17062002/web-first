package com.luucungquan.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luucungquan.entities.nhanVien;
import com.luucungquan.service.nhanVienService;

@Controller
@RequestMapping("dangky/")
public class dangKyController {
	@Autowired
	nhanVienService nhanVienService;
    @GetMapping
	public String Default() {
		return "dangky";
	}

	@PostMapping

	public String kiemTraDangKy(@RequestParam String email, @RequestParam String matKhau, @RequestParam  String nhapLaiMatKhau,
			ModelMap modelMap) {
		boolean kiemTra = isEmailValid(email);
		if (kiemTra == true) {
			if (ismatKhauValid(matKhau) == true) {
				if (matKhau.equals(nhapLaiMatKhau)) {

					nhanVien nhanVien = new nhanVien();
					nhanVien.setEmail(email);
					nhanVien.setMatKhau(matKhau);
					boolean kiemTradangKy = nhanVienService.kiemTraDangKy(nhanVien);
					if (kiemTradangKy == true) {
						return "../trangchu/";
					}

				} else {
					modelMap.addAttribute("dangKy", "MẬT KHẨU CHƯA KHỚP");
				}

			} else {
				modelMap.addAttribute("dangKy", "MẬT KHẨU  ÍT NHẬT 5 KÝ TỰ");
			}

		} else {
			modelMap.addAttribute("dangKy", "EMAIL PHẢI CÓ MỘT CHỮ CÁI IN HAO MỘT CHỮ IN THƯỜNG VÀ SỐ");
		}
		return "dangky";
	}

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public boolean isEmailValid(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();

	}

	public boolean ismatKhauValid(String matKhau) {
		if (matKhau.length() <= 5) {
			return false;
		} else {

			return true;
		}
	}

}
