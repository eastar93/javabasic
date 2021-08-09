<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행 안내 페이지</title>
</head>
<body>
<form action="travel_check.jsp" method="get">
<table border = "1" width="700">
	<tr>
		<td>버튼</td>
		<td>여행지</td>
		<td>지역</td>
	</tr>
	<tr>
		<td><a href="travel_check.jsp?city=Busan">동영상</a></td>
		<td>한국</td>
		<td>부산</td>
	</tr>
	<tr>
		<td><a href="travel_check.jsp?city=Newyork">동영상</a></td>
		<td>미국</td>
		<td>뉴욕</td>
	</tr>
	<tr>
		<td><a href="travel_check.jsp?city=Japan">동영상</a></td>
		<td>일본</td>
		<td>도쿄</td>
	</tr>
	<tr>
		<td><a href="travel_check.jsp?city=Paries">동영상</a></td>
		<td>프랑스</td>
		<td>파리</td>
	</tr>
</table>
</form>
</body>
</html>