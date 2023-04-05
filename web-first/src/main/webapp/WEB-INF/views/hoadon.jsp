
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




				<h2>Bảng Form Chi Tiết Hóa Đơn</h2>
				<table class="table table-bordered">
				<thead>
							<tr>
								<th>Mã Hóa Đơn</th>
								<th>Mã Chi Tiết Hóa Đơn</th>
								<th>Số Lượng</th>
								<th>Giá Tiền</th>
								<th></th>
							</tr>
						</thead>
				
						<tbody>
						<c:forEach var="chiTietHoaDon" items="${chitiethoadon}">
							<tr>
								<td>${chiTietHoaDon.chiTietHoaDonID.getMaHoaDon()}</td>
								<td>${chiTietHoaDon.chiTietHoaDonID.getMaChiTietSanPham()}</td>
								<td>${chiTietHoaDon.getGiaTien()}</td>
								<td>${chiTietHoaDon.getSoLuong()}</td>
							</tr>
								</c:forEach>
						</tbody>
					</table>

			
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
				<li><a href="../dashbor/"><i class="fa fa-tachometer"></i>
						<span>Trang Admin</span>
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