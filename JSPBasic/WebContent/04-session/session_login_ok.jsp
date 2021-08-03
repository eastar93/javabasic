<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("UTF-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	
	if(id.equals("kkk1234") && pw.equals("1111")) {
		session.setAttribute("session_id", id);
		session.setAttribute("session_pw", pw);
		session.setAttribute("session_nick", nick);
		response.sendRedirect("session_welcome.jsp");
	} else {
		response.sendRedirect("session_login.jsp");
	}
%>
