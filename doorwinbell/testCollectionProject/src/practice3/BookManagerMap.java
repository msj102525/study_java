package practice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import practice2.AceCategory;
import practice2.Book;

public class BookManagerMap {
	HashMap booksMap = new HashMap();
	Book book = new Book();

	public BookManagerMap() {
	}

	public BookManagerMap(HashMap bookMap) {
	}

	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	public void removeBook(String key) {
		booksMap.remove(key);
	}

	public String searchBook(String bTitle) {
		Iterator entryIter = booksMap.entrySet().iterator();
		while (entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry) entryIter.next();
			if (((Book) entry.getValue()).getTitle().equals(bTitle)) {
				return entry.getKey().toString();
			}
		}
		return null;
	}

	public void displayAll() {
		Book[] sortedBooks = sortedBookMap();
		printBookMap(sortedBooks);
	}

	public Book[] sortedBookMap() {
		Book[] sortedBooks = (Book[]) booksMap.values().toArray(new Book[0]);
		// 정렬
		java.util.Arrays.sort(sortedBooks, new AceCategory());
		return sortedBooks;
	}

	// 객체 배열 출력
	public void printBookMap(Book[] bookArray) {
		for (Book book : bookArray) {
			System.out.println(book);
		}
	}

	// 특정 도서번호에 해당하는 객체 출력
	public void printBook(String key) {
		Book book = (Book) booksMap.get(key);
		if (book != null) {
			System.out.println(book);
		}
	}

}
