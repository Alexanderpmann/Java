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
	<title>Travel Crud</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-secondary">

	<div class="container">
	 <!-- Start Logout Button -->
	 <a href="/logout"><button class="btn bg-danger text-white-bolder border border-dark shadow-lg float-end mt-2 mx-2">Logout</button></a>
	<!-- End Logout Button -->
</div>

	<!-- Start Dashboard Container -->

	
	<h1 class="text-warning bg-dark shadow-sm mt-2 mx-2 p-2" align="center">Welcome Traveler, ${user.name}</h1>
	
	
	
	<!-- End Dashboard Container -->
	<!-- Start Travel Schedule -->
	<div class="container mt-5">
	<h3>Travel Schedule <a class="btn btn-success text-white" href="/travels/new">New Travel Destination</a></h3>
		<table class="table table-secondary table-striped table-hover">
			<thead>
				<tr>
				<th class="align-middle text-dark">Travel Destination</th>
				<th class="align-middle text-dark">Agent</th>
				<th class="align-middle text-dark">Hotel</th>
				<th class="align-middle text-dark">Price (USD)</th>
				<th class="align-middle text-dark">Date of Trip</th>
				<th class="align-middle text-dark">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="travel" items="${allTravels}">
					<tr>
						<td><c:out value="${travel.name}"></c:out></td>
						<td><c:out value="${travel.agent.name}"></c:out></td>
						<td><c:out value="${travel.day}"></c:out></td>
						<td>$<c:out value="${travel.price}"></c:out>0</td>
						<td><c:out value="${travel.time}"></c:out></td>

						<td>
							<a class="btn btn-primary text-white" href="/travels/${travel.id}/edit">Update Travel Itinerary</a>
							<a class="btn btn-danger text-white" href="/travels/${travel.id}/delete">Delete Plans</a>
							<a class="btn btn-warning text-dark" href="/travels/${travel.id}">View Travel Plans</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- End Travel Schedule -->
</body>
</html>