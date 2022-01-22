<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question profile</title>
</head>
<body>
	<h1>${getOneQ.question}</h1>
	<h4>Tags:
	<c:forEach items="${getOneQ.tags}" var="getT">
		${getT.tag}
	</c:forEach>
	</h4>
	<table>
		<thead>
			<tr>
				<th>Answers</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${getOneQ.answers}" var="getA">
				<p>${getA.answer}</p>
			</c:forEach>
		</tbody>
	</table>
	
	<h3>Add your answer:</h3>
	<form:form action="/add/answer" method="post" modelAttribute="addAnswer">
	<form:hidden path="question" value="${question.id}"/>
		<form:label path="answer">Answer: </form:label>
		<form:errors path="answer"/>
		<form:textarea path="answer"/>
		<input type="submit" value="Answer it!"/>
	</form:form>
</body>
</html>