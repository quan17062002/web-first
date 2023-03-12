package com.luucungquan.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="sanpham")
public class sanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSanPham;
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "maDanhMuc")
	private danhMucSanPham maDanhMuc;
	private String tenSanPham;
	private String giaTien;
	private String moTa;
	private String hinhSanPham;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "maSanPham")
	private Set<chiTietSanPham> chiTietSanPham = new HashSet<chiTietSanPham>();
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "chiTietKhuyenMai", joinColumns = { @JoinColumn(name = "maSanPham") }, inverseJoinColumns = {
			@JoinColumn(name = "maKhuyenMai") })
	private Set<khuyenMai> danhSachKhuyenMai;
}
