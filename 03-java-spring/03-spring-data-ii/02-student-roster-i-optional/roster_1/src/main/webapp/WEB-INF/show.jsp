<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<h2>All Students</h2>
	<table class="table table-striped">
	<thead>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.firstName} ${student.lastName}</td>
				<td>${student.age }</td>
				<td>${student.contact.address }</td>
				<td>${student.contact.city }</td>
				<td>${student.contact.state }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>