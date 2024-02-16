package board.model.vo;

import java.util.Comparator;

public class AscBoardDate implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		return (o1.getBoardDate().before(o2.getBoardDate()))? -1 : 
				(o1.getBoardDate().after(o2.getBoardDate()))? 1 : 0;
	}

}
