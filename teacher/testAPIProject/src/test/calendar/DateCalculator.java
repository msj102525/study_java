package test.calendar;

import java.util.*;

public class DateCalculator {
	public DateCalculator(){}

	public boolean isLeapYear(int year) {
		boolean isLeap = false;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			isLeap = true;
		
		return isLeap;
	}

	public long getDays() {
		long totalDays = 0L;
		Calendar today = new GregorianCalendar();
		
		int currentYear = today.get(Calendar.YEAR);
		int currentMonth = today.get(Calendar.MONTH) + 1;
		int currentDay = today.get(Calendar.DAY_OF_MONTH);
		
		//1년부터 이전 년도까지의 총날수 계산
		for(int y = 1; y < currentYear; y++){
			if(this.isLeapYear(y))
				totalDays += 366;
			else
				totalDays += 365;
		}
		
		//올해 1월부터 이전 월까지의 총날수 계산
		for(int m = 1; m < currentMonth; m++){
			if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				totalDays += 31;
			if(m == 4 || m == 6 || m == 9 || m == 11)
				totalDays += 30;
			
			if(m == 2){
				if(this.isLeapYear(currentYear))			
					totalDays += 29;
				else
					totalDays += 28;
			}
		}
		
		totalDays += currentDay;
			
		return totalDays;
	}
	
	
}
