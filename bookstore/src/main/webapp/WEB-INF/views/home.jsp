<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello! Please enter the username to login</h1>
	<p>The time on the server is ${serverTime}.</p>
	<section>
		<h2>Login</h2>
		<form action="user" method="post">
			<label>Username:</label>
			<input type="text" name="username">
			<label>Password:</label>
			<input type="text" name="password">
			<input type="submit" value="Login">
		</form> 
	</section>
	<section>
		<h2>Add a new User</h2>
		<form action="add" method="post">
			<label>Username:</label>
			<input type="text" name="username">
			<label>Password:</label>
			<input type="text" name="password">
			<input type="submit" value="Add">
		</form>
	</section>
		
</body>
</html>