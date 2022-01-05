<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Page</title>
</head>
<body>
	<h1>${product.name} </h1>
	<strong>Categories</strong>
	<ul>
		<c:forEach items="${product.categories}" var="category"> 
			<li>${category.name}</li>
		
		</c:forEach> 
	</ul>
		<form method="post" action="/add/category/${product.id}">
		<select name="cats">
			<c:forEach items="${ cat}" var="category">
				<option value="${category.id}">${category.name}</option>
			</c:forEach>
		</select>
		<button>Add</button>
	</form>
</body>
</html>