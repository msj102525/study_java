package ncs.test7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		GregorianCalendar birth = new GregorianCalendar(1997, 5 - 1, 27);
		GregorianCalendar today = new GregorianCalendar();		
		
		SimpleDateFormat brithFmt = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
		SimpleDateFormat todayFmt = new SimpleDateFormat("yyyy년 M월 dd일");
				
		System.out.println("생일 : " + brithFmt.format(birth.getTime()));
		System.out.println("현재 : " + todayFmt.format(today.getTime()));
		
		System.out.println("나이 : " + (today.get(Calendar.YEAR) - birth.get(Calendar.YEAR)) + " 세");
	}

}
