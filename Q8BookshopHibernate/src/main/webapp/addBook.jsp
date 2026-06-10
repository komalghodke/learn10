<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Book</h2>
	<form action="books" method="post">
		Title: <input type="text" name="title"><br> Author: <input
			type="text" name="author"><br> Price: <input type="text"
			name="price"><br> <input type="submit" value="Add Book">
	</form>
</body>
</html>