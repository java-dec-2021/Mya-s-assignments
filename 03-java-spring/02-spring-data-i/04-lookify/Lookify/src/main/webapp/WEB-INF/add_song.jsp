<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Add Song</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<form:form action="/add/song" method="post" modelAttribute="newSong">
		<p>
			<form:label path="title">Title</form:label>
			<form:errors class="text-danger" path="title"/>
			<form:input path="title"/>
		</p>
		<p>
			<form:label path="artist">Artist</form:label>
			<form:errors  class="text-danger" path="artist"/>
			<form:input path="artist"/>
		</p>
		<p>
			<form:label path="rating">Rating(1-10)</form:label>
			<form:errors path="rating"/>
			<form:input path="rating" type="number" min="1" max="10"/>
		</p>
		<input type="submit" value="Add Song"/>
	</form:form>
</body>
</html>