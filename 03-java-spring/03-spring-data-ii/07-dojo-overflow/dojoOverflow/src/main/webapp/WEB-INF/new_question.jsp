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
<title>New Question</title>
</head>
<body>
	<h1>What is your question?</h1>
		<form:form action="/create/question" method="post" modelAttribute="new">
			<p>
				<form:label path="question">Questions:</form:label>
				<form:errors path="question" class="text-danger"/>
				<form:textarea path="question"/>
			</p>
			<p>
				<form:label path="tagsFromFrontEnd">Tags:</form:label>
				<form:errors path="tagsFromFrontEnd" class="text-danger"/>
				<form:input path="tagsFromFrontEnd"/> 
			</p> 
			<input type="submit" value="Create"/>
		</form:form> 
		<%-- <form action="/create/question" method="post">
		<p>
			<label name="question">Question:</label>
			<textarea name="createQuest"></textarea>
		</p>
		<p>
			<label name="tagsFromFrontEnd">tag:</label>
			<textarea name="createTag"></textarea>
		</p>
		<input type="submit" value="Create"/>
		</form> --%>
		
</body>
</html>