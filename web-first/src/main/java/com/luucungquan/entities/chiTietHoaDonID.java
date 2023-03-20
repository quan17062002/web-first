package com.luucungquan.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class chiTietHoaDonID implements Serializable {
	private int maHoaDon;
	private int maChiTietSanPham;

	

}
