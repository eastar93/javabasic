<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 로그인 창 만든 이후에 이미 로그인한 사람이 로그인창으로 오면
	// 바로 로그인 완료창으로 보내주기 위해 작성할 부분닙니다.
%>
	




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 로그인 폼에는 checkbox를 이용해 자동로그인 여부까지 체크합니다. -->
	<form action="cookie_login_ok.jsp" method="post">
		<input type="text" name="id" placeholder="ID"/>
		<input type="checkbox" name="id_check" value="yes"/>
		아이디 기억하기<br/>
				
		<input type="password" name="pw" placeholder="PW"/>
		<input type="checkbox" name="pw_check" value="yes"/>
		비밀번호 기억하기<br/>
		
		<input type="submit" value="로그인"/>
	</form>
	



</body>
</html>