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
 	<h1>Submitted Info:</h1>
 	<p>Name:<c:out value="${your_name}"/></p>
 	<p>Dojo Location: <c:out value="${dojo_location}"/></p>
 	<p>Favorite Language: <c:out value="${fav_language }"/></p>
 	<p>Comment: <c:out value="${comment}"/></p>
 	<form action="/">
 		<input type="submit" value="Go Back" />
 	</form>
 	
 	
</body>
</html>