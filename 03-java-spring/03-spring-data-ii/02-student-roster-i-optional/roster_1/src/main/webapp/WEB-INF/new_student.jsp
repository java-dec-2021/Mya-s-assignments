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
<title>New Student</title>
</head>
<body>
	<h2>New Student</h2>
	<form:form action="/create/student" method="post" modelAttribute="newStudent">
	<p>
		<form:label path="firstName">First Name: </form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Last Name: </form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
	</p>
	<p>
		<form:label path="age">Age: </form:label>
		<form:errors path="age"/>
		<form:input path="age"/>
	</p>
	<input type="submit" value="Create" class="btn btn-success"/>
	</form:form> 
</body>
</html>