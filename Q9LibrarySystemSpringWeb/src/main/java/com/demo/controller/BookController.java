package com.demo.controller;

import com.demo.dao.BookDAO;
import com.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
	private BookDAO dao = new BookDAO();

	// Show all books
	@GetMapping("/books")
	public String listBooks(Model model) {
		model.addAttribute("books", dao.getAllBooks());
		return "viewBooks"; // JSP file: /WEB-INF/views/viewBooks.jsp
	}

	// Show form to add a book
	@GetMapping("/books/add")
	public String showAddForm(Model model) {
		model.addAttribute("book", new Book());
		return "addBook"; // JSP file: /WEB-INF/views/addBook.jsp
	}

	// Handle form submission
	@PostMapping("/books")
	public String addBook(@ModelAttribute Book book) {
		dao.addBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") int id) {
	    dao.deleteBook(id);
	    return "redirect:/books";
	}

}
