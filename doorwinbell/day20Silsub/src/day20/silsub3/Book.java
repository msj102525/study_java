package day20.silsub3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;

	//
	public void Bood() {
	}

	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = new GregorianCalendar();
		this.discountRate = discountRate;
	}
	public Book(String title, String author, int price,  double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	

	//
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

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy'년' MM'월' dd'일'");
		String formatDate = dateFormat.format(dates.getTime());

		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + formatDate
				+ ", discountRate=" + discountRate + "]";
	}

}
