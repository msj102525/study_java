package com.week4;

import java.util.Calendar;
import java.util.Date;

public class TestWork1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		String dayString = "";
		if(dayOfWeek == 5) {
			dayString = "목요일";
		}

		  System.out.println(year + "년 " + month + "월 " + day + "일 " + dayString);

	}

}
