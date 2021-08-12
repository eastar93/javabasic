package kr.co.ictedu.board.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.naming.*;
import javax.sql.DataSource;

public class BoardDAO {
	// 싱글턴 패턴과 커넥션풀을 적용해서
	// DAO의 연결부(생성자, getInstance()) 까지 작성해주세요.
	
	private static final int WRITE_SUCCESS = 1;
	private static final int WRITE_FAIL = 0;
	private static final int DELETE_SUCCESS = 1;
	private static final int DELETE_FAIL = 0;
	private static final int UPDATE_SUCCESS = 1;
	private static final int UPDATE_FAIL = 0;
	
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
			resultCode = WRITE_SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			resultCode = WRITE_FAIL;
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
	} // end write 
	
	// 모든 게시글의 정보를 DB로부터 얻어올 메서드
	public List<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		List<BoardVO> boardList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// SQL문 작성
		String sql = "SELECT * FROM jspboard ORDER BY bid DESC";
		
		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// boardList에 DB내 모든 글을 저장해주세요.
			while(rs.next()) {
				BoardVO board = new BoardVO();
				
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
				
				// List<BoardVO>변수에 값을 넣어주는 로직
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if(rs != null && !rs.isClosed()) {
				rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return boardList;	
	} // end getBoardList 
	
	// 글 하나에 대한 상세 정보를 가져오는 로직	
	public BoardVO getBoardDetail(String bid) {
		// bid에 해당하는 글 정보를 가져와서 리턴하도록 로직을 작성해주세요.
		BoardVO board = new BoardVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM jspboard WHERE bid = ?";
		
		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,  bid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if(rs != null && !rs.isClosed()) {
				rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}// end getBoardDetail
	
	// 글 삭제 로직
	public int DeleteBoard(String bid) {
		//사용할 변수들 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int DelResultCode;
		
		String sql = "DELETE FROM jspboard WHERE bid = ?";
		
		
		//커넥션 연결 및 쿼리문 실행
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  bid);
			
			pstmt.executeUpdate();
			DelResultCode = DELETE_SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			DelResultCode = DELETE_FAIL;
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
		//모든 로직 종료 후 결과코드 리턴
		return DelResultCode;
	}// end DeleteBoard
	
	// 글 수정 로직
	public int UpdateBoard(BoardVO board) {
		// 변수 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int UpdateResultCode;
		
		String sql = "UPDATE jspboard SET btitle = ?, bcontent = ? "
				+ "WHERE bid = ?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setInt(3, board.getBid());
			
			pstmt.executeUpdate();
			UpdateResultCode = UPDATE_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			UpdateResultCode = UPDATE_FAIL;
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
		return UpdateResultCode;
	}// end UpdateBoard
	
	// 글 조회수를 상승시키는 메서드
	public void UpHit(String bid) {
		// 필요한 변수들을 생성해주세요
		Connection con = null;
		PreparedStatement pstmt = null;
		
		// 특정 글의 조회수를 1 올리는 쿼리문
		String sql = "UPDATE jspboard SET bHit = bHit + 1 WHERE bid = ?";
				
		// DB연결 후 코드를 실행해주세요 		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
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
	} // end UpHit
}

