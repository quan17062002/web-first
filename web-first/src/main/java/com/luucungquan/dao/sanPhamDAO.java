package com.luucungquan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.sanPhamImpl;
import com.luucungquan.entities.sanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class sanPhamDAO implements sanPhamImpl {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<sanPham> listSanPhamLimit(int SpDau) {
		 Session session = sessionFactory.getCurrentSession();
		 List<sanPham>listSanPham = session.createQuery("from sanPham").setFirstResult(SpDau).setMaxResults(18).getResultList();
		return listSanPham;
	}
	
	
	

}
