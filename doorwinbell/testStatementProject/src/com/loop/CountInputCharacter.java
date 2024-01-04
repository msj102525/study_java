package com.loop;

import java.util.Arrays;
import java.util.Scanner;

public class CountInputCharacter {
	
	Scanner sc = new Scanner(System.in);
	
	public void countInputCharacter() {
		int count = 0;
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();		
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);		
		
		char[] strArr = new char[str.length()];
		
		for(int i = 0; i< str.length();i++) {
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
		System.out.println(ch + "가 포함된 갯수 : " + count);
		
		
		
		
	}
	
}
