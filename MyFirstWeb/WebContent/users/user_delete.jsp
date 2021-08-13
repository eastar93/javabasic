<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId = (String)session.getAttribute("i_s");
	
	if(sessionId == null) {
		response.sendRedirect("user_login.jsp");
	}
%>    
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=sessionId %>님 회원 탈퇴를 진행합니다.</h1>
	<form action="/MyFirstWeb/userdelete.do" method="post">
		비밀번호를 한 번 더 입력해주세요.<br/>
		삭제 진행 후 되돌릴 수 없으니 주의하세요.<br/>
		<input type="password" name="dpw" placeholder="비밀번호"><br/>
		<input type="submit" value="회원탈퇴">
	</form>
</body>
</html>