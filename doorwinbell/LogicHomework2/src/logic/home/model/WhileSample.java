package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		// 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
		System.out.print("문자 하나 입력 : ");
		char ch;

		while ((ch = sc.next().charAt(0)) != '0') {
			System.out.println(ch + " is unicode " + (int) ch);

			System.out.print("문자 하나 입력 : ");
		}
	}

	public void sum1To100() {
		// 1~100까지 정수들의 합계 출력하기(while 문으로 작성)
		int i = 1;
		int sum = 0;
		while (i != 101) {
			sum += i;
			i++;
		}
		System.out.println("합 : " + sum);

	}

	public void numberGame() {
		// 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
		System.out.print("숫자 맞추기 : ");
		int inputNum = sc.nextInt();

		int ranNum = (int) (Math.random() * 100 + 1);

		while (inputNum != ranNum) {
			System.out.println("정답 : " + ranNum);
			System.out.print("숫자 맞추기 : ");
			inputNum = sc.nextInt();
		}
	}

	public void countCharacter() {
		// 문자열을 입력받아, 글자 갯수 알아내어 출력하기
		System.out.print("글자 입력 : ");
		String str = sc.next();
		System.out.println(str.length());

	}

	public void countInChar() {
		// 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기
		int count = 0, i;

		System.out.print("문자열 입력 : ");
		String str = sc.next();

		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);

		char[] strArr = new char[str.length()];

		for (i = 0; i < str.length(); i++) {
			strArr[i] = str.charAt(i);
			if (strArr[i] == ch) {
				count++;
			}
		}

		System.out.println(ch + "가 포함된 갯수 : " + count);

	}

}
