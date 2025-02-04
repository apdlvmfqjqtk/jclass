<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="jakarta.servlet.jsp.jstl.sql.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.prefs.PreferenceChangeListener"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터베이스 연결</title>
	</head>
	<body>
	<%! 
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    DataSource ds;
  %>
  
  <%
    try{
    	Context ctx = new InitialContext();
    	Context envContext = (Context)ctx.lookup("java/comp/env");
    	ds = (DataSource)envContext.lookup("ora21");
    	String sql = "select * from board";
    	pstmt = conn.prepareStatement(sql);
    	rs = pstmt.executeQuery();
    	out.println("[ DB접속 ] <br />");
    	
    	while(rs.next()){
    		int bn = rs.getInt("bno");
    		String bt = rs.getString("btitle");
    		String bcon = rs.getString("bcontent");
    		String id = rs.getString("id");
    		int bgr = rs.getInt("bgroup");
    		int bst = rs.getInt("bstep");
    		int bin = rs.getInt("bindent");
    		int bht = rs.getInt("bhit");
    		//out.println("번호 제목 제목 아이디 그룹 스텝 인덴트 히트");
    		out.println(bn+","+bt+","+bcon+","+id+","+bgr+","+bst+","+bin+","+bht);
    	}
    	
    }catch(Exception e){e.printStackTrace();
    }finally{
      try{
          if(rs!=null) rs.close();    
          if(pstmt!=null) pstmt.close();    
          if(conn!=null) conn.close();    
      }catch(Exception e2){e2.printStackTrace();}
    }
  %>
	</body>
</html>