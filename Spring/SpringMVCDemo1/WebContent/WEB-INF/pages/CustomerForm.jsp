<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer login form - Spring forms</title>
<script type="text/javascript">
	function validate() {
		cid = false
		cname = false
		caddress = false
		billamt = false

		var customerId = document.getElementById("customerId").value
		var customerName = document.getElementById("customerName").value
		var customerAddress = document.getElementById("customerAddress").value
		var billAmount = document.getElementById("billAmount").value
		
		var errorCustomerId = document.getElementById("errorCustomerId")
		var errorCustomerName = document.getElementById("errorCustomerName")
		var errorCustomerAddress = document
				.getElementById("errorCustomerAddress")
		var errorbillAmount = document.getElementById("errorbillAmount")

		if (customerId == 0 || customerId.length < 6) {
			errorCustomerId.innerHTML = "<font color='red'>Invalid CustomerID, Must have atleast 6 characters"
		} else {
			errorCustomerId.innerHTML = ""
			cid = true
		}

		if (customerAddress == "Pune" || customerAddress == "Mumbai"
				|| customerAddress == "Delhi") {
			errorCustomerAddress.innerHTML = ""
				caddress = true
		} else if (customerAddress == 0) {
			errorCustomerAddress.innerHTML = "<font color='red'>Enter the city"
		} else {
			errorCustomerAddress.innerHTML = "<font color='red'>Invalid City"
		}

		if (customerName == 0) {
			errorCustomerName.innerHTML = "<font color='red'>Invalid Customer Name"
		} else {
			errorCustomerName.innerHTML = ""
			cname = true
		}

		if (billAmount <= 0) {
			errorbillAmount.innerHTML = "<font color='red'>Invalid Bill Amount"
		} else {
			errorbillAmount.innerHTML = ""
			billamt = true
		}
		console.log(cid,cname,caddress,billamt)
		display = document.getElementById("display")
		if (cid == true && cname == true && caddress == true && billamt == true) {
			display.innerHTML = "<font color='green'>Congrats, Your customer saved successfully <br/><br/>Your customer details are :<br/>Customer Id :"
					+ customerId+
			"<br/>Customer Name :" + customerName+
			"<br/>Customer Address :" + customerAddress+
			"<br/>Bill Amount :" + billAmount
		} else{
			display.innerHTML = ""
				return false
		}
	}
</script>
</head>
<body>
	<f:form action="customerSave.do" commandName="command">
		<h2>Customer MVC form</h2>
		<table cellspacing="10" cellpadding="10" border="0" align="center">
			<caption>Login Form</caption>
			<tr>
				<td>Customer ID:</td>
				<td><f:input path="customerId" /></td>
				<td><span id="errorCustomerId"></span></td>	
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><f:input path="customerName"/></td>
				<td><span id="errorCustomerName"></span></td>
			</tr>
			<tr>
				<td>Customer Address:</td>
				<td><f:input path="customerAddress" /></td>
				<td><span id="errorCustomerAddress"></span></td>
			</tr>
			<tr>
				<td>Bill Amount:</td>
				<td><f:input path="billAmount" /></td>
				<td><span id="errorbillAmount"></span></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit"
					id="Go" onsubmit=" return validate()"/></td>
					
					<td colspan="2" align="center"><input type="submit" value="Update"
					formaction="updateCustomer.do"/></td>
					
					<td colspan="2" align="center"><input type="submit" value="Fetch"
					formaction="fetchCustomer.do"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="reset" id="reset" /></td>
			</tr>	
		</table>
		<div id=display align="center"></div>
	</f:form>
</body>
</html>