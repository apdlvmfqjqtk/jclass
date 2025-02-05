package com.java.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FController  extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		//한글처리
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String page = uri.substring(cPath.length());
		String url = "";
		
		if(page.equals("/login.do")) {
			System.out.println("메인페이지 연결");
			url = "index.jsp";
		}else if(page.equals("/login.do")) {
			System.out.println("로그인 페이지 연결");
			url = "login.jsp";
		}else if(page.equals("/member.do")) {
			System.out.println("회원가입 페이지 연결");
			url = "member.jsp";
		}else if(page.equals("/logout.do")) {
			System.out.println("로그아웃 페이지 연결");
			url = "logout.jsp";
	  }else if(page.equals("/blist.do")) {
		System.out.println("게시판 페이지 연결");
		url = "blist.jsp";
	  }
		
		System.out.println(url);
		response.sendRedirect(url);
		
	}//doAction
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}
}//class