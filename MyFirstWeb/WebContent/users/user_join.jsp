<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" 
    rel="stylesheet" 
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" 
    crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 아이디, 비밀번호, 이름, 이메일 4개 요소를 users_join.jsp
	로 보내주는 form을 작성해주세요. post방식으로 전달합니다.
	보내는 input태그의 name속성은 컬럼명과 일치시켜주세요. -->
	<h1>회원가입 창입니다.</h1>
	<div class="container">
		<form action="/MyFirstWeb/join.do" method="post">
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
	      					<span class="input-group-text">I   D&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
	      				</div>	
						<input type="text" name="userId" placeholder="ID"/>
	      			</div>
	      		</div>
			</div>	
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
	      					<span class="input-group-text">P   W&nbsp;&nbsp;</span>
	      				</div>		
						<input type="password" name="userPw" placeholder="PW"/>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
	      					<span class="input-group-text">NAME</span>
	      				</div>
						<input type="text" name="userName" placeholder="NAME"/>
	      			</div>
	      		</div>
	      	</div>						
			<div class="row">
				<div class="col-md-5">
					<div class="input-group">
						<div class="input-group-prepend">
	      					<span class="input-group-text">EMAIL</span>
	      				</div>
	      				
						<input type="email" name="userEmail" placeholder="EMAIL"/>
						<div class="input-group-append">
		      				<span class="input-group-text">ex)ooo@ooo.com/.net</span>
		      			</div>
	      			</div>
	      		</div>		
			</div>
			<div class="row">
				<div class="col-md-2">
					<input type="submit" class="btn-primary" Value="가입"/>
				</div>
			</div>
		</form>
	</div>
</body>
</html>