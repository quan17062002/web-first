package com.luucungquan.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class chiTietHoaDonID implements Serializable{
	private int maSanPham;
	private int maChiTietSanPham;
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getMaChiTietSanPham() {
		return maChiTietSanPham;
	}
	public void setMaChiTietSanPham(int maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}
	
}
