package com.luucungquan.DAOImp;

import java.util.List;

import com.luucungquan.entities.chiTietSanPham;
import com.luucungquan.entities.danhMucSanPham;
import com.luucungquan.entities.sanPham;

public interface sanPhamImpl {

	public List<sanPham> listSanPhamLimit(int SpDau);

	public sanPham layChiTietSanPham(int maSanPham);

	public List<chiTietSanPham> chiTietSanPham(int maSanPham);
    
	public List<sanPham> laySanPhamTheoMaDanhMuc(int maDanhMuc);
	public void xoaSanPhamTheoMa(int maSanPham);
	public boolean themSanPham (sanPham sanPham);
	public boolean capNhatSanPham(sanPham sanPham);
}
