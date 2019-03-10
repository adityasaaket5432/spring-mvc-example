<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="get">
		<input type="text" name="userName"><br> <input
			type="submit" value="Login">
			
	</form>
	<form action="loginpage">
	<input type="submit" value="click here to login with password" >
	</form>
	<form action="registrationPage">
	<input type="submit" value="click here to Register" >
	</form>
</body>
</html>


















































































































































0