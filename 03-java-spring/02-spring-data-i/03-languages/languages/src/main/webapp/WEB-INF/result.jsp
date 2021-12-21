<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java</title>
</head>
<body>
	<a href="/languages">Dashboard</a>
	<p><strong>Name: </strong><c:out value="${languages.name }"></c:out></p>
	<p><strong>Creator: </strong><c:out value="${languages.creator }"></c:out></p>
	<p><strong>Version: </strong><c:out value="${languages.version }"></c:out></p>
	 <form action="/languages/${languages.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="Delete">
	</form>
</body>
</html>