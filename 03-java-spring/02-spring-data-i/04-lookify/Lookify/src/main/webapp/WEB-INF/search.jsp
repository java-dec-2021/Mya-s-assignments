<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<h4>Songs by artist: ${Name}</h4>
		<form action="/search/songs" method="post">
			<input name="name"/>
			<button>New Search</button>
		</form>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
		 <c:forEach items="${ songs}" var="song">
				<tr>
					<td>${song.title}</td>
					<td>${song.rating}</td>
					<td>
						<form action="/delete/${song.id}" method="post">
							<input type="hidden" name="_method" value="delete"/>
							<input type="submit" value="Delete"/>
						</form>
					</td> 
					<%-- <td><a href="/delete/${song.id}">Delete</a></td> --%>
				</tr>
			</c:forEach> 
		</tbody>
	</table>
</body>
</html>