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

	public void updataBookPrice() {
		//할인율을 적용하여 Price 값을 인하한 값으로 변경 
		this.bookData.setBookPrice(bookData.getBookPrice() 
				- (bookData.getBookPrice() 
					* bookData.getBookDiscountRate() / 100));
	}
	
	public Book getBookData() {
		return bookData;
	}
	
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}

}
