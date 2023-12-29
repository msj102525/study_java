package com.var.example;

import java.util.Scanner;

public class Example  {
	
	Scanner sc = new Scanner(System.in);
	
	public void example1() {
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과" + (num1 + num2));
		System.out.println("빼기 결과" + (num1 - num2));
		System.out.println("곱하기 결과" + (num1 * num2));
		System.out.println("나누기 결과" + (num1 / num2));
		System.out.println("나머지 결과" + (num1 % num2));
	}
	
	public void example2() {
		System.out.print("가로길이 : ");
		double xLine = sc.nextDouble();		
		System.out.print("세로길이 : ");
		double yLine = sc.nextDouble();
		
		double area = xLine * yLine;
		double perimeter = (xLine + yLine) * 2;
		
		System.out.println("면적 : " + area );
		System.out.println("둘래 : " + perimeter);
		
	}
	
	public void example3() {
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.next();
//		String[] strArr = str.split("");
		
		
		
//		for(int i = 0; i<str.length();i++) {
//			System.out.println(strArr[i]);
//		}
		
		for(int i = 0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
//		System.out.println("첫번째 문자 : " + strArr[0]);
//		System.out.println("두번째 문자 : " + strArr[1]);
//		System.out.println("세번째 문자 : " + strArr[2]);
//		System.out.println("네번째 문자 : " + strArr[3]);
//		System.out.println("다섯째 문자 : " + strArr[4]);
		
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
		System.out.println("네번째 문자 : " + str.charAt(3));
		System.out.println("다섯째 문자 : " + str.charAt(4));

		
		
		
		
	}

}
