<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/main.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-secondary">
	<!-- Start Welcome Banner -->
	<div class="banner bg-dark text-light p-2 shadow-lg">
	<h1 align="center">Travel Destinations - Agents</h1>
	<hr>
	</div>
	<!-- End Welcome Banner -->
	
	<!-- Start Register Container -->
	
	<div class="container border border-dark bg-warning text-dark shadow-lg p-4 mt-3 col-4"> 
	<h1 class="text-primary pb-2" align="center">New Agent</h1>

	<form:form action="/register" method="POST" modelAttribute="userRegister">
		<div class="form-group">
			<label class="text-dark mb-2 mt-2 p-2">User Name:</label>
			<form:input path="name" class="form-control" placeholder="Username"/>
			<form:errors path="name" class="text-danger"/>
		</div>

		<div class="form-group">
			<label class="text-dark mb-2 mt-2 p-2">Email:</label>
			<form:input path="email" class="form-control" placeholder="Email"/>
			<form:errors path="email" class="text-danger"/>
		</div>

		<div class="form-group">
			<label class="text-dark mb-2 mt-2 p-2">Password:</label>
			<form:input type="password" path="password" placeholder="Password" class="form-control"/>
			<form:errors path="password" class="text-danger"/>
		</div>

		<div class="form-group">
			<label class="text-dark mb-2 mt-2 p-2">Confirm Password:</label>
			<form:input type="password" path="confirm" placeholder="Password Confirmation" class="form-control"/>
			<form:errors path="confirm" class="text-danger"/>
		</div>
		<input type="submit" value="Register" class="btn border border-dark bg-dark text-warning shadow-lg mt-2"/>
	</form:form>
	</div>
	<!-- End Register Container -->
	
	<!-- Start Login Container -->
	<div class="container border border-dark bg-primary text-dark shadow-lg p-4 mt-3 col-4 order-last">
	<h1 class="text-warning pb-2"  align="center">Login</h1>

	<form:form action="/login" method="POST" modelAttribute="userLogin">
		<div class="form-group">
			<label class="text-light mb-2 mt-2 p-2">Email:</label>
			<form:input path="email" class="form-control" placeholder="Email"/>
			<form:errors path="email" class="text-danger"/>
		</div>
		
		<div class="form-group">
			<label class="text-light mb-2 mt-2 p-2">Password:</label>
			<form:input type="password" path="password" placeholder="Password" class="form-control"/>
			<form:errors path="password" class="text-danger"/>
		</div>
		<input type="submit" value="Login" class="btn border border-dark bg-dark text-light shadow-lg mt-2"/>
	</form:form>
	</div>
	<!-- End Login Container -->
</body>
</html>