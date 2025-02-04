<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!-- 변수, 흐름제어(for,if,switch) 변수출력 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl 페이지</title>
	</head>
	<body>
  <% String sid  = "aaa"; %>	
  <div>스크립트릿 id : <%=sid %></div>
  <hr>
  <c:set var="id" value="aaa" />
  <div>jstl 변수값 : ${id}</div>
  <c:out value="${id}" />
  
  <!-- if문 -->
  <c:if test="${id == 'bbb'}">
    <div>id는 bbb 입니다.</div>
  </c:if>
  <!-- else가 따로 없어서 이렇게 한번 더 적어줘야 하는 것은 불편 -->
  <c:if test="${id != 'bbb'}">
    <div>id는 bbb가 아닙니다. 정답 : ${id}</div>
  </c:if>
  
  <% for(int i=0;i<10;i++){ %>
  <% } %>
  <c:forEach begin="1" end="10" step="1" var="i">
    <div>i변수값 : ${i}</div>  
  </c:forEach>
  
  <hr>
  
  <c:set var='score' value="55"/>
  <c:choose>
    <c:when test="${score >=90 }">
      <div>성적 : A</div>
    </c:when>
    <c:when test="${score >=80 }">
      <div>성적 : B</div>
    </c:when>
    <c:when test="${score >=70 }">
      <div>성적 : C</div>
    </c:when>
    <c:when test="${score >=60 }">
      <div>성적 : D</div>
    </c:when>
    <c:otherwise>
      <div>성적 : F</div>
    </c:otherwise>
  </c:choose>
  
  
	</body>
</html>