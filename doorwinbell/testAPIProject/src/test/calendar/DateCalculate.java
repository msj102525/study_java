package test.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalculate {

	public long getDays() {
		long sumDays = 0L;
		Date firstDays = new Date(1, 0, 1);
		Date today = new Date(124, 1, 24);
		SimpleDateFormat dataForm = new SimpleDateFormat("yyyy,MM,dd");

//		System.out.println(firstDays.getYear());
//		System.out.println(firstDays.getMonth() + 1);
//		System.out.println(firstDays.getDate());

//		System.out.println(dataForm.format(today).toString().substring(0, 4));
		int todayYear = Integer.parseInt(dataForm.format(today).toString().substring(0, 4));
		int todayMonth = Integer.parseInt(dataForm.format(today).toString().substring(5, 7));

		for (int i = 1; i < todayYear; i++) {
			if (isLeapYear(i)) {
				sumDays++;
			}
			for (int j = 1; j < 13; j++) {
				if (j == 1 | j == 3 | j == 5 | j == 7 | j == 8 | j == 10 | j == 12) {
					for (int k = 1; k <= 31; k++) {
						sumDays++;
					}
				} else {
					for (int k = 1; k <= 30; k++) {
						sumDays++;
					}
				}
			}
		}
		for (int j = 1; j < 13; j++) {
			if (j == 1 | j == 3 | j == 5 | j == 7 | j == 8 | j == 10 | j == 12) {
				for (int k = 1; k <= 31; k++) {
					sumDays++;
				}
			} else {
				for (int k = 1; k <= 30; k++) {
					sumDays++;
				}
			}
		}
		return sumDays;
	}
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 | year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}

///package test.calendar;

//import java.util.*;
//
//public class DateCalculator {
//	public DateCalculator(){}
//
//	public boolean isLeapYear(int year) {
//		boolean isLeap = false;
//		
//		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//			isLeap = true;
//		
//		return isLeap;
//	}
//
//	public long getDays() {
//		long totalDays = 0L;
//		Calendar today = new GregorianCalendar();
//		
//		int currentYear = today.get(Calendar.YEAR);
//		int currentMonth = today.get(Calendar.MONTH) + 1;
//		int currentDay = today.get(Calendar.DAY_OF_MONTH);
//		
//		//1년부터 이전 년도까지의 총날수 계산
//		for(int y = 1; y < currentYear; y++){
//			if(this.isLeapYear(y))
//				totalDays += 366;
//			else
//				totalDays += 365;
//		}
//		
//		//올해 1월부터 이전 월까지의 총날수 계산
//		for(int m = 1; m < currentMonth; m++){
//			if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
//				totalDays += 31;
//			if(m == 4 || m == 6 || m == 9 || m == 11)
//				totalDays += 30;
//			
//			if(m == 2){
//				if(this.isLeapYear(currentYear))			
//					totalDays += 29;
//				else
//					totalDays += 28;
//			}
//		}
//		
//		totalDays += currentDay;
//			
//		return totalDays;
//	}
//	
//	
//}

