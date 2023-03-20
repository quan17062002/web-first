package com.luucungquan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.chiTietHoaDon;
import com.luucungquan.dao.hoaDonDAO;
import com.luucungquan.entities.hoaDon;

@Service
public class hoaDonService  implements com.luucungquan.DAOImp.hoaDon{
	@Autowired
 hoaDonDAO hoaDonDAO;

	@Override
	public int themHoaDon(hoaDon hoaDon) {
		return hoaDonDAO.themHoaDon(hoaDon);
	}
	

}
