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
import com.luucungquan.entities.chiTietSanPham;
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

	

	@Override
	@Transactional
	public sanPham layChiTietSanPham(int maSanPham) {
		 Session session = sessionFactory.getCurrentSession();
		 sanPham sanPham = (sanPham)session.createQuery("from sanPham sp where sp.maSanPham =  "+maSanPham).getSingleResult();
		return sanPham;
	}



	@Override
	@Transactional
	public List<chiTietSanPham> chiTietSanPham(int masanPham) {
		 Session session = sessionFactory.getCurrentSession();
		 List<chiTietSanPham> chiTietSanPham = session.createQuery("from chiTietSanPham ctsp where ctsp.maSanPham ="+masanPham).getResultList();
		return chiTietSanPham;
	}



	


	
	
	

}
