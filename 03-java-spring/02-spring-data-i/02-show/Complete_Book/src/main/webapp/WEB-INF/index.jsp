<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Book Show Page</title>
</head>
<body>
	
	
	<form:form action="/create" method="post" modelAttribute="newBook">
		<p>
			<form:label path="title">Title:</form:label>
			<form:errors class="text-danger" path="title"/>
			<form:input path="title"/>
		</p>
		<p>
			<form:label path="description">Description:</form:label>
			<form:errors class="text-danger" path="description"/>
			<form:input path="description"/>
		</p>
		<p>
			<form:label path="language">Language:</form:label>
			<form:errors class="text-danger" path="language"/>
			<form:input path="language"/>
		</p>
		<p>
			<form:label path="number_of_pages">Number of Pages:</form:label>
			<form:errors class="text-danger" path="number_of_pages"/>
			<form:input path="number_of_pages"/>
		</p>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>