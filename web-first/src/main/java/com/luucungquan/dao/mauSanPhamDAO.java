package com.luucungquan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.mauSanPhamImpl;
import com.luucungquan.entities.mauSanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class mauSanPhamDAO implements mauSanPhamImpl {
	@Autowired
	SessionFactory sessFactory;

	@Override
	@Transactional
	public List<mauSanPham> layDanhSachMauSanPham() {
		 Session session = sessFactory.getCurrentSession();
		 List<mauSanPham>lisMauSanPhams = session.createQuery("from mauSanPham").getResultList();
		return lisMauSanPhams;
	}

}
