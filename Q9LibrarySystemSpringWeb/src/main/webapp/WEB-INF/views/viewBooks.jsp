<%@ page import="java.util.*,com.demo.model.Book" %>
<%
    List<Book> books = (List<Book>)request.getAttribute("books");
%>
<h2>Library Books</h2>
<table border="1">
    <tr><th>ID</th><th>Title</th><th>Author</th><th>ISBN</th><th>Available</th><th>Action</th></tr>
    <%
        if(books != null){
            for(Book b : books){
    %>
        <tr>
            <td><%= b.getId() %></td>
            <td><%= b.getTitle() %></td>
            <td><%= b.getAuthor() %></td>
            <td><%= b.getIsbn() %></td>
            <td><%= b.isAvailable() %></td>
            <td><a href="books/delete/<%= b.getId() %>">Delete</a></td>
        </tr>
    <%
            }
        }
    %>
</table>
<a href="books/add">Add New Book</a>