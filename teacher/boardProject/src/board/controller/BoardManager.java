package board.controller;

import java.io.*;
import java.util.*;
import board.model.vo.*;

public class BoardManager {
	ArrayList<Board> list = new ArrayList<Board>();
	Scanner sc = new Scanner(System.in);
	
	public BoardManager(){
		// board_list.dat 파일의 내용을 읽어서 list에 저장
		try (ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			while(true) { 
				list.add((Board)ois.readObject()); // null이 될 때까지 저장 : null이면 EOF발생
			}
		} catch (EOFException e) { 
			// EOF예외는 처리 없이 넘어감
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 게시글 쓰기
	public void writeBoard() {
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.next();
		System.out.println("글내용 : ");
		sc.nextLine(); // 버퍼 비우기
		StringBuilder sb=  new StringBuilder();
		String str = null;
		while(!(str = sc.nextLine()).equals("exit")) {
			sb.append(str); //TODO 엔터키 구분 처리는 나중에 추가 예정
		}
		
		int maxBno = 0; // 마지막 글 번호
		for(int i=0; i<list.size()-1; i++) {
			maxBno = Math.max(list.get(i).getBoardNo(), list.get(i+1).getBoardNo());
		}
		if(list.size() == 1 && maxBno == 0) maxBno++; //TODO 추후 수정
		
		// 게시글 번호는 마지막 글 번호 + 1로 설정
		list.add(new Board(maxBno+1, title, writer, new Date(), sb.toString()));
	}
	
	//게시글 전체 보기
	public void displayAllList() {
		for(Board board : list) {
			System.out.println(board);
		}
	}
	
	//게시글 한개 보기
	public void displayBoard() {
		System.out.print("조회할 글번호 : ");
		int inputNo = sc.nextInt();
		for(Board board : list) {
			if(inputNo == board.getBoardNo()) {
				// 해당 글번호에 대한 게시글을 화면에 출력
				System.out.println(board);
				// 해당 글에 대한 조회수 1증가 처리
				board.setReadCount(board.getReadCount()+1);
			}
		}
	}
	
	//게시글 제목 수정
	public void modifyTitle() {
		System.out.print("수정할 글번호 : "); // 글번호 != list인덱스
		int inputNo = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(inputNo == list.get(i).getBoardNo()) {
				Board board = list.get(i);
				// 해당 글번호에 대한 게시글을 화면에 출력
				System.out.println(board);
				System.out.print("변경할 제목 : ");
				// 제목 변경
				sc.nextLine();
				board.setBoardTitle(sc.nextLine());
				list.set(i, board);				
			}
		}
	}
	
	//게시글 내용 수정
	public void modifyContent() {
		System.out.print("수정할 글번호 : ");
		int inputNo = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(inputNo == list.get(i).getBoardNo()) {
				Board board = list.get(i);
				// 해당 글번호에 대한 게시글을 화면에 출력
				System.out.println(board);
				System.out.print("변경할 내용 : ");
				// 내용 변경
				StringBuilder sb=  new StringBuilder();
				String str = null;
				sc.nextLine();
				while(!(str = sc.nextLine()).equals("exit")) {
					sb.append(str);
				}
				board.setBoardContent(sb.toString());
				list.set(i, board);		
			}
		}
	}
	
	//게시글 삭제
	public void deleteBoard() {
		System.out.print("삭제할 글번호 :"); // 글번호 != list인덱스
		int inputNo = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(inputNo == list.get(i).getBoardNo()) {
				// 화면 출력
				System.out.println(list.get(i));
				System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
				if(sc.next().toUpperCase().charAt(0) == 'Y') {
					list.remove(i);
					System.out.println(i+"번 글이 삭제되었습니다.");
				}
			}
		}
	}
	
	//게시글 검색
	public void searchBoard() {
		System.out.print("검색할 제목 : ");
		String keyword = sc.nextLine();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardTitle().indexOf(keyword) != -1) {
				System.out.println(list.get(i));
			}
		}
	}
	
	//파일에 저장하기
	public void saveListFile() {
		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			for(int i=0; i<list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			System.out.println("board_list.dat 에 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//정렬처리
	public void sortList(int item, boolean isDesc) {
		switch(item) {
			case 1 : // 글번호순
				if(isDesc) { // isDesc : Descending => true => 내림차순
					list.sort(new DescBoardNo());
				} else {
					list.sort(new AscBoardNo());
				}
				break;
			case 2 : // 작성날짜순
				if(isDesc) {
					list.sort(new DescBoardDate());
				} else {
					list.sort(new AscBoardDate());
				}
				break;
			case 3 : // 글제목순
				if(isDesc) {
					list.sort(new DescBoardTitle());
				} else {
					list.sort(new AscBoardTitle());
				}
				break;
		}
	}
	
}
