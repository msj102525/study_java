package board.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import board.model.vo.AscBoardDate;
import board.model.vo.AscBoardNo;
import board.model.vo.AscBoardTitle;
import board.model.vo.Board;
import board.model.vo.DescBoardDate;
import board.model.vo.DescBoardNo;
import board.model.vo.DescBoardTitle;

public class BoardManager {
	HashMap<Integer, Board> bmap = new HashMap<Integer, Board>();
	Scanner sc = new Scanner(System.in);
	int boardNo = 0, readCount = 0;

	public BoardManager() {
	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기");

		System.out.print("글제목 : ");
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

		Board newBoard = new Board(boardNo, boardTitle, boardWriter, boardDate, boardContent, readCount);

		bmap.put(boardNo, newBoard);
		boardNo++;
	}

	public void readBoard() {
		try (ObjectInputStream oIns = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			Board[] boards = (Board[]) oIns.readObject();
			int i = 0;
			for (Board board : boards) {
				if (board != null) {
					bmap.put(i, board);
					i++;
//					System.out.println(board);
				} else {
					System.out.println("err");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayAllMaps() {
		readBoard();
		if (bmap.isEmpty()) {
			System.out.println("게시물 없음");
		} else {
			System.out.println("게시물 목록");

//			Collection values = bmap.values();
			Object[] array = bmap.values().toArray();

//			for (Object board : array) {
//				System.out.println(board);
//			}

			Iterator entryIter = bmap.entrySet().iterator();
			while (entryIter.hasNext()) {
				Object entry = entryIter.next();
				Map.Entry ent = (Map.Entry) entry;
				System.out.println(ent.getKey() + "=" + ent.getValue());
			}
		}
	}

	public Board foundBoard() {
		readBoard();

		if (bmap.isEmpty()) {
			System.out.println("게시물 없음");
			return null;
		}
		System.out.print("조회할 글번호 : ");

		int boardNum = sc.nextInt();

		Board foundBoard = null;

		Object[] objs = bmap.values().toArray();
		Board[] boards = Arrays.copyOf(objs, objs.length, Board[].class);

		for (Board board : boards) {
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

	public void modifytTitle() {
		Board foundBoard = foundBoard();

		sc.nextLine();
		System.out.println("수정할 제목 : ");
		foundBoard.setBoardTitle(sc.nextLine());
	}

	public void modifyContent() {
		Board foundBoard = foundBoard();
		StringBuilder contentBuilder = new StringBuilder();
		String modContent = null;

		sc.nextLine();
		while (!(modContent = sc.nextLine()).equals("exit")) {
			contentBuilder.append(modContent);
		}
		System.out.print("수정할 내용 : ");

		foundBoard.setBoardContent(contentBuilder.toString());
	}

	public void searchBoard() {
		if (bmap.isEmpty()) {
			System.out.println("게시물 없음");
		} else {
			System.out.println("검색할 제목 : ");
			String searchTitle = sc.next();

			boolean found = false;

			Board[] boards = Arrays.copyOf(bmap.values().toArray(), bmap.values().toArray().length, Board[].class);

			for (Board board : boards) {
				if (board.getBoardTitle().contains(searchTitle)) {
					System.out.println(board);
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("해당 게시물 없음");
			}
		}
	}

	public void deleteBoard() {
		Board foundBoard = foundBoard();

		if (foundBoard != null) {
			System.out.print("정말로 삭제 함?(y/n) : ");
			char yOrN = Character.toLowerCase(sc.next().charAt(0));

			if (yOrN == 'y') {
				bmap.remove(foundBoard.getBoardNo());
				System.out.println(foundBoard.getBoardNo() + "번 글이 삭제됨.");
			} else {
				System.out.println("삭제가 취소되었습니다.");
			}
		}
	}

	public void saveListFile() {
		try (ObjectOutputStream oOutS = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			Board[] boards = new Board[bmap.size()];
			for (int i = 0; i < bmap.size(); i++) {
				boards[i] = bmap.get(i);
				System.out.println(boards);
			}
			oOutS.writeObject(boards);
			System.out.println("저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sortSubMenu() {
		System.out.println("****** 게시글 정렬 메뉴 ******");
		System.out.println("1. 글번호순 오름차순정렬");
		System.out.println("2. 글번호순 내림차순정렬");
		System.out.println("3. 작성날짜순 오름차순정렬");
		System.out.println("4. 작성날짜순 내림차순정렬");
		System.out.println("5. 글제목순 오름차순정렬");
		System.out.println("6. 글제목순 내림차순정렬");
		System.out.println("7. 이전 메뉴로 이동");

		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();

		boolean isDesc = false; // 기본값은 오름차순(false)

		switch (menuNum) {
		case 1:
			sortMap(1, false); // 글번호순 오름차순정렬
			break;
		case 2:
			sortMap(1, true); // 글번호순 내림차순정렬
			break;
		case 3:
			sortMap(2, false); // 작성날짜순 오름차순정렬
			break;
		case 4:
			sortMap(2, true); // 작성날짜순 내림차순정렬
			break;
		case 5:
			sortMap(3, false); // 글제목순 오름차순정렬
			break;
		case 6:
			sortMap(3, true); // 글제목순 내림차순정렬
			break;
		case 7:
			// 이전 메뉴로 이동
			return;
		default:
			System.out.println("잘못된 메뉴 번호입니다.");
			return;
		}
	}

//	public void sortMap(int item, boolean isDesc) {
//		TreeMap tmap = new TreeMap<>(bmap);
//		Object[] objs = bmap.values().toArray();
//
//		System.out.println(item + " " + isDesc);
//
//		if (item == 1) {
//			tmap.comparator();
//			if (isDesc) {
//			} else {
//				new AscBoardNo();
//			}
//		} else if (item == 2) {
//			if (isDesc) {
//				new DescBoardDate();
//			} else {
//				new AscBoardDate();
//			}
//		} else if (item == 3) {
//			if (!isDesc) {
//				new AscBoardTitle();
//			} else {
//				new DescBoardTitle();
//			}
//		} else {
//			return;
//		}

	}
}
