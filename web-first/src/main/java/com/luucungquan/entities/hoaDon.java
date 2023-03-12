package com.luucungquan.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String maHoaDon;
	private String tenKhachHang;
	private String soDT;
	private String diaChiGiaoHang;
	private String ngayLap;
	


}
