<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Java</title>
</head>
<body>
	
	<a href="/languages">Dashboard</a>
	<h3>Welcome: ${editL.creator}</h3>
	
	 <form:form action="/update/${editL.id}" method="post" modelAttribute="editedLanguage">
	 	<input type="hidden" name="_method" value="put">
	    <p>
	        <form:label path="name">Name:</form:label>
	        <form:errors path="name" class="text-danger"/>
	        <form:input path="name" value="${editL.name }"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator:</form:label>
	        <form:errors path="creator" class="text-danger"/>
	        <form:input path="creator" value="${editL.creator }"/>
	    </p>
	    <p>
	        <form:label path="version">Version:</form:label>
	        <form:errors path="version" class="text-danger"/>
	        <form:input path="version" value="${editL.version }"/>
	    </p>
	   
	    <input type="submit" value="Submit"/>
	</form:form>     
</html>