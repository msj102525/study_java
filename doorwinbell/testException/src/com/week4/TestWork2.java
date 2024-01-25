package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("J a v a  P r o g r a m ");
		System.out.println("문자열(토큰) 갯수 : " + str.countTokens());

		char[] chArr = new char[str.countTokens()];
		
		int i =0;
		while(str.hasMoreTokens()) {
			chArr[i] = str.nextToken().charAt(0);
			System.out.println(chArr[i]);
			chArr[i] = Character.toUpperCase(chArr[i]);
			i++;
		}
		String upperCaseStr = new String(chArr);
		System.out.println(upperCaseStr);
		
		
	}

}
