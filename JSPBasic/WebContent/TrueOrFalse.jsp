<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!
	boolean Compare(int a, int b) { 
		if(a>=b) {
			return true;
		} else {
			return false;
		}
	}
%>
	a값 :
	<%= 5 %></br> b값 :
	<%= 10 %></br>
	<%
	out.println("스크립트릿으로 출력된 값 : <b>" + Compare(5, 10) + "</b></br>"); 
%>
	표현식으로 출력된 값 :
	<b><%= Compare(5, 10) %></b>

</body>
</html>