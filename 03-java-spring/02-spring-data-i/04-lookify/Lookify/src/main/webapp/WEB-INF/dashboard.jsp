<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Lookify</title>
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/search/topTen">Top Songs</a>
	<form action="/search/artists" method="post" >
		<input name="name"/>
		<button>Search Artists</button>
	</form> 
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>rating</th>
				<th>actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs }" var="song">
				<tr>
					<td><a href="/songs/${song.id}">${song.title}</a></td>
					<td>${song.rating}</td>
					<td>
						<form action="/delete/${song.id}" method="post">
							<input type="hidden" name="_method" value="delete"/>
							<input type="submit" value="Delete"/>
						</form>
					</td> 
					<%-- <td><a href="/delete/${song.id}">delete</a></td> 
 --%>				</tr>
			</c:forEach>
		</tbody>
	</table>
	

</body>
</html>