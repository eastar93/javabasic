<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		// response.sendRedirect("주소")
		// 는 해당 코드가 실행될 경우 바로
		// 파라미터로 입력된 주소로 보내버립니다.
		// 50%확률로 네이버로 보내는 코드를 작성해주세요.
		double value = Math.random();
		
		if(value < 0.5) {
			response.sendRedirect("https://www.naver.com");
		}
	%>
	<h1>안 넘어갔습니다.</h1>
</body>
</html>