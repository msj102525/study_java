package test.array.premitive;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		int[] arrNum = new int[10];
		int sum = 0;
		java.util.Random r = new Random();

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = r.nextInt(100) + 1;
			sum += arrNum[i];
			if (i < arrNum.length - 1) {
				System.out.print(arrNum[i] + " + ");
			} else {
				System.out.print(arrNum[i] + " = ");
			}
		}

		System.out.println(sum);

	}

	public void test2() {
		int[] arrNum = new int[10];
		int min = 0, max = 0;

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (int) (Math.random() * 100 + 1);

			if (i == 0) {
				max = min = arrNum[0];
			} else {
				if (arrNum[i] > max) {
					max = arrNum[i];
				}
				if (arrNum[i] < min) {
					min = arrNum[i];
				}
			}
		}
		System.out.println(min + " , " + max);

	}

	public void test3() {
		byte[] arrByte = new byte[10];
		java.util.Random r = new Random();
		int sum = 0;

		for (int i = 0; i < arrByte.length; i++) {
			r.nextBytes(arrByte);
			if (arrByte[i] % 2 == 0) {
				sum += arrByte[i];
			}
		}
		System.out.println("짝수 합 : " + sum);
	}

	public void test4() {
		System.out.print("문자열 입력 : ");
		String str = new Scanner(System.in).next();
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			System.out.println(Integer.parseInt(str.substring(i, i + 1)));
			sum += Integer.parseInt(str.substring(i, i + 1));
		}

		System.out.println(str + "합 :" + sum);
	}

	public void test5() {
		System.out.print("문자열 입력 : ");
		String str = new Scanner(System.in).next();
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
//			System.out.println((int)(str.charAt(i)) - 48);
			System.out.println((int) (str.charAt(i)) - '0');
			sum += ((int) (str.charAt(i)) - 48)
		}

		System.out.println(str + "합 :" + sum);
	}

	public void test6() {
		String personID = "881225-1234567";
		int birthYear = Integer.parseInt(personID.substring(0, 2));
		int birthMonth = Integer.parseInt(personID.substring(2, 4));
		int birthDay = Integer.parseInt(personID.substring(4, 6));
		char gender = personID.charAt(7);

		GregorianCalendar birth = new GregorianCalendar(birthYear + 1900, birthMonth - 1, birthDay);

		switch (birth.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("일요일");
			break;

		case 2:
			System.out.println("월요일");
			break;

		case 3:
			System.out.println("화요일");
			break;

		case 4:
			System.out.println("수요일");
			break;

		case 5:
			System.out.println("목요일");
			break;

		case 6:
			System.out.println("금요일");
			break;

		case 7:
			System.out.println("토요일");
			break;

		}

		System.out.println("성별 : " + (gender == '1' ? "남자" : "여자"));

		int bYear = birth.get(Calendar.YEAR);
		int todayYear = new GregorianCalendar().get(Calendar.YEAR);

		System.out.println("나이 : " + (todayYear - bYear));

//		String personID = "881225-1234567";
//
//		String year = "19" + personID.substring(0, 2);
//		int month = Integer.parseInt(personID.substring(2, 4));
//		int day = Integer.parseInt(personID.substring(4, 6));
//		String genderNum = personID.substring(7, 8);

		// java 8 이후

//		LocalDate today2 = LocalDate.now();
//		int today2Year = today2.getYear();
//
////		System.out.println("--" + today2);
//		LocalDate date = LocalDate.of(Integer.parseInt(year), month, day);
////		System.out.println(date);
//		DayOfWeek dayOfWeek = date.getDayOfWeek();
////		System.out.println(dayOfWeek);
//
//		String gender = "";
//
//		if (!"1".equals(gender)) {
//			gender = "남자";
//		} else
//			gender = "여자";
//
//		System.out.println("탄생 날짜 : " + dayOfWeek);
//		System.out.println("성별 : " + gender);
//		System.out.println("나이 : " + (today2Year - Integer.parseInt(year)));

	} // test 6()

}
