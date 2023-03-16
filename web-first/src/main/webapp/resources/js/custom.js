$(document).ready(function() {
	$("#btdangnhap").click(function() {
		var email = $("#email").val();
		var matKhau = $("#matKhau").val();
		$.ajax({
			url: "/web-first/api/dangnhap",
			method: 'GET',
			data: {
				email: email,
				matKhau: matKhau
			},
			success: function(value) {

				if (value == "true") {
					duongDanHienTai = window.location.href;
					duongDan = duongDanHienTai.replace("/dangnhap/", "/trangchu/");
					window.location = duongDan;
				} else {
					$("#ketQua").append("dang nhap that bai")
				}
			}

		})
	});
	$("#dangnhap").click(function() {
		duongDanHienTai = window.location.href;
		duongDan = duongDanHienTai.replace("/dangky/", "/dangnhap/");
		window.location = duongDan;
	});
	$("#dangky").click(function() {
		duongDanHienTai = window.location.href;
		duongDan = duongDanHienTai.replace("/dangnhap/", "/dangky/");
		window.location = duongDan;
	});
	$(".themgiohang").click(function() {
		//closest sex bằng hai parent như kiểu là ông
		var maMau = $(this).closest("tr").find(".maMau").attr("data-maMau");
		var tenMau = $(this).closest("tr").find(".maMau").text();
		var maSize = $(this).closest("tr").find(".maSize").attr("data-maSize");
		var tenSize = $(this).closest("tr").find(".maSize").text();
		var tenSanPham = $("#tensanpham").text();
		var giaTien = $("#giatien").attr("data-value");
		var maSanPham = $("#tensanpham").attr("data-tensanpham");
		var soLuong = $(this).closest("tr").find(".soluong").text();
		$.ajax({
			url: "/web-first/api/themGioHang",
			method: 'GET',
			data: {
				maSanPham: maSanPham,
				maSize: maSize,
				maMau: maMau,
				tenSanPham: tenSanPham,
				giaTien: giaTien,
				tenMau: tenMau,
				tenSize: tenSize,
				soLuong: soLuong,
			},
			success: function(value) {

			}
		}).done(function() {
			$.ajax({
				url: "/web-first/api/laysoluonggiohang",
				method: 'GET',
				success: function(value) {
					$("#xegiohang").find("div").addClass("xeGioHang");
					$("#xegiohang").find("div").html ("<span>"+value+"</span>");
					


				}
			});

		});

	});
})
