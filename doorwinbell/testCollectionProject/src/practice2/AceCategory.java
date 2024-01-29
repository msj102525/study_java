package practice2;

public class AceCategory implements java.util.Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;

		if (o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book) o1;
			Book b2 = (Book) o2;

			result = b1.getCategory() > b2.getCategory() ? 1 : (b1 == b2) ? 0 : b1.getCategory() - b2.getCategory();

		}

		return result;
	}

}
