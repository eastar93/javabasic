package kr.co.ictedu.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.*;
import javax.sql.DataSource;

public class BoardDAO {
	// 싱글턴 패턴과 커넥션풀을 적용해서
	// DAO의 연결부(생성자, getInstance()) 까지 작성해주세요.
	
	private DataSource ds;

	private static BoardDAO dao = new BoardDAO();
	
	private BoardDAO() {
		
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (NamingException e) {
			e.printStackTrace();
		}	
	}

	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
	public int write(BoardVO board) {
		// Connection, PreparedStatement 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int resultCode;
		
		// 구문 작성
		// bid는 auto_increment가 붙어있으므로 입력 안해도 됨
		// bName, bTitle, bContent는 폼에서 날려준걸 넣음
		// bHit는 자동으로 0으로 입력됨
		String sql = "INSERT INTO jspboard" +
					"(bname, btitle, bcontent, bdate, bhit) " +
					"VALUES (?, ?, ?, now(), 0)";
		
		try {
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세요
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, board.getBname());
			pstmt.setString(2, board.getBtitle());
			pstmt.setString(3, board.getBcontent());
			
			pstmt.executeUpdate();
			resultCode = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				} 
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	}
}
