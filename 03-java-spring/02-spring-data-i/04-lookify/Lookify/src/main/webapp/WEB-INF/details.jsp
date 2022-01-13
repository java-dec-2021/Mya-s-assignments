<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
		<p><strong>Title: ${aSong.title}</strong></p>
		<p><strong>Artist: ${aSong.artist}</strong></p>
		<p><strong>Rating(1-10): ${aSong.rating}</strong></p>
		<form action="/delete/${aSong.id}" method="post">
			<input type="hidden" name="_method" value="delete"/>
			<input type="submit" value="Delete"/>
			<%-- <p><a href="/delete/${aSong.id}">Delete</a></p> --%>
		</form>
</body>
</html>