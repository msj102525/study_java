package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {
	Scanner sc = new Scanner(System.in);
	BoardManager bManager = new BoardManager();
	
	public BoardMenu(){}
	
	public void mainMenu() {
		while(true) {
			System.out.println("\n******* 게시글 서비스 프로그램 *******\n");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 한개 보기");
			System.out.println("4. 게시글 제목 수정");
			System.out.println("5. 게시글 내용 수정");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("8. 파일에 저장하기");
			System.out.println("9. 정렬하기");
			System.out.println("10. 끝내기");
			
			System.out.print("\n메뉴 번호 선택 : ");
			switch(sc.nextInt()) {
				case 1 : bManager.writeBoard(); break;
				case 2 : bManager.displayAllmaps(); break;
				case 3 : bManager.displayBoard(); break;
				case 4 : bManager.modifyTitle(); break;
				case 5 : bManager.modifyContent(); break;
				case 6 : bManager.deleteBoard(); break;
				case 7 : bManager.searchBoard(); break;
				case 8 : bManager.saveMapsFile(); break;
				case 9 : sortSubManagerenu(); break;
				case 10 : System.out.println("\n게시글 서비스 프로그램을 종료합니다.");
						return;
			}
		}
	}
	
	public void sortSubManagerenu() {
		while(true) {
			System.out.println("\n****** 게시글 정렬 메뉴 ******\n");
			System.out.println("1. 글번호순 오름차순정렬");
			System.out.println("2. 글번호순 내림차순정렬");
			System.out.println("3. 작성날짜순 오름차순정렬");
			System.out.println("4. 작성날짜순 내림차순정렬");
			System.out.println("5. 글제목순 오름차순정렬");
			System.out.println("6. 글제목순 내림차순정렬");
			System.out.println("7. 이전 메뉴로 이동");
			
			System.out.print("\n메뉴 번호 : ");
			switch(sc.nextInt()) {
			case 1 : bManager.sortMaps(1, false); break;
			case 2 : bManager.sortMaps(1, true); break;
			case 3 : bManager.sortMaps(2, false); break;
			case 4 : bManager.sortMaps(2, true); break;
			case 5 : bManager.sortMaps(3, false); break;
			case 6 : bManager.sortMaps(3, true); break;
			case 7 : return;
		}
	}
		
		
	}

}
