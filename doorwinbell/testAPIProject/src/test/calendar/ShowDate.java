package test.calendar;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculate totalDay = new DateCalculate();
		totalDay.getDays();
		long total = totalDay.getDays();
		System.out.println(totalDay.isLeapYear(2024) ? "윤년" : "평년");
		System.out.println("총 " + total);
	}
	
	
}


