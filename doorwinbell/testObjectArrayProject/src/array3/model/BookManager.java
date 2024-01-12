package array3.model;

import java.util.Scanner;

public class BookManager {
	// 1. Field 선언
	private Book[] bar = null; // null로 초기화 명시함
	private Scanner sc;
	private static int count; // 현재 추가된 객체 수 : static

	// 2. 초기화블럭 작성 : 10개의 Book 배열 할당함
	{
		bar = new Book[10];
		sc = new Scanner(System.in);
	}

	// 3. menu() 메소드 작성 public void menu() => do~while 문으로 반복 실행 처리함
	public void menu() {
		do {
			System.out.println("********* 도서 관리 메뉴*********");
			System.out.println();
			System.out.println("1. 도서 정보 추가"); // 선택시 bookInput() 메서드 실행함
			System.out.println("2. 모두 출력"); // 선택시 bookAllOutput() 메서드 실행함
			System.out.println("7. 끝내기"); // main() 으로 return함
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				bookInput();
				break;
			case 2:
				bookOutput();
				break;
			case 7:
				return;
			default:
				System.out.println("잘못 입력");
			}

		} while (true);

	}

	public void bookInput() {
		
		bar[count] = new Book();

		// 키보드 입력 처리
		System.out.print("책 이름 :");
		sc.nextLine(); // 입력 버퍼에 남은 엔터키 제거
		bar[count].setTitle(sc.nextLine());

		System.out.print("책 가격 :");
		bar[count].setPrice(sc.nextInt());

		System.out.print("저자명 : ");
		bar[count].setAuthor(sc.next());

		System.out.print("출판사 : ");
		sc.nextLine(); // 입력 버퍼에 남은 엔터키 제거
		bar[count].setPublisher(sc.nextLine());

		count++;
	}

	public void bookOutput() {
		for (int i = 0; i < count; i++) {
			System.out.println(bar[i].bookInfo());
		}
	}

}
