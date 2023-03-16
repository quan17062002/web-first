package com.luucungquan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.danhMucSanPhamImpl;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class danhMucSanPhamDAO implements danhMucSanPhamImpl {
	@Autowired 
	 SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<com.luucungquan.entities.danhMucSanPham> danhMucSanPham() {
		Session session = sessionFactory.getCurrentSession();
		List<com.luucungquan.entities.danhMucSanPham> danhMucSanPham = session.createQuery("from danhMucSanPham").getResultList();
		
		
		return danhMucSanPham ;
	}

}
