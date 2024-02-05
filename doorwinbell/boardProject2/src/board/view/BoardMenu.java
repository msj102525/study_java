package board.view;

import java.util.Scanner;

import com.sun.tools.javac.Main;

import board.controller.BoardManager;

public class BoardMenu {

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		BoardManager bManager = new BoardManager();
		Scanner sc = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("******* 게시글 서비스 프로그램222 *******");

			System.out.println("1. 게시글 쓰기"); // BoardManager의 writeBoard() 실행
			System.out.println("2. 게시글 전체 보기"); // displayAllList()
			System.out.println("3. 게시글 한개 보기"); // displayBoard()
			System.out.println("4. 게시글 제목 수정"); // modifyTitle()
			System.out.println("5. 게시글 내용 수정"); // modifyContent()
			System.out.println("6. 게시글 삭제"); // deleteBoard()
			System.out.println("7. 게시글 검색"); // searchBoard()
			System.out.println("8. 파일에 저장하기"); // saveListFile()
			System.out.println("9. 정렬하기"); // BookMenu 의 sortSubMenu() 실행
			System.out.println("10. 끝내기"); // main() 으로 리턴함

			System.out.print("메뉴 번호 입력 :");
			num = sc.nextInt();

			switch (num) {
			case 1:
				bManager.writeBoard();
				break;
			case 2:
				bManager.displayAllMaps();
				break;
			case 3:
				bManager.displayBoard();
				break;
			case 4:
				bManager.modifytTitle();
				break;
			case 5:
				bManager.modifyContent();
				break;
			case 6:
				bManager.deleteBoard();
				break;
			case 7:
				bManager.searchBoard();
				break;
			case 8:
				bManager.saveListFile();
				break;
			case 9:
				bManager.sortSubMenu();
				break;
			case 10:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력 | 다시입력 : ");
			}

		} while (num != 10);

	}
}
