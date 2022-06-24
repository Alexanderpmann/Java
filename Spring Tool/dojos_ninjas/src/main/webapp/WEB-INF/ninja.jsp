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
	<title>Dojos and Ninjas</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<div class="container mt-2 bg-light p-4 border border-dark shadow-lg">
	<h1>New Ninja</h1>
	<br>
	<table>
	<tr class="col">
	<h3>Dojo:</h3>
	</tr>
	<tr class="col">
		<input class="shadow-lg" value=" ">
	</tr>
	<tr class="col">
	<h3>First Name:</h3>
	</tr>
	<tr class="col">
		<input class="shadow-lg" value=" ">
	</tr>
	<tr class="col">
	<h3>Last Name:</h3>
	</tr>
	<tr class="col">
		<input class="shadow-lg" value=" ">
	</tr>
	<tr class="col">
	<h3>Age:</h3>
	</tr>
	<tr class="col">
		<input class="shadow-lg" value=" ">
	</tr>
	
	</table>
	<br>
	<button class="shadow-lg mt-3 mx-1 text-light bg-dark" type="btn">Create</button>
	</div>
</body>
</html>