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
	<title>project manager exam</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-secondary">
	<div class="banner bg-dark text-warning p-2 shadow-lg">
		<!-- Start Logout Button -->
		<a href="/dashboard"><button class="btn bg-primary text-white border border-dark shadow-lg float-end mt-2 mx-2">Back</button></a>
		<!-- End Logout Button -->
		<h1 align="center" class="text-info">New Travel Plans:</h1>
	
	<!-- Start course Container -->
<div class="container">
	<h1 class="border border-secondary shadow-lg bg-white mt-2 mx-2 mb-4" align="center"></h1>
	<div class="container col-6">
	
	<!-- Start Travel Form -->
	<!-- Name | Day of Week | Drop-in price | Description | cancel/submit buttons | redirect to dashboard *Flash* "must include name, day, price and descrip. also int is + -->
	
	<form:form action="/travels/new" method="POST" modelAttribute="travelNew">
		<p>
			<form:input type="hidden" path="agent" value="${user.id}"/>
		</p>

		<p class="form-group">
			<form:label class="mb-2" path="name">Destination Name</form:label>
			<form:errors class="alert-danger" path="name"/>
			<form:input class="form-control bg-secondary text-white" path="name"/>
		</p>

		<p class="form-group">
			<form:label class="mb-2" path="day">Name of Hotel</form:label>
			<form:errors class="alert-danger" path="day"/>
			<form:input class="form-control bg-secondary text-white" path="day"/>
		</p>

		<p class="form-group">
			<form:label class="mb-2" path="price">Cost of Trip (USD)</form:label>
			<form:errors class="alert-danger" path="price"/>
			<form:input class="form-control bg-secondary text-white" type="number" path="price"/>
		</p>
		<p class="form-group">
			<form:label class="mb-2" path="time">Date of Trip</form:label>
			<form:errors class="alert-danger" path="time"/>
			<form:input class="form-control bg-secondary text-white" type="Date" path="time"/>
		</p>
		<p class="form-group">
			<form:label class="mb-2" path="description">Travel Plans</form:label>
			<form:errors class="alert-danger" path="description"/>
			<form:input class="form-control bg-secondary text-white" type="text" path="description"/>
		</p>
		<input type="submit" value="Submit" class="btn border border-white bg-success text-white shadow-lg mt-2"/>
		<a href="/dashboard"><button class="btn border border-white bg-danger text-white shadow-lg mt-2 float-end">Cancel</button></a>
	</form:form>
	
	<!-- End Travel Form -->
	
	</div>
</div>
	<!-- End Travel Container -->
</body>
</html>