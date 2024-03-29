package practice2;

import java.io.Serializable;

public class Book implements Serializable {
	private String bNo;
	private int category;
	private String title;
	private String author;
	
	private static final long serialVersionUID = 3514515968412141011L;

	public Book() {
	}

	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
	}
	
	
}
