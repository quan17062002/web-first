package com.luucungquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.sanPhamImpl;
import com.luucungquan.dao.sanPhamDAO;
import com.luucungquan.entities.chiTietSanPham;
import com.luucungquan.entities.sanPham;

@Service
public class sanPhamService implements sanPhamImpl {

	@Autowired
	sanPhamDAO sanPhamDAO;

	@Override
	public List<sanPham> listSanPhamLimit(int SpDau) {

		return sanPhamDAO.listSanPhamLimit(SpDau);
	}

	@Override
	public sanPham layChiTietSanPham(int maSanPham) {

		return sanPhamDAO.layChiTietSanPham(maSanPham);
	}

	@Override
	public List<chiTietSanPham> chiTietSanPham(int maSanPham) {
		
		return sanPhamDAO.chiTietSanPham(maSanPham);
	}

	@Override
	public List<sanPham> laySanPhamTheoMaDanhMuc(int maDanhMuc) {
	
		return sanPhamDAO.laySanPhamTheoMaDanhMuc(maDanhMuc);
	}

	@Override
	public void xoaSanPhamTheoMa(int maSanPham) {
        sanPhamDAO.xoaSanPhamTheoMa(maSanPham);
	}

	@Override
	public boolean themSanPham(sanPham sanPham) {
		
		return sanPhamDAO.themSanPham(sanPham);
	}

	@Override
	public boolean capNhatSanPham(sanPham sanPham) {
		return sanPhamDAO.capNhatSanPham(sanPham);
	}

	


}
