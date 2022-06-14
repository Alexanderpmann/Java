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
	
	<form class="grid gap1" action="/submit" method="POST">
			<input type="text" name="noun" placeholder="Noun" />
			<input type="text" name="adjective" placeholder="Adjective" />
			<input type="text" name="verb" placeholder="Verb" />
		<input class="btn_submit" type="Submit" value="Create Madlib" />
	</form>
	
</body>
</html>