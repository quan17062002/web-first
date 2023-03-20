package com.luucungquan.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// cái này nó sẽ lấy thông tin bên chi tiết sản phẩm và nó sessionAtribuled
//lại thôi
@Data
@AllArgsConstructor
@NoArgsConstructor
public class gioHang {
	private int maChiTiet;
	private int maSanPham;
    private int maSize;
    private int maMau;
    private String tenSanPham;
    private String giaTien;
    private String tenMau;
    private String tenSize;
    private int soLuong;
    private String hinhAnh;
    // cai nay để chuyền thông tin vào trong giỏ hàng không phải truy vấn cơ sở dữ liệu là lấy 
    // ra cái gì VD: 
    // nhấn vào thêm vào giỏ hàng ta phải truy vấ vào cơ sở dữ liệu d
 // để lấy ra thông tin từ cơ sở dữ liệu 
    // nhưng đây không cần cứ thế dùng ijax để sử lý thông tin thôi
    

}
