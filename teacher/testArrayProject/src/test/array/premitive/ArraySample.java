package test.array.premitive;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		// 실습문제 1
		int[] ar = new int[10];
		Random r = new Random();
		int sum = 0;
		
		for(int i = 0; i < ar.length; i++){
			ar[i] = r.nextInt(100) + 1;
			sum += ar[i];
			System.out.println("ar[" + i + "] : " + ar[i]);
		}
		
		System.out.println("sum : " + sum);
		
	}

	public void test2() {
		// 실습문제 2
		int[] numbers = new int[10];
		int max = 0, min = 0;
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100) + 1;
			if(i == 0){
				max = min = numbers[0];
			}else{
				if(max < numbers[i]) max = numbers[i];
				if(min > numbers[i]) min = numbers[i];
			}		
			
			System.out.print(numbers[i] + "\t");
		}
		
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
	}

	public void test3() {
		// 실습문제 3
		byte[] bar = new byte[10];		
		int evenSum = 0;
		
		new Random().nextBytes(bar);
		
		for(int i = 0; i < bar.length; i++){
			System.out.print(bar[i] + "\t");
			
			if(bar[i] % 2 == 0)
				evenSum += bar[i];
				//evenSum += (bar[i] < 0 ? Math.abs(bar[i]) : bar[i]);	
				//evenSum += Math.abs(bar[i]);
		}
		
		System.out.println();
		System.out.println("짝수들의 합 : " + evenSum);		
	}

	public void test5() {
		// 실습문제 5
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자문자열 입력 : ");
		String inputValue = scan.next();
		
		for(int i = 0; i < inputValue.length(); i++){
			//String 클래스의 charAt(index) 메소드 사용한 경우
			sum += inputValue.charAt(i) - 48;
		}
		
		System.out.println("합계 : " + sum);
		
	}

	public void test4() {
		// 실습문제 4
		int sum = 0;
		
		System.out.print("숫자문자열 입력 : ");
		String value = new Scanner(System.in).next();
		
		for(int i = 0; i < value.length(); i++){
//			String num = value.substring(i, i+1);  //"8" -> 8
			//String 형태의 기본자료형 값을 => 실제 계산이 가능한 기본자료형 값으로
			//바꾸는 것 : 파싱(parsing) >> java.lang 패키지에 Wrapper 클래스에서 제공됨
			//각 자료형별로 "false" -> false : Boolean.parseBoolean("false")
			// "7" -> 7 : Integer.parseInt("7")
			// "3.5" -> 3.5 : Double.parseDouble("3.5")
			sum += Integer.parseInt(value.substring(i, i+1));
		}
		
		System.out.println("합계 : " + sum);
		
	}

	public void test6() {
		// 실습문제 6
		String personID = "881225-1234567";
		
		int birthYear = Integer.parseInt(personID.substring(0, 2));
		int birthMonth = Integer.parseInt(personID.substring(2, 4));
		int birthDay = Integer.parseInt(personID.substring(4, 6));
		//char gender = personID.substring(7, 8).charAt(0);
		char gender = personID.charAt(7);
		
		System.out.println(birthYear + ", " + birthMonth + ", " + birthDay + ", " + gender);
		
		GregorianCalendar birth = new GregorianCalendar(birthYear + 1900, birthMonth - 1, birthDay);
		System.out.println(birth);
		
		switch(birth.get(Calendar.DAY_OF_WEEK)){
		case 1: System.out.println("일요일");	break;
		case 2: System.out.println("월요일");	break;
		case 3: System.out.println("화요일");	break;
		case 4: System.out.println("수요일");	break;
		case 5: System.out.println("목요일");	break;
		case 6: System.out.println("금요일");	break;
		case 7: System.out.println("토요일");	break;
		}
		
		System.out.println("성별 : " + (gender == '1'? "남자" : "여자"));
		
		int bYear = birth.get(Calendar.YEAR);
		int todayYear = new GregorianCalendar().get(Calendar.YEAR);
		System.out.println(bYear + ", " + todayYear);
		
		System.out.println("현재 나이 : " + (todayYear - bYear));
		
		System.out.println(new Date());
		System.out.println(new GregorianCalendar());
		System.out.println(Calendar.getInstance());
		
	}

}
