package com.luucungquan.DAOImp;

import com.luucungquan.entities.nhanVien;

public interface nhanVienImpl {
	public boolean kiemTraDangNhap(String email, String matKhau);
	public boolean kiemTraDangKy(nhanVien nhanVien);
}
