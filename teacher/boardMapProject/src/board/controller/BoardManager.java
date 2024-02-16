package board.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	HashMap<Integer, Board> maps = new HashMap<Integer, Board>();
	//key : board 객체의 글번호 (int) => 객체 Integer 사용함, value : board 객체
	Scanner sc = new Scanner(System.in);
	
	public BoardManager(){
		// board_map.dat 파일의 내용을 읽어서 maps에 저장
		try (ObjectInputStream objIn = 
				new ObjectInputStream(new FileInputStream("board_maps.dat"))) {
			while(true) { 
				Board board = (Board)objIn.readObject();
				maps.put(board.getBoardNo(), board); // 파일읽기가 완료되면 EOFException 발생
			}
		} catch (EOFException e) {
			System.out.println("board_map.dat 파일 읽기 완료!");
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 게시글 쓰기
	public void writeBoard() {
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글제목 : ");
		String title = sc.nextLine();  //공백이 포함된 제목 문자열 입력받음
		System.out.print("작성자 : ");
		String writer = sc.next();
		System.out.println("글내용 : ");
		sc.nextLine(); // 버퍼 비우기
		StringBuilder sb=  new StringBuilder();  
		String str = null;
		while(!(str = sc.nextLine()).equals("exit")) {
			sb.append(str + "\n"); 
		}		
		
		// 마지막글번호 조회
		int lastBno = 0;
		Iterator<Integer> keyIter = maps.keySet().iterator();
		while(keyIter.hasNext()) {
			int bno = keyIter.next();
			lastBno = Math.max(lastBno, bno);  //항상 큰 번호가 저장되게 함
		}
		
		// 새 게시글 번호는 마지막글번호 + 1로 지정
		maps.put(lastBno + 1, new Board(lastBno + 1, title, writer, new Date(), sb.toString()));
	}
	
	//게시글 전체 보기 : 매개변수 없는 경우
	public void displayAllmaps() {
		Iterator<Integer> keyIter = maps.keySet().iterator();
		while(keyIter.hasNext()) {
			System.out.println(maps.get(keyIter.next()));
		}
	}
	
	//게시글 전체 보기 : 매개변수 있는 경우
	public void displayAllMaps(Map maps) { 
		Iterator keyIter = maps.keySet().iterator();
		while (keyIter.hasNext()) {
			System.out.println(maps.get(keyIter.next())); 
		}
	}
	
	//게시글 한개 보기
	public void displayBoard() {
		System.out.print("조회할 글번호 : ");
		int inputNo = sc.nextInt();
		
		if (maps.get(inputNo) != null) {
			Board board = maps.get(inputNo);
			System.out.println(board); // 해당 글번호에 대한 게시글을 화면에 출력시킴

			board.setReadCount(board.getReadCount() + 1); // 해당 글에 대한 조회수 1증가 처리함
		} else {
			System.out.println("해당 번호의 글이 존재하지 않습니다.");
		}		
	}
	
	//게시글 제목 수정
	public void modifyTitle() {
		System.out.print("수정할 글번호 : ");
		int inputNo = sc.nextInt();
		
		if (maps.get(inputNo) != null) {
			Board board = maps.get(inputNo);
			System.out.println(board); // 해당 글번호에 대한 게시글을 화면에 출력시킴
			board.setReadCount(board.getReadCount() + 1); // 해당 글에 대한 조회수 1증가 처리함
			
			System.out.print("변경할 글제목 : ");
			// 제목 변경
			sc.nextLine();
			board.setBoardTitle(sc.nextLine());
			maps.replace(inputNo, board); // 변경된 객체 정보를 maps의 해당 번호 객체에 적용함
		} else {
			System.out.println("해당 번호의 글이 존재하지 않습니다.");
		}			
	}
	
	//게시글 내용 수정
	public void modifyContent() {
		System.out.print("수정할 글번호 : ");
		int inputNo = sc.nextInt();
		
		if (maps.get(inputNo) != null) {
			Board board = maps.get(inputNo);
			System.out.println(board); // 해당 글번호에 대한 게시글을 화면에 출력시킴
			board.setReadCount(board.getReadCount() + 1); // 해당 글에 대한 조회수 1증가 처리함
			
			System.out.print("변경할 글내용 : ");			
			sc.nextLine();
			StringBuilder sb = new StringBuilder();
			String content;
			while (!(content = sc.nextLine()).equals("exit")) {
				sb.append(content + "\n");
			}
			
			board.setBoardContent(sb.toString());
			
			maps.replace(inputNo, board); // 변경된 객체 정보를 maps의 해당 번호 객체에 적용함
		} else {
			System.out.println("해당 번호의 글이 존재하지 않습니다.");
		}	
	}
	
	//게시글 삭제
	public void deleteBoard() {
		System.out.print("삭제할 글번호 :"); 
		int inputNo = sc.nextInt();
		
		if (maps.get(inputNo) != null) {
			Board board = maps.get(inputNo);
			System.out.println(board); // 해당 글번호에 대한 게시글을 화면에 출력시킴
			
			sc.nextLine();
			System.out.print("정말로 삭제하시겠습니까? (y/n) : "); 
			char ch;
			if ((ch = sc.next().toUpperCase().charAt(0)) == 'Y') { 
				maps.remove(inputNo);
			}
			
			System.out.println(inputNo + "번 글이 삭제되었습니다."); 
		} else {
			System.out.println("해당 번호의 글이 존재하지 않습니다.");
		}
	}
	
	//게시글 검색
	public void searchBoard() {
		System.out.print("검색할 제목 : ");
		String keyword = sc.nextLine();
		
		Iterator<Integer> keyIter = maps.keySet().iterator();
		int count = 0;
		while(keyIter.hasNext()) {
			Board board = maps.get(keyIter.next());
			
			if(board.getBoardTitle().contains(keyword)) { // 키워드가 제목에 포함되어 있다면
				System.out.println(board); // 화면에 검색된 객체들을 출력함	
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println(keyword + "에 해당되는 제목을 가진 글이 존재하지 않습니다.");
		}
	}
	
	//파일에 저장하기
	public void saveMapsFile() {
		try (ObjectOutputStream objOut = 
				new ObjectOutputStream(new FileOutputStream("board_maps.dat"))) {
			
			Iterator<Integer> keyIter = maps.keySet().iterator();
			while(keyIter.hasNext()) {				
				objOut.writeObject(maps.get(keyIter.next()));
			}
			System.out.println("board_maps.dat 에 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//정렬처리
	public void sortMaps(int item, boolean isDesc) {
		TreeMap tmap = null;
		
		switch(item) {
		case 1 : // 글번호순
			if(isDesc) { // isDesc : Descending => true => 내림차순
				tmap = new TreeMap(new DescBoardNo());					
			} else {
				tmap = new TreeMap(new AscBoardNo());
			}
			
			break;
		case 2 : // 작성날짜순
			if(isDesc) { // isDesc : Descending => true => 내림차순
				tmap = new TreeMap(new DescBoardDate());					
			} else {
				tmap = new TreeMap(new AscBoardDate());
			}
			break;
		case 3 : // 글제목순
			if(isDesc) { // isDesc : Descending => true => 내림차순
				tmap = new TreeMap(new DescBoardTitle());					
			} else {
				tmap = new TreeMap(new AscBoardTitle());
			}
			break;
		}
		
		if(tmap != null) {
			Iterator<Integer> keyIter = maps.keySet().iterator();
			while(keyIter.hasNext()) {
				Board board = maps.get(keyIter.next());
				tmap.put(board, board);
			}
			this.displayAllMaps(tmap);
		}
	}
	
}
