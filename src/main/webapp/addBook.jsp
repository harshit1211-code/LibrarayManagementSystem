<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
<h2>Add Book</h2>

<form action="AddBookServlet" method="POST">

    Book Name:
    <input type="text" name="name"><br><br>

    Author:
    <input type="text" name="author"><br><br>

    Quantity:
    <input type="number" name="quantity"><br><br>

    <input type="submit" value="Add Book">

</form>
</body>
</html>