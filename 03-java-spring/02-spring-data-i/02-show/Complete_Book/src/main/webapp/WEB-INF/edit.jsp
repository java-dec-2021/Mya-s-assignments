<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>

	<strong>Edit a book: <c:out value="${editBook.title}"/></strong>
	<form:form action="/update/${editBook.id}" method="post" modelAttribute="editedBook">
		<!-- <input type="hidden" name="_method" value="put"> -->
		<p>
			<form:label path="title">Title:</form:label>
			<form:errors class="text-danger" path="title"/>
			<form:input path="title" value="${editBook.title }"/>
		</p>
		<p>
			<form:label path="description">Description:</form:label>
			<form:errors class="text-danger" path="description"/>
			<form:input path="description" value="${editBook.description }"/>
		</p>
		<p>
			<form:label path="language">Language:</form:label>
			<form:errors class="text-danger" path="language"/>
			<form:input path="language" value="${editBook.language }"/>
		</p>
		<p>
			<form:label path="number_of_pages">Number of Pages:</form:label>
			<form:errors class="text-danger" path="number_of_pages"/>
			<form:input path="number_of_pages" value="${editBook.number_of_pages}"/>
		</p>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</body>
</html>