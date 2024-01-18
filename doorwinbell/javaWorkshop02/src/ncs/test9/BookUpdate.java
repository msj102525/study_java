package ncs.test9;

public class BookUpdate {
	private Book bookData;

	public BookUpdate() {
		super();
	}

	public BookUpdate(Book bookData) {
		super();
		this.bookData = bookData;
	}

	public Book getBookData(Book bookData) {
		return this.bookData;
	}

	public void updateBookPrice(double bookDiscountRate) {
		bookData = this.bookData;
		double bookPrice = bookData.getBookPrice();
		bookData.setBookPrice(bookPrice - (bookPrice * bookDiscountRate));
	}

}
