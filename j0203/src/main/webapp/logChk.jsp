<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<!-- html주석: 소스보기에 나타남 -->
	<%-- jsp주석 : html 소스보기에 안나타남 --%>
	<!-- 저장되었는지, 삭제되었는지 출력 -->
	<% 
	String ckN = "cook_id";
	String ckV = request.getParameter("id");
	String svId = request.getParameter("idsave");
	
	if(svId != null){
		Cookie cookie = new Cookie(ckN,ckV);
		cookie.setMaxAge(60*60*365); // 1년
	
	%>
	<div><%= ckN %> 저장완료</div>
	<%}else{ 
		 Cookie[] cookies = request.getCookies();
     for(Cookie cookie : cookies){
       if(cookie.getName().equals("cook_id")){
         cookie.setMaxAge(0);
         response.addCookie(cookie);
       }
     }
	%>
	
	<div>쿠키 삭제되었습니다.</div>
	<%} %>
	<button onclick="javascript:location.href='logOk.jsp'">이동하기</button>
	</body>
</html>