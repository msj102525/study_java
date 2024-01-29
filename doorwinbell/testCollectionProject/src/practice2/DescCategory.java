package practice2;

public class DescCategory implements java.util.Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			
			if(b1.getCategory() < b2.getCategory()) {
				result =1;
			}
			if (b1.getCategory() == 0) {
				result =0;
			}
			if(b1.getCategory() > b2.getCategory()) {
				result =b1.getCategory() - b2.getCategory();
			}
			
		}
		
		return result;
	}
	
}
