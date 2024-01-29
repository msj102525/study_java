package test.list;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	public String title;
	public int price;

	public void Book() {
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	private static final long serialVersionUID = 2626361585669807801L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

}
