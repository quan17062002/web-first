package com.luucungquan.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.luucungquan.DAOImp.nhanVienImpl;
import com.luucungquan.entities.nhanVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class nhanVienDAO implements nhanVienImpl {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public boolean kiemTraDangNhap(String email, String matKhau) {
		Session session = sessionFactory.getCurrentSession();
		try {
			nhanVien nhanVien = (nhanVien) session
					.createQuery("FROM nhanVien WHERE email='" + email + "' AND matKhau='" + matKhau + "'")
					.getSingleResult();
			if (nhanVien != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	@Transactional
	public boolean kiemTraDangKy(nhanVien nhanVien) {
		Session session = sessionFactory.getCurrentSession();
		int maNhanVien = (int) session.save(nhanVien);// cái này có nghĩa lưu một đối tượng nhân viên vào trong cơ sở
														// giữ liệu
		// khai báo một cái mã nhân viên vì nó tự động tăng lên
		// giá trị nhỏ nhất là 1 nếu nó lớn hơn 1 thì sẽ trả true ngược lại nó sẽ trả false
		if (maNhanVien > 0) {
			return true;
		} else {
			return false;
		}
		// rồi cái này nó sẽ chuyển sang nhan vien serivce rồi nó sẽ đẩy về đăng nhập

	}
}
