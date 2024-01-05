package logic.home.model;

import java.util.Scanner;

public class ForSample {
	Scanner sc = new Scanner(System.in);

	public void sum1To10() {
		// 1. 1~10까지 정수들의 합계 구하기

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void sumEven1To100() {
		// 2. 1~100사이의 짝수들의 합게 구하기
		int sum = 0;
		for (int i = 2; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum);

	}

	public void oneGugudan() {
		// 3. 정수 하나 입력받아, 그 수의 구구단 출력하기
		System.out.print("구구단 정수 하나 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

	public void sumMinToMax() {
		// 4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int secondNum = sc.nextInt();

		int min, max;

		if (firstNum >= secondNum) {
			max = firstNum;
			min = secondNum;
		} else {
			min = firstNum;
			max = secondNum;
		}

		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	public void printStar() {
		// 5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기
		System.out.print("줄 수 입력 : ");
		int line = sc.nextInt();

		System.out.print("칸 수 입력 : ");
		int star = sc.nextInt();

		if (line > 0 && star > 0) {
			for (int i = 1; i <= line; i++) {
				for (int j = 1; j <= star; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("양수 입력");
		}

	}

	public void printNumberStar() {
		// 6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void printTriangleStar() {
		// 7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)
		System.out.print("줄 수 입력 : ");
		int line = sc.nextInt();

		if (line > 0) {
			for (int i = 1; i <= line; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (line < 0) {
			line = line * -1;

			for (int i = 1; i <= line; i++) {
				for (int j = 1; j <= line; j++) {
					if (j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}

	}

	public void guguDan() {
		// 8. 구구단 2단부터 9단까지 출력하기
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j<10;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}

	}

}
