<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<%@ include file = "/WEB-INF/views/include/include-head.jspf" %>
</head>
<body>
	<header>
		<div>
			<h2>Short Navi</h2>
		</div>
	</header>
	<%@ include file="/WEB-INF/views/include/include-nav.jspf"%>

	<section id="main"></section>


</body>
</html>