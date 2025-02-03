<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp태그</title>
	</head>
	<body>
	<%-- JSP 주석 --%>
	<!-- 선언식 -->
	<%!
		int no = 10;
		String str = "홍길동";
		int age = 20;
		String address = "서울 영등포구 여의도동";
	%>
	<table>
		<tr>
			<th>학번</th>
			<th><%= no %></th>
		</tr>
		<tr>
			<td>이름</td>
			<td><% out.println(); %></td>
		</tr>
		<tr>
			<td>이름</td>
		</tr>
	</table>
    </body>
</html>