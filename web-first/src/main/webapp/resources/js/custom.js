$(document).ready(function() {
	$("#btdangnhap").click(function() {
		var email = $("#email").val();
		var matKhau = $("#matKhau").val();
		$.ajax({
			url: "http://localhost:8080/web-first/api/",
			method: 'GET',
			data: {
				email: email,
				matKhau: matKhau },
			success: function(value) {
               alert(value);
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
	
	
	
	
	

})
