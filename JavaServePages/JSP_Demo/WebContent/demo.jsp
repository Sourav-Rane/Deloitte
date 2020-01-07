<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Include</title>
</head>
<body>
	<%@ include file = "quote.jsp" %>
	<jsp:include page="Second.jsp"></jsp:include>

	<jsp:forward page="colors.html"></jsp:forward>

</body>
</html>