package board.model.vo;

import java.util.Comparator;

public class AscBoardNo implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		return (o1.getBoardNo() > o2.getBoardNo())? 1 : 
				(o1.getBoardNo() < o2.getBoardNo())? -1 : 0;
	}

}
