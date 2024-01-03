package cast.practice;

import java.util.Scanner;

public class CastingSample {
	Scanner sc = new Scanner(System.in);
	
	public void printuniCode() {
		System.out.print("문자 입력 : " );
		
		String str = sc.next();
		char charStr = str.charAt(0);
//		int intStr = (int)charStr;
//		int uniStr = charStr.codePointAt(0);
//		System.out.println(intStr);
		
		System.out.println(charStr + "is unicode : " + (int)charStr );
	}
	
	public void calculatorScore() {
		System.out.print("국어 : ");
		double krScore = sc.nextDouble();
		
		System.out.print("영어 : ");
		double enScore = sc.nextDouble();
		
		System.out.print("수학 : ");
		double mthScore = sc.nextDouble();
		
		int total = (int)(krScore + enScore + mthScore);
		int avg = (int)(krScore + enScore + mthScore) / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("총점 : " + avg);
		
		
		
//		System.out.print("총점 : ");
//		System.out.println((int)(krScore + enScore + mthScore));
//		
//		System.out.print("평균 : ");
//		System.out.println((int)(krScore + enScore + mthScore) / 3);		
		
	}
	
	public void printBitCount() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int numBit = Integer.bitCount(num);
		
		System.out.println(num + "의 2진수에 포함된 1의 갯수 :  " + numBit);
		
		// static이 붙은 메소드는 클래스명.메소드명() 으로 사용됨
	}

	
	
}
