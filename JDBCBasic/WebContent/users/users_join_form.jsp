<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아이디, 비밀번호, 이름, 이메일 4개 요소를 users_join.jsp
	로 보내주는 form을 작성해주세요. post방식으로 전달합니다.
	보내는 input태그의 name속성은 컬럼명과 일치시켜주세요. -->
	<h1>회원가입 창입니다.</h1>
	<form action="users_join.jsp" method="post">
		<input type="text" name="uid" placeholder="ID"/><br/>
		<input type="password" name="upw" placeholder="PW"/><br/>
		<input type="text" name="uname" placeholder="NAME"/><br/>
		<input type="email" name="email" placeholder="EMAIL"/><br/>
		<input type="submit" Value="가입하기"/><br/>
	</form>
</body>
</html>