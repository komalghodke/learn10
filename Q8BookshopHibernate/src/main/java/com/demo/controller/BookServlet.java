package com.demo.controller;

import java.io.IOException;
import java.util.List;

import com.demo.dao.BookDAO;
import com.demo.model.Book;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/books")
public class BookServlet extends HttpServlet {
	private BookDAO dao = new BookDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		double price = Double.parseDouble(request.getParameter("price"));

		Book b = new Book(title, author, price);
		dao.addBook(b);

		response.sendRedirect("books");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> list = dao.getAllBooks();
		request.setAttribute("books", list);
		RequestDispatcher rd = request.getRequestDispatcher("viewBook.jsp");
		rd.forward(request, response);
	}
}