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
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-secondary">
	<div class="conatiner col-4 mt-2 float-end">
	<!-- Start Home/Dashboard Button -->
	<a href="/dashboard"><button class="btn border border-warning bg-dark text-warning shadow-sm p-2">Home</button></a>
	<!-- End Home/Dashboard Button --> 
	<!-- Start Logout Button -->
	 <a href="/logout"><button class="btn bg-dark text-danger border border-danger shadow-sm p-2">Logout</button></a>
	<!-- End Logout Button -->
</div>
	
	<!-- Start Show Travel Container -->
<div class="container mt-4 col-6 border border-dark bg-dark">
	<h2 class="text-warning mb-4 mt-2">Travel Plans:</h2>
	<h3 class="border border-white shadow-lg bg-secondary text-info mt-2 mb-4 p-2" align="center">${travel.name} Booked By ${travel.agent.name}</h3> <!-- display Travel name and Agent (aka User) name -->
	<h4 class="text-white">Hotel: ${travel.day}</h4> <!-- display day(hotel) of Travel -->
	<h4 class="text-white">Cost: $ ${travel.price}0</h4> <!-- display price of Travel -->
	<h4 class="text-white">Date of Trip: ${travel.time}</h4> <!-- display date of Travel -->
	<br> <!-- Page Break -->
	<h4 class="text-white border border-dark p-2">Info: ${travel.description}</h4> <!-- display Description of travel plans -->
	<a class="btn btn-primary  border border-dark shadow-sm text-white" href="/travels/${travel.id}/edit">Update Travel Itinerary</a>
	<a class="btn btn-danger border border-dark shadow-sm text-white mx-3" href="/travels/${travel.id}/delete">Delete Plans</a>
	<hr>
	</div>
	
	<!-- End Show Course Container -->
</body>
</html>