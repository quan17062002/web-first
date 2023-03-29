package com.luucungquan.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "sanpham")
public class sanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSanPham;
	@OneToOne
	@JoinColumn(name = "maDanhMuc")
	private danhMucSanPham maDanhMuc;
	private String tenSanPham;
	private String giaTien;
	private String moTa;
	private String hinhSanPham;
	private String gianhCho;
	@OneToMany(mappedBy = "maSanPham", cascade = CascadeType.ALL)
	private Set<chiTietSanPham>chiTietSanPhams;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "chiTietKhuyenMai", joinColumns = { @JoinColumn(name = "maSanPham") }, inverseJoinColumns = {
			@JoinColumn(name = "maKhuyenMai") })
	private Set<khuyenMai> danhSachKhuyenMai;
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public danhMucSanPham getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(danhMucSanPham maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(String giaTien) {
		this.giaTien = giaTien;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getHinhSanPham() {
		return hinhSanPham;
	}
	public void setHinhSanPham(String hinhSanPham) {
		this.hinhSanPham = hinhSanPham;
	}
	public String getGianhCho() {
		return gianhCho;
	}
	public void setGianhCho(String gianhCho) {
		this.gianhCho = gianhCho;
	}
	public Set<chiTietSanPham> getChiTietSanPhams() {
		return chiTietSanPhams;
	}
	public void setChiTietSanPhams(Set<chiTietSanPham> chiTietSanPhams) {
		this.chiTietSanPhams = chiTietSanPhams;
	}
	public Set<khuyenMai> getDanhSachKhuyenMai() {
		return danhSachKhuyenMai;
	}
	public void setDanhSachKhuyenMai(Set<khuyenMai> danhSachKhuyenMai) {
		this.danhSachKhuyenMai = danhSachKhuyenMai;
	}
	
}
