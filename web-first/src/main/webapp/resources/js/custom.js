$(document).ready(function() {
	$("#btdangnhap").click(function() {
		var email = $("#email").val();
		var matKhau = $("#matKhau").val();
		$.ajax({
			url: "/web-first/api/dangnhap",
			method: 'POST',
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
		var hinhAnh = $("#hinhanh").attr("data-hinhanh");
		var maChiTiet = $(this).attr("data-machitiet");

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
				hinhAnh: hinhAnh,
				maChiTiet: maChiTiet,
			},
			success: function(value) {

			}
		}).done(function() {
			$.ajax({
				url: "/web-first/api/laysoluonggiohang",
				method: 'GET',
				success: function(value) {
					$("#xegiohang").find("div").addClass("xeGioHang");
					$("#xegiohang").find("div").html("<span>" + value + "</span>");



				}
			});

		});

	});

	ganTongTienGioHang();
	function ganTongTienGioHang(EventChange) {
		var tongTienSp = 0;
		$(".giaTien").each(function() {
			var giaTien = parseInt($(this).data("giatien").replace(/\D/g, '')); // lấy giá trị số từ chuỗi giá tiền
			var format1 = giaTien.toLocaleString('vi-VN');
			var soluong = parseInt($(this).closest("tr").find(".soluong-giohang").val());
			var tongtien = soluong * giaTien;

			var format = tongtien.toLocaleString('vi-VN');
			if (!EventChange) {
				$(this).html(format);
			}

			tongTienSp = tongTienSp + tongtien;
		});
      
		var formatTongTien = tongTienSp.toLocaleString('vi-VN');
		$(".tongtien").html(formatTongTien + " VNĐ");

	}



	$(".soluong-giohang").change(function() {
		var soluong = $(this).val();
		var giaTien = parseInt($(this).closest("tr").find(".giaTien").data("giatien").replace(/\D/g, '')); // lấy giá trị số từ chuỗi giá tiền
		var tongTien = soluong * giaTien;
		var format = tongTien.toLocaleString('vi-VN');
		$(this).closest("tr").find(".giaTien").html(format + " VNĐ"); // định dạng và gán lại chuỗi giá tiền
		ganTongTienGioHang(true);

		var maMau = $(this).closest("tr").find(".maMau").attr("data-maMau");
		var maSize = $(this).closest("tr").find(".maSize").attr("data-maSize");
		var maSanPham = $(this).closest("tr").find(".tenSanPham").attr("data-maSanPham");


		$.ajax({
			url: "/web-first/api/updateSanPham",
			method: 'GET',

			data: {
				maSanPham: maSanPham,
				maSize: maSize,
				maMau: maMau,
				soLuong: soluong,
			},
			success: function(value) {

			}



		});
	})
	$(".xoaGioHang").click(function() {
		var self = $(this);
		var maSize = $(this).closest("tr").find(".maSize").attr("data-maSize");
		var maMau = $(this).closest("tr").find(".maMau").attr("data-maMau");
		var maSanPham = $(this).closest("tr").find(".tenSanPham").attr("data-maSanPham");
		$.ajax({

			url: "/web-first/api/xoaGioHang",
			method: 'GET',
			data: {
				maSanPham: maSanPham,
				maSize: maSize,
				maMau: maMau,

			},
			success: function(value) {
				self.closest("tr").remove();
				ganTongTienGioHang();
			}
		});
	});




})

