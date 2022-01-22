<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Questions Dashboard</title>
</head>
<body>
	<h1>Questions Dashboard</h1>
	<table>
		<thead>
			<tr>
				<th>Question</th>
				<th>Tags</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allQuestions}" var="getAllQuest">
				<tr>
					<td><a href="/questions/${getAllQuest.id}">${getAllQuest.question}</a></td>
					<td>
						<c:forEach items="${getAllQuest.tags}" var="getAlltags">
				
							<td><a href="/questions/${getAlltags.id}">${getAlltags.tag}</a></td>
			
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
			
	</table>
	<a href="/questions/new"><input type="submit" value="New Question"/></a>
</body>
</html>