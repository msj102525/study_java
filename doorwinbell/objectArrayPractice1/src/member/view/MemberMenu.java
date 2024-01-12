package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();

	public MemberMenu() {
	}

	// Method
	public void mainMenu() {
		int num = 0;

		do {
			System.out.println("=============================");
			System.out.println("최대 등록 가능한 회원 수는 " + MemberManager.SIZE + "명 입니다.");
			System.out.println("현재 등록된 회원수는 " + MemberManager.count + "명 입니다.");

			System.out.println("***** 회원 관리 프로그램 *****");

			System.out.println("1. 새 회원 등록		객체배열사용");
			System.out.println("2. 회원 조회		equals 사용");
			System.out.println("3. 회원 정보 수정	setter사용");
			System.out.println("4. 회원 정보 정렬	compareto 사용");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 선택 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				MemberManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				sortMenu();
				break;
			case 4:
				modifyMenu();
				break;
			case 5:
				MemberManager.memberInput();
				break;
			case 6:
				MemberManager.memberInput();
				break;
			default:
				System.out.println("없는 번호 다시 입력");
			}

		} while (num != 9);

	}

	public void searchMenu() {
	}

	public void sortMenu() {
	}

	public void modifyMenu() {
	}

}
