package com.luucungquan.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Table(name="danhmucsanpham")
public class danhMucSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDanhMuc;
	private String tenDanhMuc;
	private String hinhDanhMuc;
	@OneToMany(mappedBy = "maDanhMuc",cascade = CascadeType.ALL)
	private Set<sanPham>listSanPham= new HashSet<sanPham>();
	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getHinhDanhMuc() {
		return hinhDanhMuc;
	}
	public void setHinhDanhMuc(String hinhDanhMuc) {
		this.hinhDanhMuc = hinhDanhMuc;
	}
	public Set<sanPham> getListSanPham() {
		return listSanPham;
	}
	public void setListSanPham(Set<sanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
	

}
