package practice2;

import java.util.Scanner;

public class TestBookManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookManager bmanager = new BookManager();
		int num = 0;

		do {
			System.out.println("*** 도서 관리 프로그램 ***");

			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴선택 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				bmanager.addBook(inputBook(sc));
				break;
			case 2:
				Book[] sortedBooks = bmanager.sortedBookList();
				bmanager.printBookList(sortedBooks);
				break;
			case 3:
				System.out.print("삭제할 인덱스 번호 : ");
				int index = sc.nextInt();
				bmanager.deleteBook(index);
				break;
			case 4:
                 System.out.print("검색할 도서명 : ");
                 String bTitle = sc.next();
                 int searchIndex = bmanager.searchBook(bTitle);
                 if (searchIndex != -1) {
                     bmanager.printBook(searchIndex);
                 } else {
                     System.out.println("도서를 찾지 못했습니다.");
                 }
				break;
			case 5:
				bmanager.displayAll();
				break;
			default:
				System.out.println("다시입력");
			}

		} while (num != 6);

	}

	public static Book inputBook(Scanner sc) {
		System.out.print("책번호: ");
		String bNo = sc.next();

		System.out.print("카테고리 번호: ");
		int category = sc.nextInt();

		System.out.print("책제목: ");
		String title = sc.next();

		System.out.print("책저자: ");
		String author = sc.next();

		return new Book(bNo, category, title, author);
	}

	public static String inputBookTitle(Scanner sc) {
		System.out.print("검색 또는 삭제할 도서명: ");
		return sc.next();
	}

}
