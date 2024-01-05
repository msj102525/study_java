package com.loop;

import java.util.Arrays;
import java.util.Scanner;

public class CountInputCharacter {
	
	Scanner sc = new Scanner(System.in);
	
	public void countInputCharacter() {
		int count = 0, i;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();		
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);		
		
		char[] strArr = new char[str.length()];
		
		for(i = 0; i< str.length();i++) {
			if(!Character.isAlphabetic(str.charAt(i))) {
				System.out.println("영문자가 아님.");
				break;
			}else {
				strArr[i] = str.charAt(i);				
			}
			if(strArr[i] == ch) {
				count ++;
			}
		}
//		System.out.println(Arrays.toString(strArr));
		if(i == str.length()) {
			System.out.println(ch + "가 포함된 갯수 : " + count);			
		}
		
		// 실습문제 4
//		public void countInputCharacter() {
//			
//			System.out.print("문자열 입력 : ");
//			String inputValue = sc.next();
//			System.out.print("문자 입력 : ");
//			char findCharacter = sc.next().charAt(0);
//
//			int count = 0, index;
//			for (index = 0; index < inputValue.length(); index++) {
//				char c = inputValue.charAt(index);
//
//				if (!Character.isAlphabetic(c)) {
//					// if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))){
//					System.out.println("영문자가 아닙니다.");
//					break; // 알파벳문자가 아니면 강제 반복 종료
//				}
//
//				if (c == findCharacter)
//					count++;
//			}
//
//			if (index == inputValue.length())
//				System.out.println("포함된 갯수 : " + count);
//
//		}
		
		
		
		
	}
	
}
