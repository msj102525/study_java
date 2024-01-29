package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookManager {
	ArrayList bookList = new ArrayList();

	public void bookList() {
	}

	public void bookList(ArrayList bookList) {

	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void deleteBook(int index) {
		bookList.remove(index);
	}

	public int searchBook(String bTitle) {
		int result = 0;

		for (int i = 0; i < bookList.size(); i++) {
			Book book = (Book) bookList.get(i);
			if (book.getTitle().equals(bTitle)) {
				result = i;
			} else {
				result = -1;
			}
		}
		return result;
	}

	public void printBook(int index) {
		System.out.println(bookList.get(index));
	}

	public void displayAll() {
		for (Object book : bookList) {
			System.out.println(book);
		}
	}

	public Book[] sortedBookList() {
		Collections.sort(bookList, new AceCategory());
		return (Book[]) bookList.toArray(new Book[0]);
	}

	public void printBookList(Book[] br) {
		for (Book book : br) {
			System.out.println(book);
		}
	}
	
	

   

}
