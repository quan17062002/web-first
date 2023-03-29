package com.luucungquan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.sizeSanPhamImpl;
import com.luucungquan.entities.sizeSanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class sizeSanPhamDAO  implements sizeSanPhamImpl{
 @Autowired
 SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<sizeSanPham> layDanhSachSize() {
		Session session = sessionFactory.getCurrentSession();
		List<sizeSanPham>lisSizeSanPhams = session.createQuery("from sizeSanPham ").getResultList();
		
		return lisSizeSanPhams;
	}

}
