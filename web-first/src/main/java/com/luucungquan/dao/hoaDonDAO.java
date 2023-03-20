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
public class hoaDonDAO implements com.luucungquan.DAOImp.hoaDon{
 @Autowired 
 SessionFactory sessionFactory;
	@Override
	@Transactional
	public int themHoaDon(hoaDon hoaDon) {
		Session session = sessionFactory.getCurrentSession();
		int id = (int) session.save(hoaDon);
		    if(id>0) {
		    	return id;
		    }else{
		    	return 0;
		    }
		
	}

}
