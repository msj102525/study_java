package com.loop.test;

import java.util.Scanner;

import com.loop.ForWhile;

import home.menu.CashBurgerKing;

public class Main {

	public static void main(String[] args) {
		// 반복문 실습 실행용
		menu();
	}
	
	//메뉴를 만들어, 각 문제를 메뉴에서 실행되게 작성할 것
	public static void menu() {
		ForWhile test = new ForWhile();
		
		do {
			System.out.println("\n반복문 실습 실행 테스트 ************************\n");
			System.out.println("1. 문제1");
			System.out.println("2. 문제2");
			System.out.println("3. 문제3");
			System.out.println("4. 문제4");
			System.out.println("5. 프로그램 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			int no = new Scanner(System.in).nextInt();
			
			switch(no) {
			case 1:	test.printStar1();   break;
			case 2:	test.printStar2();   break;
			case 3:	new CashBurgerKing().selectMenu();   break;
			case 4:	test.countInputCharacter();  break;
			case 5:	System.out.println("반복문 실습 프로그램을 종료합니다.");
			        return;
			}
		}while(true);
	}
}
