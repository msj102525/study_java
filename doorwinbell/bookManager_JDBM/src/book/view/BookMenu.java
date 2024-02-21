package book.view;

import java.util.ArrayList;
import java.util.Scanner;

import book.controller.BookController;
import book.dto.Book;

public class BookMenu {
	private static BookController bcontroller = new BookController();
	private static Scanner sc = new Scanner(System.in);

	public static void displayMenu() {
		do {
			System.out.println("\n*** 도서 관리 프로그램 ***\n");

			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 정보 수정");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 아이디로 조회");
			System.out.println("5. 도서 제목으로 조회");
			System.out.println("6. 도서 목록 전체 조회");
			System.out.println("9. 끝내기");
			System.out.print("번호 선택 :");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				if(bcontroller.insertBook(inputBook()) > 0) {
					System.out.println("\n새로운 책 정보가 등록되었습니다");
				}else {
					System.out.println("\n새로운 책 등록에 실패했습니다.");
				}
				break;
			case 2:
				if(bcontroller.updateBook(modifyBook()) > 0) {
					System.out.println("\n 책정보 수정 완료\n");
				}else {
					System.out.println("\n 책정보 수정 실패\n");					
				}
				break;
			case 3:
				if(bcontroller.deleteBook(inputBookId()) > 0) {
					System.out.println("\n 책정보 삭제 완료\n");
				}else {
					System.out.println("\n 책정보 삭제 실패\n");					
				}
				break;
			case 4:
				try {
					System.out.println(bcontroller.searchBook(inputBookId()).toString());
				} catch (NullPointerException e) {
					System.out.println("\n해당 책번호 없음");
				}
				break;
			case 5:
				printList(bcontroller.searchBookTitle(inpuBookTitle()));
				break;
			case 6:
				printList(bcontroller.selectList());
				break;
			case 9:
				break;
			default:
				System.out.println("잘못입력. 다시입력.");

			}

		} while (true);
	}
	
	// 책 제목 입력용
	private static String inpuBookTitle() {
		System.out.print("\n책 제목 : ");
		return sc.next();
	}

	private static int inputBookId() {
		System.out.print("\n 조회 또는 삭제할 책의 번호 : ");
		return sc.nextInt();		
	}

	private static Book inputBook() {
		Book book = new Book()	;
		
		System.out.print("책 제목 : ");
		book.setTitle(sc.next());
		
		System.out.print("책 작가 : ");
		book.setAuthor(sc.next());
		
		System.out.print("발행자 : ");
		book.setPublisher(sc.next());
		
		System.out.print("발행 날짜(yyyy-MM-dd) : ");
		book.setPublishDate(java.sql.Date.valueOf(sc.next()));
		
		System.out.print("가격 : ");
		book.setPrice(sc.nextInt());
		
		return book;
	}
	
	private static Book modifyBook() {
		Book book = new Book()	;
		
		System.out.print("수정할 책의 번호 : ");
		book.setBookId(sc.nextInt());
		
		System.out.print("책 제목 : ");
		book.setTitle(sc.next());
		
		System.out.print("책 작가 : ");
		book.setAuthor(sc.next());
		
		System.out.print("발행자 : ");
		book.setPublisher(sc.next());
		
		System.out.print("발행 날짜(yyyy-MM-dd) : ");
		book.setPublishDate(java.sql.Date.valueOf(sc.next()));
		
		System.out.print("가격 : ");
		book.setPrice(sc.nextInt());
		
		return book;
	}
	
	
	

	private static void printList(ArrayList<Book> list) {
		System.out.println("전체 책수 : " + list.size() + "개 입니다.");
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
