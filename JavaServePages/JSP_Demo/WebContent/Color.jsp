<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2> Server Date and time is <%= new Date() %> </h2>
	
	<%
		response.setIntHeader("Refresh", 1);
	
		String name = request.getParameter("username");
		String colors[] = request.getParameterValues("color");
		if(colors == null)
		{
			out.println("<h1>"+name+"! , No colors chosen </h1>");
		}
		else
		for(String c : colors)
		{
			out.println("<h3 style = color:"+c+">Hello "+name+"</h3>");
        }
    
        
       
	%>
	
    
</body>
</html>