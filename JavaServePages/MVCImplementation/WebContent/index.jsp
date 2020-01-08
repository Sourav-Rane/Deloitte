<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="/WEB-INF/tlds/mycust.tld" prefix="p" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>

<p:deladd></p:deladd> <br>


<c:forEach begin = "1" end="5" step="1" var="i">
<h1>${i}</h1>
</c:forEach>


<hr>

<p:name nameToPrint="Khalil"></p:name>



<hr>


<%
for(int i =0;i<10;i++)
{
%>

<%
}
%>

</body>
</html>