<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	// 세션쪽 아이디, 비밀번호, 그리고 사용자가 폼으로 보낸 비밀번호 얻기
	String spw = (String)session.getAttribute("p_s");	
	String dpw = request.getParameter("dpw");
	String sessionId = (String)session.getAttribute("i_s");
	
	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	if(spw.equals(dpw)){
		// DB연결로직을 집어넣어주세요.
		try{
  			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/ict03";
			
			con = DriverManager.getConnection(url, "root", "mysql");
		
			// 1. SELECT 쿼리문을 작성합니다.
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요.
			String sql = "DELETE FROM users WHERE uid=?";
			
			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sessionId);
	
			// 3. 쿼리문 실행
			pstmt.executeUpdate();
			
		} catch (SQLException e){
			e.printStackTrace();
		} finally{
			// 연결 끊기
			try {
				if(con!=null && !con.isClosed()){
					con.close();
				}
				if(pstmt!=null && !pstmt.isClosed()){
					pstmt.close();
				}
	
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	// DELETE구문이 실행된것과는 별개로 session은 따로 말소시켜야 합니다.
	session.invalidate();
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=sessionId %>의 계정 삭제가 완료되었습니다.</h1><br/>
	<a href="user_login_form.jsp">삭제 확인 및 돌아가기</a>
</body>
</html>