package ncs.test6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("날짜를 입력하시오.");
		System.out.print("년 : ");
		int year = sc.nextInt();

		System.out.print("월 : ");
		int month = sc.nextInt();

		System.out.print("일 : ");
		int day = sc.nextInt();

		GregorianCalendar gCal = new GregorianCalendar(year, month - 1, day);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

		String yearResult = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "윤년입니다." : "평년입니다.";
		System.out.println(dateFormat.format(gCal.getTime()));
		System.out.println(year + "는 " + yearResult);

	}

}
