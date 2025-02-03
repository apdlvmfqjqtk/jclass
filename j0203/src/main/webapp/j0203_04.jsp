<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- JSP의 주석 --%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>페이지</title>
	</head>
	<body>
	<%! int jj = 0; %> <!-- 선언식 -->
		<%-- 스크립트릿 --%>
		<%
			for(int i=0;i<10;i++){
				out.println(i+"<br />");
			}
		%>
		<hr>
		<% // 구구단 출력
			for(int i=1;i<=9;i++){
				out.print("< "+i+"단 ><br />");
				for(int j=1;j<=9;j++){
					out.println(i+" X "+j+" = "+(i*j)+"<br />");
				}
			}
		%>
		<hr>
		<%
		int k = 0;
		while(k < 10){
			out.println(k+"<br />");
			k++;
		}
		
		%>
	</body>
</html>