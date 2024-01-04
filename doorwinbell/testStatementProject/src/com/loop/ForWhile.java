package com.loop;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);

	public void printStar1() {
		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("다시입력");
		}

		for (int line = 1; line < num + 1; line++) {
			for (int star = 1; star <= line; star++) {
				if (line == star) {
					System.out.print(line);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void printStar2() {
		System.out.print("정수 입력 : ");

		int num = sc.nextInt();

		if (num < 0) {

			num = -num;

			for (int line = 1; line <= num; line++) {
				for (int star = 1; star <= num; star++) {
					if(line > star) {
						System.out.print('1');
					}else {
						System.out.print('*');						
					}
				}
				System.out.println();
			}
			
		} else {

			for (int line = 1; line < num + 1; line++) {
				for (int star = 1; star <= line; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	
	public void selectMenu() {
		
	}

}
