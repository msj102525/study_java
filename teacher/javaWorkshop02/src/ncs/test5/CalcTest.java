package ncs.test5;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
				
		System.out.print("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int second = sc.nextInt();
		
		if((first > 0 && first < 10) && (second > 0 && second < 10)) {
			System.out.println("합 : " + calc.sum(first, second));
			System.out.println("차 : " + calc.subtract(first, second));
			System.out.println("곱 : " + calc.multiply(first, second));
			System.out.println("나누기 : " + calc.divide(first, second));
		}else {
			System.out.println("다시 진행하세요.");
		}
	}

}
