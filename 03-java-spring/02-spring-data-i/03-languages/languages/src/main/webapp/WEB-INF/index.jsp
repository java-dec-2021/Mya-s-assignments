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
<title>Languages</title>
</head>
<body>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody >
			<c:forEach items="${languages}" var="language"> 
				<tr>
					<td><a href="/show/languages/${language.id}"><c:out value="${language.name}"></c:out></a></td>
					<td><c:out value="${language.creator}"></c:out></td>
					<td><c:out value="${language.version}"></c:out></td>
					<td>
						<form action="/languages/${language.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete">
						</form>
					</td>
					<td>
						<form action="/edit/languages/${language.id}" >
							<input type="submit" value="Edit">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody> 
	</table>
	<h1>Please fill out the form!!</h1>
	<%-- <form action="/languages" method="post">
		<label>Name</label>
		<input name="name"><br>
		<label>Creator</label>
		<input name="creator"><br>
		<label>Version</label>
		<input name="version"><br>
		<button>Submit</button>
	</form>  --%>
	 
	<%-- <form:form action="/create" method="post" modelAtrribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="version"/>
			<form:input  path="version"/>
		</p>
		 <input type="submit" value="Submit"/>
	</form:form>  --%>
	
	 <form:form action="/create" method="post" modelAttribute="language">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:errors path="name" class="text-danger"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator:</form:label>
	        <form:errors path="creator" class="text-danger"/>
	        <form:input path="creator"/>
	    </p>
	    <p>
	        <form:label path="version">Version:</form:label>
	        <form:errors path="version" class="text-danger"/>
	        <form:input path="version"/>
	    </p>
	   
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>