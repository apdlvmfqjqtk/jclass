<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>사원리스트</title>
	</head>
	<body>
	<%! 
	  Connection conn;
	  PreparedStatement pstmt;
	  ResultSet rs;
	%>
	
	<%
    // Page 내 노출됨 -> 문제
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String uid = "ora_user";
    String upw = "1111";
  	String sql = "select * from employees";
    
    try{
    	Class.forName(driver);
    	conn = DriverManager.getConnection(url, uid, upw);
    	pstmt = conn.prepareStatement(sql);
    	rs = pstmt.executeQuery();
    	out.println("[ DB 접속 ] <br />");
    	
    	while(rs.next()){
    		int employee_id = rs.getInt("employee_id");
    		String emp_name = rs.getString("emp_name");
    		out.println("사번/이름 : "+employee_id+","+emp_name+"<br />");
    	}
    	
    }catch(Exception e){
    	try{
    		if(rs!=null) rs.close();		
    		if(pstmt!=null) pstmt.close();		
    		if(conn!=null) conn.close();		
    	}catch(Exception e2){
    		
    	}
    }
	%>
	</body>
</html>