<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인페이지</title>
	</head>
	<body>
	 <h2>메인페이지</h2>
	 <ul>
	 <!-- 세션 체크로 로그인 중인지 아닌지 확인 -->
	   <!-- 로그인 전 -->
	   <li><a href="login.do">로그인</a></li>
	   <li><a href="memberInput.do">회원가입</a></li>
	   
	   <!-- 로그인 후 -->
	   <li><a href="logout.do">로그아웃</a></li>
	   <li><a href="blist.do">게시판</a></li>
	   <li><a href="member.do">회원 정보</a></li>
	 </ul>
	</body>
</html>