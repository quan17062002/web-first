package com.luucungquan.service;

import java.util.List;

import javax.transaction.Transactional;

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

}
