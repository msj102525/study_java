package book.dto;

import java.util.Date;

public class Book implements java.io.Serializable{
	private static final long serialVersionUID = 8394138013879358916L;
	private int bookId;
	private String title;
	private String author;
	private String publisher;
	private java.sql.Date publishDate;
	private int price;

	// Constructor
	public Book () {
		super();
	}

	public Book(int bookId, String title, String author, String publisher, java.sql.Date publishDate, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public java.sql.Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(java.sql.Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publishDate=" + publishDate + ", price=" + price + "]";
	}
	
	
}
