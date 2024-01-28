package day20.silsub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class BookManager {

	public BookManager() {
	}

	public void fileSave() {
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			Book[] books = new Book[5];

			for (int i = 0; i < books.length; i++) {
				books[i] = new Book("Book" + (i + 1), "Author" + (i + 1), 20 + i, new GregorianCalendar(), i);
			}

			objOut.writeObject(books);
			System.out.println("books.dat에 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			Book[] books = (Book[]) ois.readObject();

			for (Book book : books) {
				if (book != null && book.getDates() != null) {
					System.out.println(book);
				} else {
					System.out.println("Invalid Book object found");
				}
			}

			System.out.println("books.dat 읽기 완료!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
