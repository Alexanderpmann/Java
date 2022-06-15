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
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body class="bg-secondary">
	<div class="container mt-4 shadow-lg p-2">
	<h1 class="text-dark">Exotic Fruits</h1>
	<div class="container border border-danger border-5">
		<div class="row bg-dark">
			<div class="col">
				<h4 class="shadow-lg text-white mt-2" align="center">Name</h4>
				<c:forEach var="grocery" items="${cart}">
				<p class="shadow-lg border border-1 white-1 text-white bg-danger" align="center">${grocery.name}</p>
				</c:forEach>
			</div>
			<div class="col">
				<h4 class="shadow-lg text-white mt-2" align="center">Price (USD)</h4>
				<c:forEach var="grocery" items="${cart}">
				<p class="shadow-lg border border-1 border-white text-white bg-danger" align="center">$ ${grocery.price}</p>
				</c:forEach>
			</div>
		</div>
	
	</div>
	</div>
</body>
</html>