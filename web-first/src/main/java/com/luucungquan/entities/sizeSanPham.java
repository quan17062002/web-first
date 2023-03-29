package com.luucungquan.entities;

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
@Table(name="sizesanpham")
public class sizeSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSize;
	private String size;
	@OneToMany( mappedBy = "maSize",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<chiTietSanPham> chiTietSanPham;
	public int getMaSize() {
		return maSize;
	}
	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Set<chiTietSanPham> getChiTietSanPham() {
		return chiTietSanPham;
	}
	public void setChiTietSanPham(Set<chiTietSanPham> chiTietSanPham) {
		this.chiTietSanPham = chiTietSanPham;
	}
	



}
