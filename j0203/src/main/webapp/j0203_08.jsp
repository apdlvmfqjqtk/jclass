<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%
	 out.println("서버 : "+request.getServerName()+"<br />");
	 out.println("ip주소 : "+request.getRemoteAddr()+"<br />");
	 out.println("URL : "+request.getRequestURL()+"<br />"); // 서버 전체 주소
	 out.println("URI : "+request.getRequestURI()+"<br />"); // 서버이름 빼고 나머지 주소
	%>
	</body>
</html>