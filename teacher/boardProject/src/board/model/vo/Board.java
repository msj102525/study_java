package board.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board implements Serializable{
	private static final long serialVersionUID = -3581754646070382939L;
	private int boardNo; //게시글 번호
	private String boardTitle; //게시글 제목
	private String boardWriter; //작성자아이디
	private Date boardDate; //작성날짜
	private String boardContent; //글내용
	private int readCount; //조회수
	
	public Board(){}

	public Board(int boardNo, String boardTitle, String boardWriter, 
					Date boardDate, String boardContent) {
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return boardNo + ", " + boardTitle + ", " + boardWriter
				+ ", " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(boardDate)
				+ ", " + boardContent + ", " + readCount;
	}
}
