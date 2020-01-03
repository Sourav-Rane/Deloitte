<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello world</title>
</head>
<body>

<%
java.util.Date today = new java.util.Date();
String text = "Today's date is : "+ today.toString();
out.println(text);
out.println();

%>

<%=
	text
%>
</body>
</html>