 package com.luucungquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.danhMucSanPhamImpl;
import com.luucungquan.dao.danhMucSanPhamDAO;
@Service
public class danhMucSanPhamService implements danhMucSanPhamImpl {
	@Autowired 
	danhMucSanPhamDAO danhMucSanPhamDAO;

	@Override
	public List<com.luucungquan.entities.danhMucSanPham> danhMucSanPham() {
		
		return danhMucSanPhamDAO.danhMucSanPham();
	}

}
