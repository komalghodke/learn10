<%@ page import="java.util.*,com.demo.model.Book"%>
<%
List<Book> books = (List<Book>) request.getAttribute("books");
%>
<h2>Book List</h2>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Title</th>
		<th>Author</th>
		<th>Price</th>
	</tr>
	<%
	for (Book b : books) {
	%>
	<tr>
		<td><%=b.getId()%></td>
		<td><%=b.getTitle()%></td>
		<td><%=b.getAuthor()%></td>
		<td><%=b.getPrice()%></td>
	</tr>
	<%
	}
	%>
</table>
<a href="addBook.jsp">Add New Book</a>
