package com.luucungquan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.nhanVienImpl;
import com.luucungquan.dao.nhanVienDAO;
import com.luucungquan.entities.nhanVien;

@Service
public class nhanVienService implements nhanVienImpl {
	@Autowired
	nhanVienDAO nhanVienDAO;

	@Override
	public boolean kiemTraDangNhap(String email, String matKhau) {
		boolean kiemTra = nhanVienDAO.kiemTraDangNhap(email, matKhau);
		return kiemTra;
	}

	@Override
	public boolean kiemTraDangKy(nhanVien nhanVien) {
		boolean kiemTra = nhanVienDAO.kiemTraDangKy(nhanVien);
		return kiemTra;
	}
}
