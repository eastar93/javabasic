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
	public String name = "김철수";
	public int age = 20;
	// 아래에 원 넓이를 구하는 areaCircle을 선언해주시고
	// 아래쪽에 표현식 내부에서 호출하도록 해주세요.
	// 반지름을 입력 받아서 (반지름의 제곱 * Math.PI); 를 실행해서
	// 리턴하는 함수입니다.
	
	double areaCirlce(double r) {
		return r * r * Math.PI;
	}
%>
	<%
	out.println("이름 : " + name + "<br/>");
	out.println("나이 : " + age + "<br/>");
%>
	이름 :
	<%= name %><br /> 나이 :
	<%= age %><br />
	<hr>
	반지름 :
	<%=3 %><br /> 원의 넓이 :
	<%= areaCirlce(5) %>cm^2


</body>
</html>