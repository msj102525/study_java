package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.print(" ** 1 ~ 5 숫자입력 :  ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.err.println(" ** 입력이 정상적으로 되었습니다! ** ");
			break;
		case 2:
			System.err.println(" ** 조회가 시작되었습니다! **  ");
			break;
		case 3:
			System.err.println(" ** 수정이 정상적으로 되었습니다! **  ");
			break;
		case 4:
			System.err.println(" ** 삭제가 정상적으로 되었습니다! **");
			break;
		case 5:
			System.err.println(" ** 정상적으로 종료 되었습니다! **  ");
			break;
		default:
			System.err.println(" ** 다시 입력해 주세요! ** ");

		}

	}

}
