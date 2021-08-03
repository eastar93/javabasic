<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 연결로직을 만들어주세요.
	Connection con = null;

	// MySQL 과 연동할것임을 나타냄.
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// 접속 URL은 jdbc:mysql://localhost/db명
	String url = "jdbc:mysql://localhost/employees";
		
	// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
	con = DriverManager.getConnection(url, "root", "mysql");
		 
	


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
</head>
<body>

</body>
</html>