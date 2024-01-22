package ncs.test9;

public class BookStore {

	public static void main(String[] args) {
		Book bookdata;
		BookUpdate bookupdate;
		
		bookdata = new Book(null, "HTML5", 30000.0, 15.0);
		System.out.println("기본정보");
		System.out.println(bookdata.getBookName() + " " 
				+ bookdata.getBookPrice());
		
		bookupdate = new BookUpdate(bookdata);
		bookupdate.updataBookPrice();
		
		System.out.println("변경된 정보");
		System.out.println(bookdata.getBookName() + " " 
				+ bookdata.getBookPrice());
	}

}
