<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp" />
</head>
<body id="background-login">
	<div class="body-flex-login">
		<div class="container-login">
			<div class="container-login-left">
				<div id="header-left" class="header-login">
					<span id="text-logo"> WELL COME</span></br> <span id="hint-text-logo">hãy
						tạo lên phong cách của bạn cùng Lưu Cung Quân</span>
				</div>

				<div id="header-bottom">
					<p>
						<span>Luôn cập nhật xu hướng thời trang mới nhất</span>
					</p>
					<p>
						<span> Giảm hơn 50% tất cả các mặt hàng giành cho khách vip</span>
					</p>
					<p>
						<span>tận tình tư vấn để tạo lên phong cách của bạn</span>
					</p>
				</div>
			</div>
			<div class="container-login-right">
				<div id="header-top-right" class="header-login"
					style="cursor: pointer;">


					<span  class="actived" id="dangnhap">Đăng
						nhập</span>/<span id="dangky">Đăng ký</span>



				</div>
				<div id="container-center-right-login">


					<id class="container-login-form" id="container-center-right-login">
					<input id="email" name="email"
						class="mate-textinput-inputicon-email" type="text"
						placeholder="Email"> </br>
					<input id="matKhau" name="matKhau"
						class="mate-textinput-inputicon-password" type="text"
						placeholder="Password"> </br>
					<input id="btdangnhap" class="mate-button" type="submit"
						value="ĐĂNG NHẬP"> </br>
					</id>



					


					<span id="ketQua"></span> <span>${email}</span>



				</div>
				<span style="color: #fff">${kiemTra}</span>
				<div class="soscial-icon">
					<img src='<c:url value="/resources/images/facebook.webp"/>'
						style="height: 35px; width: 35px;"> <img
						src='<c:url value="/resources/images/google.png"/>'
						style="height: 35px; width: 35px;">
				</div>



			</div>
		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>

	<script src='<c:url  value="/resources/js/custom.js"  />'></script>

</body>
</html>