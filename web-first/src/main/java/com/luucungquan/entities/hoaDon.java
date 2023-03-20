package com.luucungquan.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hoadon")
public class hoaDon {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;
	private String tenKhachHang;
	private String soDT;
	private String diaChiGiaoHang;
	private String ngayLap;
	private String phuongThucThanhToan;
	private String ghiChu;
	@OneToMany(cascade = CascadeType.ALL ,fetch =  FetchType.EAGER)
	@JoinColumn(name="maHoaDon")
	Set<chiTietHoaDon> danhChiTietHoaDons;
	


}
