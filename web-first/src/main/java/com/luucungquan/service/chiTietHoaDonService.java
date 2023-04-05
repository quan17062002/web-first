package com.luucungquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.chiTietHoaDon;
import com.luucungquan.dao.chiTietHoaDonDAO;

@Service
public class chiTietHoaDonService implements chiTietHoaDon {
	@Autowired
	chiTietHoaDonDAO chiTietHoaDonDAO;

	@Override
	public boolean themChiTietHoaDon(com.luucungquan.entities.chiTietHoaDon chiTietHoaDon) {
	
		return chiTietHoaDonDAO.themChiTietHoaDon(chiTietHoaDon);
	}

	@Override
	public List<com.luucungquan.entities.chiTietHoaDon> hoaDons() {
		return chiTietHoaDonDAO.hoaDons();
	}

}
