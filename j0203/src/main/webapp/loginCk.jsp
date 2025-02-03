<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 쿠키</title>
	</head>
	<body>
	<!-- 아이디 쿠키에저장 변수명 : cook_id 변수값은 입력한 데이터 -->
	 <%
	  String cookieName = "cook_id"; 
	  String cookieValue = request.getParameter("id");
	  String saveId = request.getParameter("saveId");
	  
    
    if(saveId != null){
		  Cookie cookie = new Cookie(cookieName,cookieValue);
		  cookie.setMaxAge(60*60*24*30); 
	    response.addCookie(cookie);
	    
  %>
  <div><%= saveId %> (가)이 저장되었습니다.</div>
	  <%}else{ 
	     Cookie[] cookies = request.getCookies();
	     for(Cookie cookie : cookies){
	    	 if(cookie.getName().equals("cook_id")){
	    		 cookie.setMaxAge(0);
	    		 response.addCookie(cookie);
	    	 }
	     }
	  %>
  <div>쿠키에 저장된 cook_id가 삭제되었습니다.</div>
	  	
	  <% } %>
  <div>정보 : <%= saveId %></div>
	 <button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	</body>
</html>