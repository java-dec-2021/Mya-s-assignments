<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<h3>Top Ten Songs:</h3>
	<table>
		<thead>
			<tr>
				<th>Rating</th>
				<th>Title</th>
				<th>Artist</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${topTen}" var="top">
				<tr>
					<td>${top.rating}</td>
					<td><a href="/songs/${top.id}">${top.title}</a></td>
					<td>${top.artist}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>