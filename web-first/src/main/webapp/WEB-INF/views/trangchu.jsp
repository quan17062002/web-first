<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>

           <!--kết thúc phần head chuyển sang phần tiếp theo--> 
           
<div  id="info" class="container">
    <div class="row">
      <div class="col-xs-12 col-sm-4 col-lg-4 wow fadeInLeftBig" data-wow-duration="1s">
     <img class="icon" src='<c:url  value="../resources/images/quality-assurance-icon.png" />'alt=""><br/>
     <span  style="font-size: 32px; font: weight 500px;">CHẤT LƯỢNG</span></br>
     <span> chúng tôi cam kết sẽ mang cho các bạn chất lượng sản phẩm tốt nhất </span>
      </div>
      <div class="col-xs-12 col-sm-4 col-lg-4 wow fadeInUpBig"data-wow-duration="1s" data-wow-delay="1s">
        <img class="icon" src= '<c:url  value="../resources/images/saving-pig.png" />'><br/>
        <span  style="font-size: 32px; font: weight 500px;">TIẾT KIỆM CHI PHÍ</span></br>
        <span> Cam kết giá rẻ nhất việt ham giúp các bạn tiết kiệm hơn 20% chi phí </span>
         </div>
         <div class="col-xs-12 col-sm-4 col-lg-4 wow fadeInRight"data-wow-duration="1s" data-wow-delay="2s">
          <img class="icon" src='<c:url value="../resources/images/delivery-truck.png"/>' alt=""><br/>
          <span  style="font-size: 32px; font: weight 500px;">GIAO HÀNG</span></br>
          <span> Cam kết  giao hàng tận nơi và nhanh nhất.Để mang đến cho khách hàng những dịch vụ tốt nhất  </span>
           </div>
    </div>
</div>
<div id="title-product" class="container">
  <span>SẢN PHẨM HOT</span>

  <div class="row">
             <c:forEach var="listSanPham" items="${listSanPham}" >
              <div class="col-md-3">
              <a href="../chitietsanpham/ ${ listSanPham.getMaSanPham() }">
                <div class=" product " style="height: 371 px ;"> 
                <img src='<c:url  value="../resources/images/sanpham/${listSanPham.getHinhSanPham() }" />'alt=""><br/>
                  <span style="font-size: 14px;">${listSanPham.getTenSanPham() }</span><br/>
                  <span class="gia">${listSanPham.getGiaTien() } VNĐ</span>
                </div>
                </a>
              </div>
             </c:forEach>
  
  
             
             
  </div>
</div>

</body>
