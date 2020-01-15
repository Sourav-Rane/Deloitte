<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product enter - Spring forms</title>

</head>
<body>
	<f:form modelAttribute="product">
		<h2>Product MVC form .....</h2>
		<table cellspacing="10" cellpadding="10" border="0" align="center">
			<tr>
				<td>Product ID:</td>
				<td><f:input path="productId" /></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><f:input path="productName" /></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><f:input path="price" /></td>
			</tr>
			<tr>
				<td>Product Qty:</td>
				<td><f:input path="qoh" /></td>
			</tr>
			
			
			<tr>
				<td>
					<c:if test="${!empty product.productName}">
						<input type = "submit" formaction="add/update" 
						value="<spring:message text = "Edit Product">
						</spring:message>">
					</c:if>
					
					<c:if test="${empty product.productName}">
						<input type="submit" formaction="saveProduct" value="<spring:message text = "Add Product">
						</spring:message>">
					</c:if>
				</td>
				<td></td>
					
			</tr>


		</table>

	</f:form>

	<center>product details</center>

	<table border=2 align = "center">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product price</th>
			<th>Product qty</th>
		</tr>

		<c:forEach items="${allProduct}" var="product">
			<tr>
				<th><c:out value="${product.productId}"></c:out></th>
				<th><c:out value="${product.productName}"></c:out></th>
				<th><c:out value="${product.price}"></c:out></th>
				<th><c:out value="${product.qoh}"></c:out></th>
				<th><a href ="<c:url value='/deleteProduct/${product.productId}'></c:url>">Delete</a></th>
				<th><a href ="<c:url value='/editProduct/${product.productId}'></c:url>">Edit</a></th>
			</tr>
		</c:forEach>
	</table>

</body>
</html>





































