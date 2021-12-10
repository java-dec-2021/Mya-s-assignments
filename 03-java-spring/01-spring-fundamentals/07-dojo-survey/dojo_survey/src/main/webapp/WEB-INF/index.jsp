<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey Index</title>
</head>
<body>
	<form action="/result" method="post">
		<label for="your_name">Your Name:</label>
		<input id="your_name" name="your_name" type="text" />
		<div>
			<label for="dojo_location">Dojo Location:</label>
			<select name="dojo_location">
				<option>>--------Choose a location---------<</option>
				<option>San Jose</option>
				<option>Burbank</option>
				<option>San Francisco</option>
				<option>Chicago</option>
				<option>Seattle</option>
			</select>
		</div>
		<div>
			<label for="fav_language">Favorite Language:</label>
			<select name="fav_language">
				<option>>--------Choose a language---------<</option>
				<option value="python">Python</option>
				<option>C++</option>
				<option>Java</option>
				<option>MERN</option>
				<option>C#</option>
			</select>
		</div>
		<label for="comment">Comment(optional):</label>
		<textarea name="comment"></textarea>
		<div>
			<input type="submit" value="Button">
		</div>
	</form>
</body>
</html>