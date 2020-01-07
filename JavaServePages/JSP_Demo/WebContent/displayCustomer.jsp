<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean class="com.cms.deloitte.model.Customer" id = "cust" scope="session"></jsp:useBean>
	
	<jsp:setProperty property="customerId" name="cust" param = "cid"/>
	<jsp:setProperty property="customerName" name="cust" param = "username"/>
	<jsp:setProperty property="customerAddress" name="cust" param = "caddr"/>
	<jsp:setProperty property="billAmount" name="cust" param = "bill"/>
	
	
	<a href="admin.jsp"> Admin </a>
	
</body>
</html>