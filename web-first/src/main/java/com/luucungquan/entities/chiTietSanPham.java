package com.luucungquan.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chitietsanpham")
public class chiTietSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maChiTietSanPham;
	@ManyToOne
	@JoinColumn(name = "maSanPham")
	private sanPham maSanPham;
	@ManyToOne
	@JoinColumn(name = "maSize")
	private sizeSanPham maSize;
	@ManyToOne
	@JoinColumn(name = "maMau")
	private mauSanPham maMau;
	private int soLuong;
	private String ngayNhap;
	public int getMaChiTietSanPham() {
		return maChiTietSanPham;
	}
	public void setMaChiTietSanPham(int maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}
	public sanPham getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(sanPham maSanPham) {
		this.maSanPham = maSanPham;
	}
	public sizeSanPham getMaSize() {
		return maSize;
	}
	public void setMaSize(sizeSanPham maSize) {
		this.maSize = maSize;
	}
	public mauSanPham getMaMau() {
		return maMau;
	}
	public void setMaMau(mauSanPham maMau) {
		this.maMau = maMau;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	

}
