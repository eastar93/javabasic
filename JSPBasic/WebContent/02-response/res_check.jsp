<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String StrAge = request.getParameter("age");
	int age = Integer.parseInt(StrAge);
	
	if(age >= 20) {
		response.sendRedirect("res_ok.jsp");
	} else {
		response.sendRedirect("res_no.jsp");
	}
%>
