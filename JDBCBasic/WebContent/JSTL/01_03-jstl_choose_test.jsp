<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
	
		<c:when test="${param.score > 100}">
			<h4>점수를 다시 확인하고 입력해주세요.</h4>
		</c:when>
		<c:when test="${param.score >= 90}">
			<h4>A학점입니다.</h4>
		</c:when>
		<c:when test="${param.score >= 80}">
			<h4>B학점입니다.</h4>
		</c:when>
		<c:when test="${param.score >= 70}">
			<h4>C학점입니다.</h4>
		</c:when>
		<c:when test="${param.score >= 60}">
			<h4>D학점입니다.</h4>
		</c:when>
		<c:otherwise>
			<h4>F학점입니다.</h4>
		</c:otherwise>
	</c:choose>
	
</body>
</html>