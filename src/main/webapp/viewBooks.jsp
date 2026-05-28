<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.library.model.Book" %>
<%@ page import="com.library.dao.BookDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books</title>
</head>
<body>
<h2>All Books</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Author</th>
    <th>Quantity</th>
</tr>

<%
BookDAO bookDAO=new BookDAO();
List<Book> list = BookDAO.getAllBooks();
for(Book b : list){
%>
<tr>
<td><%= b.getId() %></td>
<td><%= b.getName() %></td>
<td><%= b.getAuthor() %></td>
<td><%= b.getQuantity() %></td>
</tr>
<%
}
%>

</table>
<br>
<a href="index.jsp">Back to Home</a>
</body>
</html>