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
<title>Insert title here</title>
</head>
<body>
	<h2>Contact Info</h2>
	<div>
		<form:form action="/create/contact" method="post" modelAttribute="newContact">
		<p>
			<form:label path="student" >Student: </form:label>
			<form:errors path="student"/>
			<form:select path="student" >
			<c:forEach items="${students}" var="student">
				<option value="${student.id}">${student.firstName }</option>
			</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="address" >Address: </form:label>
			<form:errors path="address"/>
			<form:input path="address" />
		</p>
		<p>
			<form:label path="city">City: </form:label>
			<form:errors path="city"/>
			<form:input path="city"/>
		</p>
		<p>
			<form:label path="state">State: </form:label>
			<form:errors path="state"/>
			<form:input path="state"/>
		</p>
		<input type="submit" value="Create" class="btn btn-success"/>
		</form:form>
	</div>
</body>
</html>