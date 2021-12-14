<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Time</title>
</head>
<body>
	<%-- <h1>${time}</h1> --%>
	<h1><fmt:formatDate pattern="h:mm a" value="${ time }"/></h1>
</body>
</html>