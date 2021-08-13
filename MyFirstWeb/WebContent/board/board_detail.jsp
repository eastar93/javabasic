<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>글 번호</td>
			<td>${board.bid }</td>	
			<td>글쓴이 </td>
			<td>${board.bname }</td>
			<td>조회수</td>
			<td>${board.bhit }</td>
		</tr>
		<tr>
			<td>글제목</td>
			<td>${board.btitle }</td>
		</tr>
		<tr>
			<td>본문</td>
			<td><textarea cols="50" rows="10" name="content" readonly>${board.bcontent }</textarea>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${board.bdate }</td>
		</tr>
	</table>
	<table>
		<tr colspan = "3">
			<td>
				<a href="/MyFirstWeb/boardselect.do">
					<input type="submit" value="목록으로">
				</a>
			</td>
			<td>
				<form action="/MyFirstWeb/boardupdate.do" method="post">						
					<input type="hidden" value="${board.bid }" name="bid"/>						
					<input type="submit" value="수정하기"/>
				</form>
			</td>
			<td>
				<form action="/MyFirstWeb/boarddelete.do" method="post">
					<input type="hidden" value="${board.bid }" name="bid"/>
					<input type="submit" value="삭제하기"/>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>