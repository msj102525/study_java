package ncs.test9;

public class Book {
	private String catrgory;	
	private String bookName;	
	private double bookPrice;	
	private double bookDiscountRate;
	public Book() {
		super();
	}
	public Book(String catrgory, String bookName, double bookPrice, double bookDiscountRate) {
		super();
		this.catrgory = catrgory;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public String getCatrgory() {
		return catrgory;
	}
	public void setCatrgory(String catrgory) {
		this.catrgory = catrgory;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}	

}

