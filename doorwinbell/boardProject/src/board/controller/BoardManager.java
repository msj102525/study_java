package board.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import board.model.vo.*;

public class BoardManager {
	Scanner sc = new Scanner(System.in);
	ArrayList<Board> list = new ArrayList<Board>();
	int boardNo = 0, boardCount = 0;

	public BoardManager() {
	}

	public void readBoard() {
		try (ObjectInputStream oInS = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			Board[] boards = (Board[]) oInS.readObject();

			for (Board board : boards) {
				if (board != null) {
					list.add(board);
//					System.out.println(board);
				} else {
					System.out.println("Invalid Book object found");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기");

		System.out.print("글 제목 : ");
		String boardTitle = sc.nextLine();

		System.out.print("작성자 : ");
		String boardWriter = sc.next();

		Date boardDate = new Date();

		sc.nextLine();
		System.out.println("작성글 (exit 입력시 종료) : ");
		StringBuilder contentBuilder = new StringBuilder();

		String boardContent = null;
		while (!(boardContent = sc.nextLine()).equals("exit")) {
			contentBuilder.append(boardContent);
		}

		boardContent = contentBuilder.toString().trim();

		Board newBoard = new Board(boardNo, boardTitle, boardWriter, boardDate, boardContent, boardCount);
		list.add(newBoard);
		boardNo++;

	}

	public void displayAllList() {
		readBoard();

		if (list.isEmpty()) {
			System.out.println("게시물 없음");
		} else {
			System.out.println("게시물 목록");
			for (Board board : list) {
				System.out.println(board);
			}
		}
	}

	public Board foundBoard() {
		readBoard();
		
		if (list.isEmpty()) {
			System.out.println("게시물 없음");
			return null;
		}
		System.out.print("조회할 글번호 : ");

		int boardNum = sc.nextInt();

		Board foundBoard = null;

		for (Board board : list) {
			if (board.getBoardNo() == boardNum) {
				foundBoard = board;
				break;
			}
		}

		if (foundBoard == null) {
			System.out.println("해당 번호의 게시물이 없습니다.");
		} else {
			System.out.println(foundBoard);
		}
		return foundBoard;
	}

	public void displayBoard() {
		foundBoard();
	}

	public void modifyTitle() {
		Board foundBoard = foundBoard();

		sc.nextLine();
		System.out.print("수정할 제목 : ");
		foundBoard.setBoardTitle(sc.nextLine());

	}

	public void modifyContent() {
		Board foundBoard = foundBoard();

		sc.nextLine();
		System.out.print("수정할 내용 : ");
		foundBoard.setBoardContent(sc.nextLine());
	}

	public void deleteBoard() {
		Board foundBoard = foundBoard();

		System.out.print("정말로 삭제 함?(y/n) : ");
		char yOrN = Character.toLowerCase(sc.next().charAt(0));
		if (yOrN == 'y') {
			list.remove(foundBoard);
		}
		System.out.println(foundBoard.getBoardNo() + "번 글이 삭제됨.");
	}

	public void searchBoard() {
		if (list.isEmpty()) {
			System.out.println("게시물 없음");
			return;
		}
		System.out.print("검색할 제목 : ");
		String searchTitle = sc.nextLine();

		boolean found = false;

		for (Board board : list) {
			if (board.getBoardTitle().contains(searchTitle)) {
				System.out.println(board);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("해당 게시물 X");
		}
	}

	public void saveListFile() {
		try (ObjectOutputStream oOutS = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			Board[] boards = new Board[list.size()];
			for (int i = 0; i < list.size(); i++) {
				boards[i] = (Board) list.get(i);
				System.out.println(boards);
			}
			oOutS.writeObject(boards);
			System.out.println("board_list.dat 저장 완");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void sortList(int item, boolean isDesc) {

		System.out.println(item + " " + isDesc);

		if (item == 1) {
			if (isDesc) {
				list.sort(new DescBoardNo());
			} else {
				list.sort(new AscBoardNo());
			}
		} else if (item == 2) {
			if (isDesc) {
				list.sort(new DescBoardDate());
			} else {
				list.sort(new AscBoardDate());
			}
		} else if (item == 3) {
			if (!isDesc) {
				list.sort(new AscBoardTitle());
			} else {
				list.sort(new DescBoardTitle());
			}
		} else {
			return;
		}
	}
}
