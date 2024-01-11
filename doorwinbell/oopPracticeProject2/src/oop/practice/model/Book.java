package oop.practice.model;

public class Book {
	private String title;
	private int price;
	private double discountRate;
	private String author;

	public Book() {
	}

	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	public void bookInfomation() {
		System.out.print("책 제목 : " + this.title);
		System.out.print("책 가격 : " + this.price);
		System.out.print("책 할인율 : " + this.discountRate);
		System.out.print("책 저자명 : " + this.author);

		System.out.println("할인된 가격은 " + this.price + " - " + (this.price * this.discountRate) + " = "
				+ (this.price - (this.price * this.discountRate)));
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return this.price;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public String getAuthor() {
		return this.author;
	}

}
