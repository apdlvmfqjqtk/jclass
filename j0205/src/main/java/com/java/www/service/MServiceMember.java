package com.java.www.service;

import java.lang.reflect.Member;
import java.util.ArrayList;

import com.java.www.dao.BoardDao;
import com.java.www.dao.MemberDao;
import com.java.www.dto.BoardDto;
import com.java.www.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MServiceMember implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//BoardDao 접근
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDao mbao = new MemberDao();
		list = mbao.mlist();
		
		for(MemberDto mbao1 : list) {
			System.out.println("--==-==-=-=-=-");
			System.out.println("아이디 : "+ mbao1.getId());
			System.out.println("패스워드 : "+ mbao1.getPw());
			System.out.println("이름 : "+ mbao1.getName());
			System.out.println("전화번호 : "+ mbao1.getTel());
			System.out.println("성별 : "+ mbao1.getGender());
			System.out.println("취미 : "+ mbao1.getHobby());
		}
		
		request.setAttribute("list", list);
		
	}


}
