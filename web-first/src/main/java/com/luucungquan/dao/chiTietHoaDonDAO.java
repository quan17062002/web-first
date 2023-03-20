package com.luucungquan.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.chiTietHoaDon;
import com.luucungquan.entities.chiTietHoaDonID;
import com.luucungquan.entities.hoaDon;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class chiTietHoaDonDAO implements chiTietHoaDon {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean themChiTietHoaDon(com.luucungquan.entities.chiTietHoaDon chiTietHoaDon) {
		Session session = sessionFactory.getCurrentSession();
		chiTietHoaDonID id = (chiTietHoaDonID) session.save(chiTietHoaDon);
		if (id != null) {
			return true;
		}
		{
			return false;
		}

	}
}
