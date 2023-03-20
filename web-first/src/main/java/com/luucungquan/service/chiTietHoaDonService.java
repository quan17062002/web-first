package com.luucungquan.service;

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
		// TODO Auto-generated method stub
		return chiTietHoaDonDAO.themChiTietHoaDon(chiTietHoaDon);
	}

}
