<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1. / 만 입력 했을때 localhost:8181 이므로
			실제 타겟 페이지와 차이점을 추가로 찾아 /뒤에 기입해줌
		 2. 타겟 페이지 주소를 통으로 복사해 action에 목적지로 붙여넣기 -->
	<form action="/MyFirstWeb/apple" method="post">
		<input type="submit" value="post요청">	
	</form>
</body>
</html>