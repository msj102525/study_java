package test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) {
		// 날짜, 시간 처리용 클래스 테스트
		Date today = new Date();
		java.sql.Date birth = new java.sql.Date(124, 1, 25);
		Calendar current = Calendar.getInstance();
		GregorianCalendar current2 = new GregorianCalendar();

		System.out.println("birth : " + birth/* .toString() */);
		System.out.println("today : " + today/* .toString() */);
		System.out.println("current : " + current/* .toString() */);
		System.out.println("current2: " + current2/* .toString() */);

		// format을 적용한 출력 처리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일' HH'시' mm'분' ss'초' E'요일' ");
		String stoday = sdf.format(today);
		
		System.out.println(stoday);
		
		// current2에 포멧을 적용해서 출력을 하려면
		System.out.println(sdf.format(current2.getTime()));

	}

}
