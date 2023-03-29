package com.luucungquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.mauSanPhamImpl;
import com.luucungquan.dao.mauSanPhamDAO;
import com.luucungquan.entities.mauSanPham;

@Service
public class mauSanPhamService implements mauSanPhamImpl {
	 @Autowired
	 mauSanPhamDAO mauSanPhamDAO;

	@Override
	public List<mauSanPham> layDanhSachMauSanPham() {
		
		return mauSanPhamDAO.layDanhSachMauSanPham();
	}

}
