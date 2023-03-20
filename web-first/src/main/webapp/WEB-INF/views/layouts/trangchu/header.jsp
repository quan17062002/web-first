<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href='<c:url value = "/resources/styles/trangchu.css"/>' />

<div id="header" class=" contanier-fluid">
	<nav class="navbar navbar-inverse none-nav">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"><img
					src='<c:url value="../resources/images/Wikipedia-logo-v2_2023_Tet_Holiday.svg.png"/>'
					style="height: 40px; margin: -7px;"></a>
			</div>
			<ul class="nav navbar-nav ">
				<li class="active"><a href="">TRANG CHỦ</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> SẢN PHẨM<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach var="danhmucsanpham" items="${danhMucSanPham }">
						<li><a href="../sanpham/${danhmucsanpham.getMaDanhMuc()}/${danhmucsanpham.getTenDanhMuc()}">${danhmucsanpham.getTenDanhMuc()}</a></li>
					</c:forEach>
					</ul></li>
				<li><a href="#">DỊCH VỤ</a></li>
				<li><a href="#">LIÊN HỆ</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${chuCaiDau != null}">
						<li><a style="background:rgb(113, 83, 189);height: 32px;width: 32px;border-radius: 16px;padding: 14px;padding-top: 7px;margin-top: 6px;" href="../dangnhap/">${chuCaiDau}</a></li>
					</c:when>
					<c:otherwise>
						<li ><a href="../dangnhap/"><span
								class="glyphicon glyphicon-user"></span>Sign Up </a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
				<li><a href="../giohang/"><img
						src='<c:url value="../resources/images/Ic_shopping_cart_48px.svg.png"/>'
						style="height: 25px; margin-right: 0px;">
						<c:choose>
								<c:when test="${soLuongSanPham <= 0|| soLuongSanPham== null }">
									<div>
										<span></span>
									</div>
								</c:when>

								<c:when test="${soLuongSanPham > 0 }">
									<div class="xeGioHang">
										<span>${soLuongSanPham }</span>
									</div>
								</c:when>

							</c:choose> </a></li>
			</ul>
		</div>
	</nav>
	<div class="event_header container wow bounceInUp"
		data-wow-duration="2s">
		<span>ngày tháng năm</span><br /> <span style="font-size: 50px;">MUA
			1 TẶNG 1</span><br />
		<button>Xem ngay</button>



	</div>

</div>
