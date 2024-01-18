package ncs.test9;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata;
		BookUpdate bookupdate;

		bookdata = new Book(" ", "HTML", 30000., 0.15);

		System.out.println(
				bookdata.getBookName() + ", " + bookdata.getBookPrice() + ", " + bookdata.getBookDiscountRate());

		bookupdate = new BookUpdate(bookdata);
		bookupdate.updateBookPrice(bookdata.getBookDiscountRate());
		
		System.out.println(
				bookdata.getBookName() + ", " + bookdata.getBookPrice() + ", " + bookdata.getBookDiscountRate());

	}

}
