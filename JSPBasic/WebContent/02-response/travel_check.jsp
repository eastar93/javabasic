<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String city = request.getParameter("city");
%>

<%  
	if(city.equals("Busan")) {
	response.sendRedirect("travel_Busan.jsp");
	} else if(city.equals("Newyork")) {
	response.sendRedirect("travel_Newyork.jsp");
	} else if(city.equals("Japan")) {
	response.sendRedirect("travel_Japan.jsp");
	} else if(city.equals("Paries")) {
	response.sendRedirect("travel_Paries.jsp");
	}
%>