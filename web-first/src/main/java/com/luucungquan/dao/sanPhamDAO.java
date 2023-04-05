package com.luucungquan.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.sanPhamImpl;
import com.luucungquan.entities.chiTietHoaDon;
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
		List<sanPham> listSanPham = new ArrayList<sanPham>();
		Session session = sessionFactory.getCurrentSession();
		if (SpDau < 0) {
			listSanPham = session.createQuery("from sanPham").getResultList();
		} else {
			listSanPham = session.createQuery("from sanPham").setFirstResult(SpDau).setMaxResults(5).getResultList();
		}

		return listSanPham;
	}

	@Override
	@Transactional
	public sanPham layChiTietSanPham(int maSanPham) {
		Session session = sessionFactory.getCurrentSession();
		sanPham sanPham = (sanPham) session.createQuery("from sanPham sp where sp.maSanPham =  " + maSanPham)
				.getSingleResult();
		return sanPham;
	}

	@Override
	@Transactional
	public List<chiTietSanPham> chiTietSanPham(int masanPham) {
		Session session = sessionFactory.getCurrentSession();
		List<chiTietSanPham> chiTietSanPham = session
				.createQuery("from chiTietSanPham ctsp where ctsp.maSanPham =" + masanPham).getResultList();
		return chiTietSanPham;
	}

	@Override
	@Transactional
	public List<sanPham> laySanPhamTheoMaDanhMuc(int maDanhMuc) {
		Session session = sessionFactory.getCurrentSession();
		List<sanPham> lisSanPhams = session.createQuery("from sanPham sp where  sp.maDanhMuc = " + maDanhMuc)
				.getResultList();
		return lisSanPhams;
	}

	@Override
	@Transactional
	public void xoaSanPhamTheoMa(int maSanPham) {
		Session session = sessionFactory.getCurrentSession();
		sanPham sanPham = session.get(sanPham.class, maSanPham);
		Set<chiTietSanPham> chiTietSanPhams = sanPham.getChiTietSanPhams();
		for (chiTietSanPham chiTietSanPham : chiTietSanPhams) {
			Query<chiTietHoaDon> queryChiTietHoaDon = session
					.createQuery("delete from chiTietHoaDon where maChiTietSanPham = :maChiTietSanPham");
			queryChiTietHoaDon.setParameter("maChiTietSanPham", chiTietSanPham.getMaChiTietSanPham());
			queryChiTietHoaDon.executeUpdate();
		}
		// session.createQuery("delete from chiTietKhuyenMai where maSanPham =
		// "+maSanPham).executeUpdate();
		session.createQuery("delete from chiTietSanPham where maSanPham = " + maSanPham).executeUpdate();

		Query queryXoaSanPham = session.createQuery("delete from sanPham where maSanPham = :maSanPham");
		queryXoaSanPham.setParameter("maSanPham", maSanPham);
		queryXoaSanPham.executeUpdate();

	}

	@Override
	@Transactional
	public boolean themSanPham(sanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		int id = (int) session.save(sanPham);

		return false;
	}

	@Override
	@Transactional
	public boolean capNhatSanPham(sanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();

		// Update the sanPham object
		session.update(sanPham);

		return true;
	}

}
