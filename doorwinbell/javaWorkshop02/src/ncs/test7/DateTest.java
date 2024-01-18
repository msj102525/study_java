package ncs.test7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

    public static void main(String args[]) {
        // 생일 데이터
        int birthYear = 1997;
        int birthMonth = 5;
        int birthDay = 27;
        
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar birthDate = new GregorianCalendar(birthYear, birthMonth - 1, birthDay); // 월은 0부터 시작하므로 1을 뺌
        
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DATE);
        
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일 E요일");
        System.out.println("생년월일" + dateFormat.format(birthDate.getTime()));
        System.out.println("오늘날짜" + dateFormat.format(today.getTime()));
        
        System.out.println("나이 : " + (year - birthYear -1));
       
    }
}
