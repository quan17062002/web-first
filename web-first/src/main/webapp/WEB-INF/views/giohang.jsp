<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href='<c:url value = "/resources/styles/trangchu.css"/>' />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<div class=" contanier-fluid" style="background-color: gainsboro;">
		<nav class="navbar navbar-inverse none-nav">
			<div class="container-fluid">
				<div class="navbar-header">
					<a href="../trangchu/" class="navbar-brand" href="#"><img
						src='<c:url value="../resources/images/Wikipedia-logo-v2_2023_Tet_Holiday.svg.png"/>'
						style="height: 40px; margin: -7px;"></a>
				</div>
				<ul class="nav navbar-nav ">
					<li class="active"><a href="../trangchu/">TRANG CHỦ</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"> SẢN PHẨM<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Page 1-1</a></li>
							<li><a href="#">Page 1-2</a></li>
							<li><a href="#">Page 1-3</a></li>
						</ul></li>
					<li><a href="#">DỊCH VỤ</a></li>
					<li><a href="#">LIÊN HỆ</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<c:choose>
						<c:when test="${chuCaiDau != null}">
							<li><a
								style="background: rgb(113, 83, 189); height: 32px; width: 32px; border-radius: 16px; padding: 14px; padding-top: 7px; margin-top: 6px;"
								href="../dangnhap/">${chuCaiDau}</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="../dangnhap/"><span
									class="glyphicon glyphicon-user"></span>Sign Up </a></li>
						</c:otherwise>
					</c:choose>
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>




					<li id="xegiohang"><a href="#"><img
							src='<c:url value="../resources/images/Ic_shopping_cart_48px.svg.png"/>'
							style="height: 25px; margin-right: 0px;"> <c:choose>
								<c:when test="${soLuongSanPham <= 0|| soLuongSanPham== null }">
									<div>
										<span>${soLuongSanPham }</span>
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

	</div>
	<!-- phần đầu   -->
	<div class="container">
		<div class="col-md-12">
		<c:choose>
		<c:when test="${soLuongSanPham >0}">
			<table class="table">
				<thead>
					<tr>
						<td>Tên Sản Phẩm</td>
						<td>Màu Sản Phẩm</td>
						<td>Size</td>
						<td>Số Lượng</td>
						<td><h4></h4></td>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="lisGioHangs" items="${lisGioHangs}">
					
						<tr>
						<td>${lisGioHangs.getTenSanPham() }</td>
							<td class="maMau" data-maMau="${lisGioHangs .getMaMau()}">${lisGioHangs.getTenMau()}</td>
							<td class="maSize" data-maSize="${lisGioHangs.getMaSize()}">${lisGioHangs.getTenSize()}</td>
							<td class="soluong">${lisGioHangs .getSoLuong()}</td>
							<td class="btn btn-danger">Xóa</td>
						</tr>
					</c:forEach>


				</tbody>
			</table>
			</c:when>
			<c:when test="${lisGioHangs ==null }">
			<h2> HIỆN CHƯA CÓ SẢN PHẨM NÀO</h2>
			</c:when>
			</c:choose>
		</div>
	</div>
	<!-- phần cuối -->
	<div id="footer" class="container-fluid">
		<div class="row">
			<div class=" col-md-4">
				<p>
					<span class="tile-footer">THÔNG TIN SHOP</span>
				</p>
				<span>Thời trang uy tín ,luôn đảm bảo chất lượng sản phẩm tốt
					nhất cho khách hành</span>

			</div>
			<div class="col-md-4">
				<p>
					<span class="tile-footer">LIÊN HỆ</span>
				</p>
				<span> xóm 1 ,Đò Sỹ Thanh Hà Hải Dương</span><br /> <span>luucungquanth2002@gmail.com</span><br />
				<span>0362011615</span>
			</div>
			<div class="col-md-4">
				<p>
					<span class="tile-footer">GÓP Ý</span>
				</p>
				<input class="text-quan" type="text" placeholder="Email" /><br />
				<textarea rows="4" cols="50" placeholder="Nội Dung"></textarea>
				<button class="foote-button">Đồng ý</button>
			</div>
		</div>
	</div>

	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src='<c:url  value="/resources/js/wow.js"  />'></script>
	<script src='<c:url  value="/resources/js/wow.min.js"  />'></script>
	<script src='<c:url  value="/resources/js/custom.js"  />'></script>

	<script>
		new WOW().init();
	</script>
</body>
</html>