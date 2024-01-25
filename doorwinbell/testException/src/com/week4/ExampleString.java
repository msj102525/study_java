package com.week4;

public class ExampleString {

	public String preChar(String s) {

		char[] chArr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			chArr[i] = s.charAt(i);
		}
		chArr[0] = Character.toUpperCase(chArr[0]);

		String newStr = new String(chArr);
		return newStr;
	}

	public int charSu(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}
}
