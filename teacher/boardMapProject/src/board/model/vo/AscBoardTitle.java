package board.model.vo;

import java.util.Comparator;

public class AscBoardTitle implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		return o1.getBoardTitle().compareTo(o2.getBoardTitle());
	}

}
