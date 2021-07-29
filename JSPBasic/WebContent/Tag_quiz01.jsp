<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
	//Declaration
	//jsp파일에서 사용할 멤버변수, 메서드를 선언할 때 사용.
	int total = 0;

	int Lnum(){
		//정수 1~10까지의 난수를 발생
		int rn = (int)(Math.random()*10)+1;
		return rn;
}
	String LColor() {
		/*
			실수 0.0이상 1.0미만의 난수를 발생시켜서
			난수값이 0.66이상이면 "빨강"을, 0.33이상이면 "노랑"을
			그 이외에는 "파랑"을 리턴하는 메서드를 선언하세요
		*/
		double r = Math.random();
		if(r >= 0.66) {
			return "빨강";
		} else if(r >= 0.33) {
			return "노랑";
		} else {
			return "파랑";
		}
	}
%>
<% 
	//Scriptlet
	//지역 변수 및 메서드 내부의 코드를 작성하는 태그
	//페이지 요청이 발생할 때마다 실행할 로직을 작성.
	
	int each = 0;
	total++;
	each++;
	
	int rn = Lnum();
	String rc = LColor();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Web프로그래밍</h2>
	<!-- p태그는 문단을 나눌 때 사용하는 태그입니다. -->
	<p>
		페이지 누적 요청수 :
		<%=total %>
		페이지 개별 요청수 :
		<%=each %>
	</p>

	<p>
	<h3>오늘의 행운의 숫자와 행운의 색깔</h3>
	행운의 숫자 :
	<%= rn%>
	행운의 색깔 :
	<%= rc%>
	</p>

</body>
</html>