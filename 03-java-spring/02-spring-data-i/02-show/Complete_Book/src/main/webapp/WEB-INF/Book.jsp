<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book lists</title>
</head>
<body>
	 <%-- <p>Title:<c:out value="${title}"/></p>
	 <p>Description:<c:out value="${description}"/></p>
	<p>Language:<c:out value="${language}"/></p>
	<p>Number of Pages: <c:out value="${number_of_pages}"/></p> --%>
	
	<a href="/">Home</a>
	
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Number of Pages</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${books}" var="bk">
			<tr>
				<td>${bk.title}</td>
				<td>${bk.description}</td>
				<td>${bk.language}</td>
				<td>${bk.number_of_pages}</td>
				<td>
					<form action="/delete/${bk.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete">
					</form>		
				</td>	
				<td>
					<form action="/edit/${bk.id}">
					    <!-- <input type="submit" value="Edit"> -->
					    <button>Edit</button>
					</form>		
				</td>				
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>