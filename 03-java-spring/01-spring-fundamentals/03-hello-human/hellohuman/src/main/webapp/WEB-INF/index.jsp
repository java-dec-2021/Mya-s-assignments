<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Human</title>
</head>
<body>
	
	<c:forEach var = "i" begin = "1" end = "${times}">
          <h3>Hello <c:out value="${name}"></c:out> <c:out value="${lname}"></c:out></h3>
    </c:forEach>
	
	
	
</body>
</html>