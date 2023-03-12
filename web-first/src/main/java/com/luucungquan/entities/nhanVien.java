package com.luucungquan.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="nhanvien")
public class nhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int maNhanVien;
	 private String hoTen;
	 private String diaChi;
	 private boolean gioiTinh;
	 private String cmnd;
	 @OneToOne
	 @JoinColumn(name = "maChucVu")
	 private ChucVu maChucVu;// mot nhan vien mot chuc vu
	 private String email;
	 private String tenDangNhap;
	 private String matKhau;

}
