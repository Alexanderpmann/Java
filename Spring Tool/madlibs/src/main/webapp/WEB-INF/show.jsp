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
</head>
<body class="grid p1 bg_white2">
	<h1 class="text_center">Madlibs</h1>
	
	<h1>You have created ${madlibs.size()} madlibs so far.</h1>
	
	<%-- <p>${noun}</p>
	<p>${adjective}</p>
	<p>${verb}</p> --%>
	
	<form class="grid gap1" action="/">
	<%-- <h2>${madlib}</h2>
	 --%>
	<c:forEach var="madlib" items="${madlibs}" >
		<h4>The ${madlib.adjective} ${madlib.noun} ${madlib.verb}.</h4>
	</c:forEach>
	
	<input class="btn_submit" type="Submit" value="Do it again?" /> 
	</form>
	
	<form class="grid gap1" action="https://www.google.com">
	<input class="btn_submit2" type="Submit" value="Return to Google..." /> 
	</form>
</body>
</html>