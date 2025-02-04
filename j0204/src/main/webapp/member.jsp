<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
	 <h2>회원가입</h2>
	 <form action="j0204_07.jsp" method="post">
	   <label>아이디</label>
	   <input type="text" name="id"><br />
	   <label>패스워드</label>
	   <input type="text" name="pw"><br />
	   <label>이름</label>
	   <input type="text" name="name"><br />
	   <label>전화번호</label>
	   <input type="text" name="tel"><br />
	   <label>성별</label><br />
	   <input type="radio" name="gender" id="man" value="man">
	   <label for="man">남성</label>
	   <input type="radio" name="gender" id="woman" value="woman">
	   <label for="woman">여성</label>
	   <br />
     <label>취미</label><br /> 
	   <input type="checkbox" id="game" name="hobby" value="game">
	   <label for="game">게임</label>
	   <input type="checkbox" id="golf" name="hobby" value="golf">
	   <label for="golf">골프</label>
	   <input type="checkbox" id="swim" name="hobby" value="swim">
	   <label for="swim">수영</label>
	   <input type="checkbox" id="run" name="hobby" value="run">
	   <label for="run">조깅</label>
	   <input type="checkbox" id="book" name="hobby" value="book">
	   <label for="book">독서</label>
	   
	 </form>
	</body>
</html>