package oop.sample;

import java.util.Scanner;

public class PersonMenu {
	// 프로그램 구동되는 동안 메모리에 딱 한번 딱 한개만 할당해서 계속 사용되게 하는 방식
	// 싱글톤(SingleTone) 디자인 패턴이라고함
	// static 메모리 : 프로그램이 실행될 때(main 이 start 될 때) 자동으로 할당됨,
	// 딱 한개만 기록하고, 딱 한번 초기화 함
	// 프로그램이 종료될 때main 이 끝날 때) 자동으로 삭제됨
	public static void displayMenu() {
		PersonManager pManager = new PersonManager();
		Scanner sc = new Scanner(System.in);
		Person person = null; // null : 레퍼런스변수가 비었다. 주소없다

		do {
			System.out.println("\n === 개인 정보 관리 프로그램 === \n");
			System.out.println("1. 개인 정보 등록");
			System.out.println("2. 개인 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("번호 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				person = pManager.inputPerson();
				break;
			case 2:
				if (person != null) {
					person.display();
				}else {
					System.out.println("개인 정보등록부터 하셔야 됨.");
				}
				break;
			case 9:
				System.out.println("프로그램을 종료");
				return;
			default:
				System.out.println("잘못된 번호입니다. \n확인하고 다시 입력");
			}

		} while (true);

	}
}
