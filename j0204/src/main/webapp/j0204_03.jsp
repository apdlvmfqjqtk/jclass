<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>해당값 반복</title>
	</head>
	<body>
	
	<!--  1,10 -->
	<div>기존 방식</div>
	<div>시작값 : <%= request.getParameter("st") %></div>
	<div>종료값 : <%= request.getParameter("ed") %></div>
	<hr>
	<div>기존 방식</div>
	<div>시작값 : ${param.st}</div>
	<div>종료값 : ${param.ed}</div>
	
	<c:forEach begin="${param.st}" end="${param.ed}" step="1" var="i">
	 <div>반복 : ${i}</div>
	</c:forEach>
	
	</body>
</html>