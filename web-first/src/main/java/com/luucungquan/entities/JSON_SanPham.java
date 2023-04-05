package com.luucungquan.entities;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JSON_SanPham {
	private int maSanPham;
	private danhMucSanPham maDanhMuc;
	private String tenSanPham;
	private String giaTien;
	private String moTa;
	private String hinhSanPham;
	private String gianhCho;
	private Set<chiTietSanPham> chiTietSanPhams;
}
