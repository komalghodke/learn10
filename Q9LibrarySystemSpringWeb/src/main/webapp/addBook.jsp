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
<form action="${pageContext.request.contextPath}/books" method="post">
    Title: <input type="text" name="title"><br>
    Author: <input type="text" name="author"><br>
    ISBN: <input type="text" name="isbn"><br>
    Available: <input type="checkbox" name="available"><br>
    <input type="submit" value="Add Book">
</form>
<a href="${pageContext.request.contextPath}/books">Back to Book List</a>
</body>
</html>