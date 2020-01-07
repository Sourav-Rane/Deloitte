<%@page import="com.jsp_demo.deloitte.servlets.Sum"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<h3>Welcome Admin</h3>
	
	<% Sum sum = new Sum(); %>
	<%= sum.Add(111,212) %>
	
	<%	
		out.println(session.getAttribute("cust"));
	%>
</body>
</html>