<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("UTF-8");	
	
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");

	// 세션이 존재할 때는 DB에서 데이터를 가져오는 로직을 생략해주세요.
	String idSession = (String)session.getAttribute("i_s");

	if(idSession != null) {
		uid = idSession;
	} else {	
		// 1. dao 생성
		UsersDAO dao = UsersDAO.getInstance();
			
		// 2. dao로 로그인 검사
		UsersVO user = new UsersVO();
		user.setUid(uid);
		user.setUpw(upw);
		
		int loginResultNum = dao.usersLogin(user);
		
		if(loginResultNum == 1) {
			session.setAttribute("i_s", uid);
			session.setAttribute("p_s", upw);
		} else if (loginResultNum == 0) {
			response.sendRedirect("user_login_fail.jsp");
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=uid %>님 환영합니다.</h1>
	<h1>로그인이 완료되었습니다.</h1>
	<a href="user_logout.jsp">로그아웃하기</a><br/>
	<a href="user_update_form.jsp">회원정보수정</a><br/>
	<a href="user_delete_form.jsp">회원탈퇴하기</a>
</body>
</html>