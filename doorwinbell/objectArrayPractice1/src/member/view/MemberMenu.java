package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;
import member.model.dto.Member;

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
			System.out.println("최대 등록 가능한 회원 수는 " + mManager.getMemberMaxSize() + "명 입니다.");
			System.out.println("현재 등록된 회원수는 " + mManager.getMemberCount() + "명 입니다.");

			System.out.println("***** 회원 관리 프로그램 *****");

			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				MemberManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				MemberManager.deleteMember();
				break;
			case 6:
				MemberManager.printAllMember();
				break;
			default:
				System.out.println("없는 번호 다시 입력");
			}

		} while (num != 9);

	}

	public void searchMenu() {
		int num = 0;

		do {
			System.out.println("***** 회원 정보 검색 메뉴 *****");

			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 :");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("아이디 입력 : ");
				MemberManager.searchMemberId(sc.next());
				break;

			case 2:
				System.out.print("이름 입력 : ");
				MemberManager.searchMemberName(sc.next());
				break;

			case 3:
				System.out.print("이메일 입력 : ");
				MemberManager.searchMemberEmail(sc.next());
				break;

			default:
				System.out.println("없는 번호 다시 입력");
			}
		} while (num != 9);
	}

	public void sortMenu() {
		int num = 0;
		do {
			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");

			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.println("메뉴 선택 : ");

			num = sc.nextInt();

			if (num == 9) {
				break;
			}

			switch (num) {
			case 1:
				MemberManager.sortIDAsc();
				break;
			case 2:
				MemberManager.sortIDDes();
				break;
			case 3:
				MemberManager.sortAgeAsc();
				break;
			case 4:
				MemberManager.sortAgeDes();
				break;
			case 5:
				MemberManager.sortGenderDes();
				break;
			default:
				System.out.println("다시입력");
			}

		} while (true); // do while
	}

	public void modifyMenu() {
		int num = 0;

		do {
			System.out.println("***** 회원 정보 수정 메뉴 *****");

			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			if (num == 9) {
				break;
			}

			System.out.print("수정할 회원 아이디 입력 : ");
			String searchId = sc.next();
			int findIdx = MemberManager.searchMemberId(searchId);

			if (findIdx != -1) {
				switch (num) {
				case 1:
					System.out.print("수정할 패스워드 입력 : ");
					MemberManager.findMember(findIdx).setPassword(sc.next());
					break;
				case 2:
					System.out.print("수정할 이메일 입력 : ");
					MemberManager.findMember(findIdx).setEmail(sc.next());
					break;
				case 3:
					System.out.print("수정할 나이 입력 : ");
					MemberManager.findMember(findIdx).setAge(sc.nextInt());
					break;
				case 9:
					System.out.println("이전 메뉴로 돌아갑니다.");
					break;
				default:
					System.out.println("없는 번호 다시 입력");
				}
			} else {
				System.out.println("err");
			}

		} while (num != 9); // do while
	}

}
