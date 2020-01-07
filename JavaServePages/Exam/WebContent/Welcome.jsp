<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome <%= request.getParameter("username")%> to the test...</h1>
	<h3>Press Start to begin the test </h3>
	
	<form action="Qn1.html">
	<input type="submit" value = "Begin Test">
	</form>

</body>
</html>