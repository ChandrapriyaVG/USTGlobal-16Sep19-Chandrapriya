<%@page import="com.ustglobal.retailermvc.beans.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    Retailer retailer = (Retailer)session.getAttribute("retailer");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./updatepassword">Update Password</a>
<a href = "./logout" style="float:right;">Logout</a>
<h2>WELCOME <%=retailer.getName() %></h2>
<fieldset>
	<legend>Search Product by Id</legend>
	<form action="./search">
		<table>
			<tr>
			<td>ID:</td>
			<td><input type = "number" name="id"></td>
			<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
</fieldset>

<h3>${msg}</h3>

</body>
</html>