package com.week4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExampleString es = new ExampleString();
		
//		System.out.print("문자열입력 : ");
//		System.out.println(es.preChar(sc.next()));
		
		System.out.print("문자열입력 : ");
		String s = sc.next();
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println(es.charSu(s, ch));
		

	}

}
