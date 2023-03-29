package com.luucungquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.khuyenMaiImpl;
import com.luucungquan.dao.chiTietKhuyenMaiDAO;
import com.luucungquan.entities.khuyenMai;

@Service
public class khuyenMaiService implements khuyenMaiImpl {
	@Autowired
	chiTietKhuyenMaiDAO chiTietKhuyenMaiDAO;

	@Override
	public List<khuyenMai> lisKhuyenMai() {
		return chiTietKhuyenMaiDAO.lisKhuyenMai();
	}

}
