package day20.silsub3;

import java.io.*;
import java.util.Scanner;

public class BookManager {
    private Scanner sc = new Scanner(System.in);
    
    public BookManager() {
    }
    

    
    public void fileSave() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
            Book[] books = new Book[5];
            // 임의의 샘플 데이터 생성
            books[0] = new Book("Book1", "Author1", 20, 0.1);
            books[1] = new Book("Book2", "Author2", 30, 0.2);
            books[2] = new Book("Book3", "Author3", 25, 0.15);
            books[3] = new Book("Book4", "Author4", 35, 0.25);
            books[4] = new Book("Book5", "Author5", 40, 0.3);

            oos.writeObject(books);
            System.out.println("books.dat에 저장 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
            Book[] books = (Book[]) ois.readObject();

            for (Book book : books) {
                System.out.println(book);
            }

            System.out.println("books.dat 읽기 완료!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
