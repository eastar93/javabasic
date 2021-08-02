<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행 안내 페이지</title>
</head>
<body>
<%-- 
	 1. 폼을 만들어주세요. 폼은 travel_check.jsp를 목적지로 가집니다.
	 2. post방식으로 데이터를 전송합니다.
	 3. radio 버튼으로 여행에 대한 항목을 나열합니다.(최소 4개)
	 4. radio 버튼을 선택하고 submit을 누르면 각 radio 버튼의 value값을 분석해
	    travel_check.jsp내부 로직이 travel_도시이름.jsp로 리다이렉트 해줍니다.
     5. travel_도시이름.jsp 결과 페이지에는 관련도시의 유튜브 동영상을 게시해주시면 됩니다.
--%>
	<h1>여행 목적지</h1>
	<form action="travel_check.jsp" method="post">
	<input type="radio" name="city" value="Busan">부산<br/>
	<input type="radio" name="city" value="Newyork">뉴욕<br/>
	<input type="radio" name="city" value="Japan">일본<br/>
	<input type="radio" name="city" value="Paries">파리<br/>
	
	<input type=submit value="Go!!">

</body>
</html>