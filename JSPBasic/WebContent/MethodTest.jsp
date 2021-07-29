<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>온도 측정</title>
</head>
<body>
<%! 
	double Celcius = 33.0;
	double CtoF(double Celcuis) {
		
		return Celcius * 1.8 + 32;
	}
%>
<h2>오늘 현재 홍대입구의 온도</h2>
<%
	out.println("섭씨온도 : " + Celcius + "</br>");
	out.println("화씨온도 : " + CtoF(Celcius) + "<br>");
%>
</body>
</html>