<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product enter - Spring forms</title>

</head>
<body>
	<f:form action="product.do">
		<h2>Product MVC form</h2>
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
				<td colspan="2" align="center"><input type="submit"
					value="Submit" id="Go" formaction="saveProduct" /></td>

				<td colspan="2" align="center"><input type="submit"
					value="Update" formaction="updateProduct" /></td>

				<td colspan="2" align="center"><input type="submit"
					value="Fetch" formaction ="viewProduct"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="reset" id="reset" /></td>
			</tr>
		</table>
		<div id=display align="center"></div>
	</f:form>
</body>
</html>