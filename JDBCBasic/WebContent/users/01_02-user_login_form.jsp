<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
	// 세션이 존재하면 바로 user_login_ok.jsp로 보내주는 로직을 작성해주세요.
	String idSession = (String)session.getAttribute("i_s");
	
	if(idSession != null) {
		response.sendRedirect("01_02-user_login_ok.jsp");
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 창</h1>
	<form action="01_02-user_login_ok.jsp" method="post">
			<input type="text" name="uid" placeholder="ID"/><br/>
			<input type="password" name="upw" placeholder="PW"/>
			<input type="submit" value="로그인"/>
	</form>
	<a href="01_01-users_join_form.jsp">회원가입 하러가기</a>

</body>
</html>