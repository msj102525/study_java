package board.model.vo;

public class AscBoardDate implements java.util.Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;

		if (o1 instanceof Board && o2 instanceof Board) {
			Board b1 = (Board) o1;
			Board b2 = (Board) o2;

			result = b1.getBoardDate().compareTo(b2.getBoardDate());
			
		}

		return result;
	}

}
