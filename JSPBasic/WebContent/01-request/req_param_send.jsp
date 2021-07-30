<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체에 파라미터 전달 예제</title>
</head>
<body>
	<!-- form 내부에 input 4개를 만들어주세요
		input 태그의 type 속성은 하나는 text 하나는 password
		name 속성은 하나는 apple 하나는 banana로 해주세요.
		제출 버튼, 리셋버튼 각각 하나씩 만들어주세요. 
	-->
	<form action="req_param_getpost.jsp" method="post">
		<input type="text" name="id">아이디<br>
		<input type="password" name="pw">비밀번호<br>
		<input type="text" name="nick">닉네임<br>
		
		<!-- 체크박스  -->
		취미 : 
		<input type="checkbox" name="hobby" value="로직">로직&nbsp;
		<input type="checkbox" name="hobby" value="조립">조립&nbsp;
		<br/>
		<!-- 특기 체크박스 추가, 최소 5개 이상 -->
		특기 : 
		<input type="checkbox" name="specialty" value="노래부르기">노래부르기&nbsp;
		<input type="checkbox" name="specialty" value="감성글쓰기">감성글쓰기&nbsp;
		<input type="checkbox" name="specialty" value="퍼즐맞추기">퍼즐맞추기&nbsp;
		<input type="checkbox" name="specialty" value="축구">축구&nbsp;
		<input type="checkbox" name="specialty" value="배드민턴">배드민턴&nbsp;
		<br/>
		<!-- 성별은 하나만 골라야 하므로 radio를 사용합니다. -->
		<input type="radio" name="gender" value="남자">남자&nbsp;
		<input type="radio" name="gender" value="여자">여자&nbsp;
		<br/>
		<!-- 만족도 조사 -->
		<input type="radio" name="satisfaction" value="매우만족">매우만족&nbsp;
		<input type="radio" name="satisfaction" value="만족">만족&nbsp;
		<input type="radio" name="satisfaction" value="보통">보통&nbsp;
		<input type="radio" name="satisfaction" value="불만족">불만족&nbsp;
		<input type="radio" name="satisfaction" value="매우불만족">매우불만족&nbsp;
		<br/>
		<!-- select태그는 선택지를 드롭박스로 줍니다. -->
		<select name="region">
			<option>서울</option>
			<option>경기</option>
			<option>충청</option>
			<option>전라</option>
			<option>경상</option>
			<option>강원</option>
			<option>제주</option>		
		</select><br>
		
		<br/>	
		<input type="submit">
		<input type="reset">
	</form>

</body>
</html>