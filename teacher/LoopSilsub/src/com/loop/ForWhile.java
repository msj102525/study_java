package com.loop;

import java.util.Scanner;

public class ForWhile {
	// Field
	Scanner sc = new Scanner(System.in);

	// 실습문제 1
	public void printStar1() {
		
		System.out.print("정수 하나 입력 : ");
		int rows = sc.nextInt();

		if (rows > 0) {
			for (int r = 1; r <= rows; r++) {
				for (int c = 1; c <= r; c++) {
					if (r == c)
						System.out.print(c);
					else
						System.out.print("*");
				}
				System.out.println();
			}
		} else
			System.out.println("양수가 아닙니다.");
	}

	// 실습문제 2
	public void printStar2() {
		
		System.out.print("정수 하나 입력 : ");
		int rows = sc.nextInt();

		if (rows > 0) { // 양수일 때
			for (int r = 1; r <= rows; r++) {
				for (int c = 1; c <= r; c++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		if (rows < 0) { // 음수일 때
			for (int r = 1; r <= -rows; r++) {
				for (int c = 1; c <= -rows; c++) {
					if (r > c)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}

		if (rows == 0)
			System.out.println("출력기능 없습니다.");
	}
	

	// 실습문제 4
	public void countInputCharacter() {
		
		System.out.print("문자열 입력 : ");
		String inputValue = sc.next();
		System.out.print("문자 입력 : ");
		char findCharacter = sc.next().charAt(0);

		int count = 0, index;
		for (index = 0; index < inputValue.length(); index++) {
			char c = inputValue.charAt(index);

			if (!Character.isAlphabetic(c)) {
				// if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))){
				System.out.println("영문자가 아닙니다.");
				break; // 알파벳문자가 아니면 강제 반복 종료
			}

			if (c == findCharacter)
				count++;
		}

		if (index == inputValue.length())
			System.out.println("포함된 갯수 : " + count);

	}

}
