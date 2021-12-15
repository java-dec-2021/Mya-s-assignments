<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>${errors}</h4>
	<p>What is the code?</p>
	<form action="/submit" method="POST">
		<input class="" type="text" name="code">
		<input class="" type="submit" value="Try Code">
	</form> 
</body>
</html>