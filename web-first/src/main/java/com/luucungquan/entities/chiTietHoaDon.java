package com.luucungquan.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="chitiethoadon")
public class chiTietHoaDon {
	 @EmbeddedId
	private  chiTietHoaDonID chiTietHoaDonID;
	private int soLuong;
	private String giaTien;

}
