package logic.home.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NonStaticMethodSample {

	public void testScanner() {
		// Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("byte 입력 : ");
		byte bnum = sc.nextByte();
		
		System.out.print("short 입력 : ");
		short snum = sc.nextShort();
		
		System.out.print("int 입력 : ");
		int inum = sc.nextInt();
		
		System.out.print("long 입력 : ");
		long lnum = sc.nextLong();
		
		System.out.print("float 입력 : ");
		float fnum = sc.nextFloat();
		
		System.out.print("double 입력 : ");
		double dnum = sc.nextDouble();
		
		System.out.print("String 입력 : ");
		String str = sc.next();
		
		System.out.print("char 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(str);
		System.out.println(ch);
	}

	public void testDate() {
		// Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기
		
		 // 현재 시간을 가져오기
        Date date = new Date();

        // 출력 형식 지정 (옵션)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 현재 시간 출력
        String formattedTime = dateFormat.format(date);
        System.out.println("현재 시간: " + formattedTime);
	}

	public void testRandom() {
		// Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기
		java.util.Random r = new java.util.Random();
		
		System.out.println("랜덤값 : " + r.nextDouble());
		System.out.println("임의의 정수  : " + (r.nextInt(Integer.MAX_VALUE) + 1));
	}

}
