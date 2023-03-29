package com.luucungquan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luucungquan.DAOImp.sizeSanPhamImpl;
import com.luucungquan.dao.sizeSanPhamDAO;
import com.luucungquan.entities.sizeSanPham;
 @Service
public class sizeSanPhamService implements sizeSanPhamImpl {
@Autowired
sizeSanPhamDAO sizeSanPhamDAO;

@Override
public List<sizeSanPham> layDanhSachSize() {
	return sizeSanPhamDAO.layDanhSachSize();
}

}
