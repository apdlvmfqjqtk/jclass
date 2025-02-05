package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.BoardDto;

public class BoardDao {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	ArrayList<BoardDto> list;

	int bno, bgroup, bstep, bindent, bhit;
	String btitle, bcontent, id;

	public ArrayList<BoardDto> blist() {
		conn = getConnection();
		list = new ArrayList<BoardDto>();
		try {
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				bno = rs.getInt("bno");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				id = rs.getString("id");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bhit = rs.getInt("bhit");
//   	BoardDto b = new BoardDto(bno, btitle, bcontent, id, bgroup, bstep, bindent, bhit);
//   	list.add(b);
				list.add(new BoardDto(bno, btitle, bcontent, id, bgroup, bstep, bindent, bhit));
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