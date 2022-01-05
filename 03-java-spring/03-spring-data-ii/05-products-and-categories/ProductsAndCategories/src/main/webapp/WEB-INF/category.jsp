<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category Page</title>
</head>
<body>
	<h1>${OneCategory.name} </h1>
	<strong>Products</strong>
	<ul>
		<c:forEach items="${OneCategory.products}" var="product"> 
			<li>${product.name}</li>
		
		</c:forEach> 
	</ul> 
		<form method="post" action="/add/product/${OneCategory.id}">
		<select name="pros">
			<c:forEach items="${listOfProducts}" var="product">
				<option value="${product.id}">${product.name}</option>
			</c:forEach>
		</select>
		<button>Add</button>
	</form> 
</body>
</html>