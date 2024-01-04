package test.loop;

import java.util.Scanner;

public class ForSample {

	public void oneTo100() {
		// 1부터 100까지 정수들의 합계
		// 1 + 2 + 3 + ... + 99 + 100 = 5050;
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i; // sum = sum + i;
			if (i == 100) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}

		}
		System.out.println(" = " + sum);
	}

	public void notEvenSum() {
		// 1부터 100 까지 홀수들의 합게를 계산해서 출력
		// 1 + 3 + 5 + ... + 99 = 2525

		int sum = 0;
		for (int i = 1; i < 101; i += 2) {
			sum += i; // sum = sum + i;
			if (i < 99) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}

		}
		System.out.println(" = " + sum);
	}

	public void evenSum() {
		// 1부터 100까지 짝수들의 합계 출력
		// 2 + 4 + .... + 98 + 100 = 2550

		int sum = 0;
		for (int i = 2; i < 101; i += 2) {
			sum += i; // sum = sum + i;
			if (i < 100) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}

		}
		System.out.println(" = " + sum);
	}

	public void threeSum() {
		// 1부터 100까지정수 중 3의 배수들의 합
		// 3 + 6 + 9 + ... + 99 = 1683
		int sum = 0;
		for (int i = 3; i < 101; i += 3) {
			sum += i; // sum = sum + i;
			if (i < 99) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}

		}
		System.out.println(" = " + sum);
	}

	public void gugudan() {
		// 정수를하나 입력받아, 입력된 수가 양수이면서, 한자리 정수이면
		// 그 수의 구구단 출력
		// 0이거나 음수 또는 한자리 정수가 아니면 "한자리 양의 정수만 입력하세요." 출력

		System.out.print("정수를 하나 입력 : ");
//		int num = new Scanner(System.in).nextInt();
		java.util.Scanner sc = new java.util.Scanner(System.in)
		int num = sc.nextInt();

		if (num > 0 && num < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));				
			}
		} else {
			System.out.println("한자리 양의 정수만 입력.");
		}

	}
	
	public void minToMax() {
		// 두 개의 정수를 입력받아, 두 수중 작은값을 초기값으로 큰값을 종료값으로 사용해서
		// 작은 수에서 큰 수까지의 정수들의 합계를 구해서 출력
		// 예 : 12 45 입력시
		// 출력 : 12 에서 45까지 정수들의 합계 : ....
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();
		
		System.out.print("두번쨰 정수 입력 : ");
		int secondNum = sc.nextInt();
		
		int max = secondNum;
		int min = firstNum;
		
		int sum = 0;
		
		if(firstNum > secondNum) {
			max = firstNum;
			min = secondNum;
		}
		
		for(int i = min; i <= max; i ++) {
			sum += i;
		}
		System.out.println("합은 : " + sum);
		
	}
	
	public void testRandom() {
		// 임의의 난수를 발생(만들어 내고자)할 때 사용하는 메소드
		// java.lang.Math의 random() 메소드
		// java.util.Random의 메소드
		System.out.println("랜덤값 : " + Math.random()); // 0.0 <= double 형값 < 1.0
		// 1부터 100 사이의 임의의 정수 만들기
		// (int)(Math.random() * 최대값) + 최소값
		System.out.println("1 ~ 100 사이의 임의의 정수 : " + (int)(Math.random() * 100 + 1));
		
		// 51 ~ 80 사이의 임의의 정수를 만들려면
		// (int)(Math.random() * (80 - 51 + 1)) + 최소값
		System.out.println("51 ~ 80 사이의 임의의 정수 : " + ((int)(Math.random() * (80 - 51 + 1) + 51)));
		
		java.util.Random r = new java.util.Random();
		// import 선언하면 : Random r = new Random();
		
		System.out.println("랜덤값 : " + r.nextDouble());
		System.out.println("1~100사이의 임의의 정수  : " + (r.nextInt(100) + 1));
	}
	
	public void sumRandomNumber() {
		// 1 ~ 100 사이의 임의의 정수를 하나 발생
		// 1 ~ 랜덤값까지의 정수들의 합계를 구해서 출력
		// 출력 1 ~ 랜덤값까지의 정수들의 합계 : ~
		
		int ranNum = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		for(int i = 1; i <= ranNum; i++) {
			sum += i;
		}
		System.out.println("ranNum : " + ranNum);
		System.out.println("1부터 ranNum 까지의 합 : " + sum);
		
	}
	

}
