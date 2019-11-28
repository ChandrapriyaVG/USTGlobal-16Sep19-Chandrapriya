<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
	
	<%
	String id = "";
	Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for (Cookie cookie : cookies) {
	
		if(cookie.getName().equals("alwaysRemember")) {
			id = cookie.getValue();
		}
	}
}
	%>

<body>
	<h4><%=msg %></h4>
	<fieldset align='center'>
		<legend>Login</legend>
		<form action='./login' method='post'>
			ID: <input type='number' name='id' value='<%=id%>'> 
			PASSWORD:<input type='password' name='password'> 
			<input type='checkbox' name='Remember' value='checked'>Remember Me!!<br> <input type='submit' value='Login'> 
			<input type='reset' name='Reset'>
		</form>
		<a href='./register.html'>Click here to Register!</a>
	</fieldset>
</body>
</html>