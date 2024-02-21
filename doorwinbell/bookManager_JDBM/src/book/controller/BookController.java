package book.controller;

import java.util.ArrayList;

import book.dao.BookDao;
import book.dto.Book;

public class BookController {
	private BookDao bookDao = new BookDao();
	
	public BookController() {
	}
	
	//Method
	public ArrayList<Book> selectList() {
		return bookDao.selectAll();
	}
	
	public int insertBook(Book book) {
		return bookDao.insertBook(book);
	}

	public int updateBook(Book book) {
		return bookDao.update(book);
	}
	
	public int deleteBook(int bookId) {
		return bookDao.delete(bookId);
	}

	public Book searchBook(int bookId) {
		return bookDao.selectBookId(bookId);
	}

	public ArrayList<Book> searchBookTitle(String bookTitle) {
		return bookDao.searchBookTitle(bookTitle);
	}
	
}
