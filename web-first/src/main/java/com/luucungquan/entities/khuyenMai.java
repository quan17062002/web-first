package com.luucungquan.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@AllArgsConstructor
@NoArgsConstructor
@Table(name="khuyenmai")
public class khuyenMai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKhuyenMai;
	private String tenKhuyenMai;
	private  String thoiGianBatDau;
	private String thoiGianKetThuc;
	private String moTa;
	private String hinhKhuyenMai;
	private int giaGiam;
	@ManyToMany(mappedBy = "danhSachKhuyenMai")
	private Set<sanPham>danhSachSanPham;
	

}
