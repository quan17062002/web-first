package com.luucungquan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.khuyenMaiImpl;
import com.luucungquan.entities.khuyenMai;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class chiTietKhuyenMaiDAO  implements khuyenMaiImpl{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<khuyenMai> lisKhuyenMai() {
		Session session = sessionFactory.getCurrentSession();
		List<khuyenMai> lisKhuyenMai = session.createQuery("from khuyenMai").getResultList();
		return lisKhuyenMai;
	}

}
