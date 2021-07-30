<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산 웹어플리케이션</title>
</head>
<body>
<%--
	사용자의 키(height)와 체중(weight)를 입력 받아 MBI지수를 계산해 출력하는
	form 및 출력페이지를 만들어보겠습니다.
	
	1. 사용자의 입력값을 서버로 전송할 때는 form태그를 사용합니다.
	2. form의 action= 속성을 이용해 전달할 페이지 및 URL을 지정할 수 있습니다.
	3. input 태그에 name속석으로 요청 자료를 부를 명칭을 정할 수 있습니다.
	4. submit 버틍를 사용하면 action= 에 지정한 페이지로 자료가 전송됩니다.
			req_bmi.jsp ===> req_bmi_result.jsp 
			
	bmi 지수 계산공식 = [체중(kg) / 신장<m) * 신장(m)]
	즉, 173cm라면 실제 신장에 들어가야 하는 값은 1.73m
	*bmi지수가 23을 초과한다면 "당신은 과체중입니다."출력
	18.5미만이라면 "당신은 저체중입니다."를 출력
	나머지 경우 "당신은 정상체중입니다."를 출력하되
	
	스크립트릿에 if문을 넣어서 선택적으로 결과가 나오도록 만들어주세요.
	
	*문자열 데이터를 정수, 실수로 변환하는 방법
	String -> int, double
	Integer.parseInt("문자열") ==> 문자열을 정수로
	Double.parseDouble("문자열") ==> 문자열을 실수로
 --%>
 	<form action="req_bmi_result.jsp" method="post">
 		신장 : <input type="text" name="height" size="10px">cm<br/>
 		체중 : <input type="text" name="weight"size="10px">kg<br/>	
		<input type="submit" value="확인">
</body>
</html>