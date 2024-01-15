package com.practice1.model.vo;

import java.util.Objects;

public class Book {
	// Field
	private String title;
	private String author;
	private int price;

	// Constructor
	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(Book other) {
		super();
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;

	}

	// getters setters
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && price == other.price && Objects.equals(title, other.title);
	}
	
	

	@Override
	public Object clone() {
		return new Book(this);
	}

}
