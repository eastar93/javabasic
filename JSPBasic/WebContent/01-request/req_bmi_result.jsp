<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	
	String strCm = request.getParameter("height");
	String strKg = request.getParameter("weight");
	

	double cm = Integer.parseInt(strCm); 
	double kg = Double.parseDouble(strKg);
	
	//BMI 지수 계산공식 [체중 / 신장(m) * 신장(m)]
	double bmi = kg / (cm/100) * (cm/100);
%>

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>BMI 계산 웹어플리케이션</h2>
	<hr>
	<p>
	- 신장 : <%=strCm %>cm<br/>
	- 체중 : <%=strKg %>kg<br/>
	</p>
	<p>
		BMI 지수 : <b><%=bmi %></b><br/>
		
		<%if(bmi > 23) { %>
		<b>당신은 과체중입니다.</b>
		<%}else if(bmi < 18.5) { %>
		<b>당신은 저체중입니다.</b>
		<%}else { %>
		<b>당신은 정상 체중입니다.</b>	
		<%} %>
	
</body>
</html>