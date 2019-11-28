<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<body>
	<a href="./home">Home</a>
	<a href="./logout">Logout</a>
	<fieldset align="center" style="width:300px" margin-top="500px" margin-left="750px">
		<legend>Change Password</legend>
		<form action="./change" method="post">
			<table>
				<tr>
					<td>New Password</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Change Password"></td>
				</tr>

			</table>
		</form>
	</fieldset>
</body>
</html>