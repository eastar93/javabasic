<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
	body{ padding: 50px; }
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" 
    rel="stylesheet" 
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" 
    crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class = "container">
		<div class="row">
		<h1 class="text-primary">로그인 창</h1>
		</div>
		
		<form role="form" action="/MyFirstWeb/login.do" method="post">
		<div class="row">
			<div class="col-md-2">
				<label class="text-success" for="ID">아이디입력</label>			
			</div>
			<div class="col-md 4">
				<input type="text" class="form-control" name="userId" placeholder="ID">
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<label class="text-success" for="PW">비밀번호입력</label>
			</div>
			<div class="col-md 4">
				<input type="password" class="form-control" name="userPw" placeholder="PW">
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<input type="submit" value="로그인" class="btn btn-success">
				<a href="/MyFirstWeb/users/user_join.jsp">
				<input type="button" value="회원가입" class="btn btn-success"></a>
				
			</div>
		</div>
		</form>
	</div>
</body>
</html>