package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("10이하 정수 입력 ");
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0  && num1 * num2 < 10) {
			System.out.println("한자리 수 입니다.");
		}else {
			System.out.println("두자리 수 입니다.");			
		}

	}

}
