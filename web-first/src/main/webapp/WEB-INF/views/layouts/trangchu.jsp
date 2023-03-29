<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href ='<c:url value = "/resources/styles/trangchu.css"/>'/>
<link rel="stylesheet" href ='<c:url value = "/resources/styles/animate.css"/>'/>
<meta charset="UTF-8">
<title>LƯU CUNG QUÂN</title>
</head>
<body >

	<%@include file="/WEB-INF/views/layouts/trangchu/header.jsp"%>
	<decorator:body />
	<%@include file="/WEB-INF/views/layouts/trangchu/footer.jsp"%>

</body>
</html>