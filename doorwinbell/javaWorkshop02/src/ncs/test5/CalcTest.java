package ncs.test5;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0 && num1 < 10 && num2 < 10) {
			System.out.println("합 : " + calc.sum(num1, num2));
			System.out.println("차 : " + calc.subtract(num1, num2));
			System.out.println("곱 : " + calc.multiply(num1, num2));
			System.out.println("나누기 : " + calc.divide(num1, num2));
		}else {
			System.out.println("다시 진행하세요");
		}

		
		
	}

}
