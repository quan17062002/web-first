
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Pooled Admin Panel Category Flat Bootstrap Responsive Web
	Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 




</script>
<link rel="stylesheet"
	href='<c:url value = "/resources/styles/style.css"/>' />
<!-- Bootstrap Core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- Custom CSS -->
<link href='<c:url value="/resources/web/css/style.css" />'
	rel='stylesheet' type='text/css' />
<link rel="stylesheet"
	href='<c:url value="/resources/web/css/morris.css"/>' type="text/css" />
<!-- Graph CSS -->
<link rel="stylesheet"
	href='<c:url value="/resources/web/css/font-awesome.css" />'>
<!-- jQuery -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<!-- Thư viện jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<!-- Bootstrap JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>

<!-- //jQuery -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet"
	href='<c:url value="/resources/web/css/icon-font.min.css" />'
	type='text/css' />
<!-- //lined-icons -->
</head>
<body>
	<div class="page-container">
		<!--/content-inner-->
		<div class="left-content container">
			<div class="row container">

				<div class="col-md-6 col-sm -12">

					<h2>Thêm Sản Phẩm</h2>
					<form id="form_sanpham" action="">


						<label for="tenSanPham">Tên sản phẩm:</label> <input type="text"
							class="form-control" id="tenSanPham" name="tenSanPham" required>

						<label for="danhMucSanPham" class="form-label"
							style="font-weight: 400";>Danh Mục Sản Phẩm:</label> <select
							class="form-select" id="danhMucSanPham" name="danhMucSanPham"
							style="padding: 5px; width: 100%;">
							<c:forEach var="danhMucSanPham" items="${ danhMucSanPham}">
								<option value="${danhMucSanPham.getMaDanhMuc() }">${danhMucSanPham.getTenDanhMuc()}</option>
							</c:forEach>
						</select> <br> <label for="moTa">Mô tả:</label>
						<textarea class="form-control" id="moTa" name="moTa"></textarea>
						<label for="giaTien">Giá:</label> <input
							class="form-control" id="giaTien" name="giaTien" required>



						<span>Giành Cho</span> <label
							class="form-check-label radio-inline" for="gianhCho"> <input
							type="radio" class="form-check-input" id="rd-nam"
							name="gianhCho" value="Nam" checked>Nam
						</label> <label class="form-check-label radio-inline" for="gianhCho">
							<input type="radio" class="form-check-input" id="rd-nu"
							name="gianhCho" value="Nữ">Nữ
						</label></br> <label for="hinhSanPham">Ảnh sản phẩm:</label> <input type="file"
							class="form-control-file" id="hinhSanPham" name="hinhSanPham">

						<div id="containerchitietsanpham">
							<div class="chiTietSanPham">

								<h3>Chi Tiết Sản Phẩm</h3>
								</br> <label for="danhSachMauSanPham" class="form-label"
									style="font-weight: 400";>Màu Sản Phẩm</label> <select
									class="form-select" id="danhSachMauSanPham"
									style="padding: 5px; width: 100%;">
									<c:forEach var="danhSachMauSanPham"
										items="${ danhSachMauSanPham}">
										<option value="${danhSachMauSanPham.getMaMau() }">${danhSachMauSanPham.getTenMau()}</option>
									</c:forEach>
								</select> <br> <label for="laySizeSanPham" class="form-label"
									style="font-weight: 400";>Size Sản Phẩm</label> <select
									class="form-select" id="laySizeSanPham"
									style="padding: 5px; width: 100%;">
									<c:forEach var="laySizeSanPham" items="${ laySizeSanPham}">
										<option value="${laySizeSanPham.getMaSize() }">${laySizeSanPham.getSize()}</option>
									</c:forEach>
								</select> <br> <label for="soLuong">Số lượng:</label> <input min="1"
									value="1" type="number" class="form-control" id="soLuong"
								name="soLuong">

								<button type="button" id = "themchitietsanpham"
									class="btn btn-primary float-right btn-themchitiet "
									style="margin: 22px; margin-left: 10px;">Thêm Chi Tiết</button>
							</div>
						</div>


						<div id="chitietsanpham" class="chiTietSanPham">

							<h3>Chi Tiết Sản Phẩm</h3>
							</br> <label for="danhSachMauSanPham" class="form-label"
								style="font-weight: 400";>Màu Sản Phẩm</label> <select
								class="form-select" id="danhSachMauSanPham"
								style="padding: 5px; width: 100%;">
								<c:forEach var="danhSachMauSanPham"
									items="${ danhSachMauSanPham}">
									<option value="${danhSachMauSanPham.getMaMau() }">${danhSachMauSanPham.getTenMau()}</option>
								</c:forEach>
							</select> <br> <label for="laySizeSanPham" class="form-label"
								style="font-weight: 400";>Size Sản Phẩm</label> <select
								class="form-select" id="laySizeSanPham"
								style="padding: 5px; width: 100%;">
								<c:forEach var="laySizeSanPham" items="${ laySizeSanPham}">
									<option value="${laySizeSanPham.getMaSize() }">${laySizeSanPham.getSize()}</option>
								</c:forEach>
							</select> <br> <label for="soLuong">Số lượng:</label> <input min="1"
								value="1" type="number" class="form-control" id="soLuong"
								name="soLuong">

							<button type="button" id = "themchitietsanpham"
								class="btn btn-primary float-right btn-themchitiet "
								style="margin: 22px; margin-left: 10px;">Thêm Chi Tiết</button>

						</div>
						
                        <button type="submit" id="btnThemSanPham" class="btn btn-primary float-right  " style="margin: 22px;">Thêm sản phẩm</button>
                        <div class = "nutcapnhatsanpham hidden" style="display: flex;">
                        <button type="submit" id="btncapnhatsanpham" class="btn btn-primary  " style="margin: 22px;">cập Nhật Sản Phẩm</button>
						<button type="submit" id="btnxoacapnhatsanpham" class="btn btn-primary  " style="margin: 22px;">Xóa Cập Nhật</button>
                       </div>
					</form>



				</div>
				<div class="col-md-6 col-sm -12">
					<h2>Sản Phẩm</h2>


					<table id="phantrang-dashbor" class="table">
						<thead>
							<tr>
								<th>

									<div id="checkall" class="form-check">
										<label class="form-check-label"> <input
											type="checkbox" class="form-check-input" value="">
										</label>
									</div>
								</th>
								<th>Tên Sản Phẩm</th>
								<th>Giá Tiền</th>
								<th>Giành Cho</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="lisGioHangs" items="${lisPhams}">
								<tr>
									<td><div class="form-check">
											<label class="form-check-label"> <input
												type="checkbox" class="form-check-input"
												value="${lisGioHangs.getMaSanPham()}">
											</label>
										</div></td>
									<td class="tenSanPham"
										data-maSanPham="${lisGioHangs.getMaSanPham()}">${lisGioHangs.getTenSanPham() }</td>
									<td class="giaTien" data-giatien="${lisGioHangs.getGiaTien() }"><span>${lisGioHangs.getGiaTien() }</span></td>
									<td class="danhCho"
										data-danhcho="${lisGioHangs.getGianhCho() }">${lisGioHangs.getGianhCho() }</td>
                                    <td class = "capNhatSanPham " data-id = "${lisGioHangs.getMaSanPham()}" >   <button type="button" class="btn btn-success">Update</button></td>
								</tr>
							</c:forEach>
						</tbody>


					</table>
					<div style="padding-bottom: 20px; float: right;">
						<button style="width: 127px; margin: 18px" type="button"
							id="xoa-sanpham" class="btn btn-danger ">Xóa</button>
					</div>

					<ul class="pagination pagination-sm">
						<li class="lentren"><a href="#">&laquo;</a></li>
						<c:forEach var="i" begin="1" end="${tongSanPham}">
							<c:choose>
								<c:when test="${i == 1}">

									<li style="cursor: pointer;" class="active page-item"><a>${i }</a></li>
								</c:when>

								<c:otherwise>
									<li style="cursor: pointer;" class=" page-item"><a>${i}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<li class=xuongduoi><a href="#">&raquo;</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="sidebar-menu">
			<header class="logo1">
				<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
				</a>
			</header>
			<div style="border-top: 1px ridge rgba(255, 255, 255, 0.15)"></div>
			<div class="menu">
				<ul id="menu">
					<li><a href="../dashbor/"><i class="fa fa-tachometer"></i> <span>Trang
								Admin</span>
							<div class="clearfix"></div></a></li>


					<li id="menu-academico"><a href="../themsanpham/"><i
							class="fa fa-plus nav_icon"></i><span>Thêm Sản Phẩn</span>
							<div class="clearfix"></div></a></li>
							
							
							
							
					<li><a href="../hoadon/"><i class="fa fa-money"
							aria-hidden="true"></i><span> Hóa Đơn</span>
							<div class="clearfix"></div></a></li>
							
							
							
							
							
					<li id="menu-academico"><a href="charts.html"><i
							class="fa fa-bar-chart"></i><span>Charts</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="#"><i
							class="fa fa-list-ul" aria-hidden="true"></i><span> Short
								Codes</span> <span class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="icons.html">Icons</a></li>
							<li id="menu-academico-avaliacoes"><a href="typography.html">Typography</a></li>
							<li id="menu-academico-avaliacoes"><a href="faq.html">Faq</a></li>
						</ul></li>
					<li id="menu-academico"><a href="errorpage.html"><i
							class="fa fa-exclamation-triangle" aria-hidden="true"></i><span>Error
								Page</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="#"><i class="fa fa-cogs"
							aria-hidden="true"></i><span> UI Components</span> <span
							class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-avaliacoes"><a href="button.html">Buttons</a></li>
							<li id="menu-academico-avaliacoes"><a href="grid.html">Grids</a></li>
						</ul></li>
					<li><a href="tabels.html"><i class="fa fa-table"></i> <span>Tables</span>
							<div class="clearfix"></div></a></li>
					<li><a href="maps.html"><i class="fa fa-map-marker"
							aria-hidden="true"></i> <span>Maps</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="#"><i
							class="fa fa-file-text-o"></i> <span>Pages</span> <span
							class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul id="menu-academico-sub">
							<li id="menu-academico-boletim"><a href="calendar.html">Calendar</a></li>
							<li id="menu-academico-avaliacoes"><a href="signin.html">Sign
									In</a></li>
							<li id="menu-academico-avaliacoes"><a href="signup.html">Sign
									Up</a></li>


						</ul></li>
					<li><a href="#"><i class="fa fa-check-square-o nav_icon"></i><span>Forms</span>
							<span class="fa fa-angle-right" style="float: right"></span>
							<div class="clearfix"></div></a>
						<ul>
							<li><a href="input.html"> Input</a></li>
							<li><a href="validation.html">Validation</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}

					toggle = !toggle;
				});
	</script>
	<!--js -->

	<scriptsrc='<c:url  value="/resources/web/js/jquery.nicescroll.js"  />'>
	</script> <script src='<c:url  value="/resources/web/js/scripts.js"  />'></script>
	<script src='<c:url  value="/resources/web/js/bootstrap.min.js"  />'></script>
	<script src='<c:url  value="/resources/web/js/raphael-min.js"  />'></script>
	<script src='<c:url  value="/resources/web/js/morris.js"  />'></script>
	<script>
		$(document).ready(
				function() {
					//BOX BUTTON SHOW AND CLOSE
					jQuery('.small-graph-box').hover(function() {
						jQuery(this).find('.box-button').fadeIn('fast');
					}, function() {
						jQuery(this).find('.box-button').fadeOut('fast');
					});
					jQuery('.small-graph-box .box-close').click(function() {
						jQuery(this).closest('.small-graph-box').fadeOut(200);
						return false;
					});

					//CHARTS
					function gd(year, day, month) {
						return new Date(year, month - 1, day).getTime();
					}

					graphArea2 = Morris.Area({
						element : 'hero-area',
						padding : 10,
						behaveLikeLine : true,
						gridEnabled : false,
						gridLineColor : '#dddddd',
						axes : true,
						resize : true,
						smooth : true,
						pointSize : 0,
						lineWidth : 0,
						fillOpacity : 0.85,
						data : [ {
							period : '2014 Q1',
							iphone : 2668,
							ipad : null,
							itouch : 2649
						}, {
							period : '2014 Q2',
							iphone : 15780,
							ipad : 13799,
							itouch : 12051
						}, {
							period : '2014 Q3',
							iphone : 12920,
							ipad : 10975,
							itouch : 9910
						}, {
							period : '2014 Q4',
							iphone : 8770,
							ipad : 6600,
							itouch : 6695
						}, {
							period : '2015 Q1',
							iphone : 10820,
							ipad : 10924,
							itouch : 12300
						}, {
							period : '2015 Q2',
							iphone : 9680,
							ipad : 9010,
							itouch : 7891
						}, {
							period : '2015 Q3',
							iphone : 4830,
							ipad : 3805,
							itouch : 1598
						}, {
							period : '2015 Q4',
							iphone : 15083,
							ipad : 8977,
							itouch : 5185
						}, {
							period : '2016 Q1',
							iphone : 10697,
							ipad : 4470,
							itouch : 2038
						}, {
							period : '2016 Q2',
							iphone : 8442,
							ipad : 5723,
							itouch : 1801
						} ],
						lineColors : [ '#ff4a43', '#a2d200', '#22beef' ],
						xkey : 'period',
						redraw : true,
						ykeys : [ 'iphone', 'ipad', 'itouch' ],
						labels : [ 'All Visitors', 'Returning Visitors',
								'Unique Visitors' ],
						pointSize : 2,
						hideHover : 'auto',
						resize : true
					});

				});
	</script> <script src='<c:url  value="/resources/js/custom.js"  />'></script>
</body>
</html>