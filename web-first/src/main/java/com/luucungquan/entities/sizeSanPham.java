package com.luucungquan.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sizesanpham")
public class sizeSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSize;
	private String size;
	@OneToMany( mappedBy = "maSize")
	private Set<chiTietSanPham> chiTietSanPham;


}
