package com.luucungquan.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="chitietsanpham")
public class chiTietSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maChiTietSanPham;
	@ManyToOne
	@JoinColumn(name = "maSanPham")
	private sanPham maSanPham;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maSize")
	private sizeSanPham maSize;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maMau")
	private mauSanPham maMau;
	private int soLuong;
	private String ngayNhap;
	
	
	

}
