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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "mausanpham")
public class mauSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int maMau;
 private String tenMau;
	@OneToMany( mappedBy = "maMau")
	private Set<chiTietSanPham> chiTietSanPham;

}
