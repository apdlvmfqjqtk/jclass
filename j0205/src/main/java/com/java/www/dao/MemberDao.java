package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.BoardDto;
import com.java.www.dto.MemberDto;

public class MemberDao {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	ArrayList<MemberDto> list = null;
	
	String id, pw, name, tel, gender, hobby;
	
	public ArrayList<MemberDto> mlist() {
		conn = getConnection();
		list = new ArrayList<MemberDto>();
		try {
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				tel = rs.getString("id");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				list.add(new MemberDto(id, pw, name, tel, gender, hobby));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // finally

		return list;
	}

	public Connection getConnection() {
		Connection connection = null;

		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("ora21");
			connection = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}

}// class