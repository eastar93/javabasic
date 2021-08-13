<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/MyFirstWeb/boardupdateok.do" method=post>

	<!-- hidden 태그를 이용해 나머지 요소들도 다 첨부해주세요. -->
	<input type="hidden" name="bid" value="${board.bid }" />
	<input type="hidden" name="bname" value="${board.bname }" />
	<input type="hidden" name="bhit" value="${board.bhit }" />
	<input type="hidden" name="bdate" value="${board.bdate }" />
	
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
			<td><input type="text" name="btitle" value="${board.btitle }"></td>	
		</tr>
		<tr>
			<td>본문</td>
			<td><textarea cols="50" rows="10" name="bcontent" >${board.bcontent }</textarea>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${board.bdate }</td>
		</tr>
	</table>
			<input type="reset" value="초기화">
			<input type="submit" value="수정하기"/>
			<a href="/MyFirstWeb/boardselect.do">
				<input type="button" value="목록으로"></a>
</form>
</body>
</html>