package kr.co.ictedu;

import java.sql.*;

//DAO클래스는 DB연동을 전담해 처리합니다.
public class UsersDAO {
	
	// DB주소 아이디 패스워드 미리 저장
	private static final String URL = "jdbc:mysql://localhost/ict03";
	private static final String DBID = "root";
	private static final String DBPW = "mysql";
	
	/*
	 * DAO 클래스는 하나의 객체만으로도 DB연동을 수행할 수 있기 때문에
	 * 메모리 관리 차원에서 클래스의 객체를 단 1개만 생성하도록
	 * 싱글톤 패턴을 적용하여 클래스를 디자인합니다.
	 */
	
	// 싱글톤 패턴 클래스 디자인 방법
	// 1. 외부에서 객체를 new 키워드로 만들어 쓸 수 없도록 생성자에 
	// private을 붙여줍니다.
	private UsersDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2. 외부에서 객체생성을 못 하기 때문에 자기 클래스 내부에서 그냥
	// 스스로 자기 자신을 1개 생성합니다.
	private static UsersDAO dao = new UsersDAO();
	
	// 3. 외부에서 객체 생성이 필요할 때 public 선언으로 처리한
	// getter를 이용해 2에서 만든 객체를 리턴만 해줍니다.
	// 이러면 UsersDAO는 참조형 변수이기 때문에 주소값만 전달합니다.
	public static UsersDAO getInstance() {
		return dao;
	}
	
	// 회원가입을 처리하는 메서드를 선언
	// DB에 들어가는 데이터 혹은 DB에서 출력되어 나오는 데이터
	// 모두가 UsersVO 내부 자료 형식을 벗어날 수 없으므로
	// 대다수 입출력은 전부 VO를 매개로 진행합니다.
	public int joinUsers(UsersVO user) {
		//users_join.jsp에서 가져온 코드를 이곳에 붙여넣기를 합니다.
		
		//DB연동을 위한 Connector 설정
		// Connection 객체 생성
		Connection con = null;
		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;

		try {
			
			// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
			con = DriverManager.getConnection(URL, DBID, DBPW);
			
			// 1. INSERT 쿼리문을 작성합니다.
			String sql = "INSERT INTO users VALUES(?, ?, ?, ?)";
			
			// 2. 만큰 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣습니다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getUpw());
			pstmt.setString(3, user.getUname());
			pstmt.setString(4, user.getEmail());
			
			//3. 만든 쿼리문 실행하기
			pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				// con 닫기
				if(con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}// end joinUsers
	
	/*
	 * public int loginUser(UsersVO users) {
	 * 
	 * Connection con = null; PreparedStatement pstmt = null; ResultSet rs = null;
	 * 
	 * if(users.getIdSession() != null) { users.setUid(users.getIdSession()); } else
	 * { //DB연결 로직을 집어넣어주세요 try { Class.forName("com.mysql.cj.jdbc.Driver");
	 * 
	 * String url = "jdbc:mysql://localhost/ict03";
	 * 
	 * con = DriverManager.getConnection(URL, DBID, DBPW);
	 * 
	 * // 1. SELECT 쿼리문을 작성합니다. // 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요. String
	 * sql = "SELECT * FROM users WHERE uid = ?";
	 * 
	 * // 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다. pstmt = con.prepareStatement(sql);
	 * pstmt.setString(1, users.getUid());
	 * 
	 * // 3. 쿼리문 실행 및 데이터 받아오기 rs = pstmt.executeQuery();
	 * 
	 * // rs.next()를 통해 데이터가 들어왔는지 안 들어왔는지 확인 if(rs.next()) {
	 * 
	 * // 들어왔다면 DB쪽 데이터 받기 String dbId = rs.getString("uid"); String dbPw =
	 * rs.getString("upw");
	 * 
	 * // 폼에서 보낸 데이터와 DB쪽 데이터간 아이디 비밀번호 일치여부 비교해서 // 아이디와 비밀번호 모두 일치시 세션 발급 및
	 * body태그에 id 출력 if(users.getUid().equals(dbId) && users.getUpw().equals(dbPw))
	 * { session.setAttribute("i_s", users.getUid()); session.setAttribute("p_s",
	 * users.getUpw()); } else { // 비밀번호가 틀린 경우 역시 user_login_fail.jsp로 보내줌.
	 * response.sendRedirect("user_login_fail.jsp"); } } else { // DB데이터가 들어오지 않았다면
	 * user_login_fail.jsp로 리다이렉트 response.sendRedirect("user_login_fail.jsp"); }
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } finally { try { if(con !=
	 * null && !con.isClosed()) { con.close(); } if(pstmt != null &&
	 * !pstmt.isClosed()) { pstmt.close(); } if(rs != null && !rs.isClosed()) {
	 * rs.close(); } } catch (SQLException e) { e.printStackTrace(); } } } }
	 */
}

