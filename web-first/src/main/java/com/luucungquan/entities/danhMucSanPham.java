package com.luucungquan.entities;

import java.util.HashSet;
import java.util.Set;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="danhmucsanpham")
public class danhMucSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDanhMuc;
	private String tenDanhMuc;
	private String hinhDanhMuc;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "maDanhMuc")
	private Set<sanPham>listSanPham= new HashSet<sanPham>();
	

}
