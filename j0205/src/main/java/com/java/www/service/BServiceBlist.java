package com.java.www.service;

import java.util.ArrayList;

import com.java.www.dao.BoardDao;
import com.java.www.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BServiceBlist implements BService {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		//BoardDao 접근
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		BoardDao bdao = new BoardDao();
		list = bdao.blist();
		
		for(BoardDto bdto1 : list) {
			System.out.println("--==-==-=-=-=-");
			System.out.println("bdto글번호 : "+ bdto1.getBno());
			System.out.println("bdto글제목 : "+ bdto1.getBtitle());
			System.out.println("bdto작성자 : "+ bdto1.getBid());
			System.out.println("bdto조회수 : "+ bdto1.getBhit());
		}
		
		request.setAttribute("list", list);
		
	}

}
