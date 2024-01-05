package logic.home.model;

import java.util.Scanner;

public class SwitchSample {

	Scanner sc = new Scanner(System.in);

	public void calculator() {
		// 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int secondNum = sc.nextInt();

		System.out.print("연산 기호 입력 : ");
		char operator = sc.next().charAt(0);

		int result = 0;

		switch (operator) {
		case '+':
			result = firstNum + secondNum;
			break;

		case '-':
			result = firstNum - secondNum;
			break;

		case '*':
			result = firstNum * secondNum;
			break;

		case '/':
			result = firstNum / secondNum;
			break;

		case '%':
			result = firstNum % secondNum;
			break;

		default:
			System.out.println("다시 입력");
		}

		System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);

	}

	public void fruitPrice() {
		// 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기
		System.out.print("과일 입력(사과, 바나나, 오렌지, 귤) : ");
		String fruit = sc.next();
				
		int result = 0;
		
		switch(fruit) {
			case "사과" :
			result = 1000;
			break;
			
			case "바나나" :
				result = 1100;
				break;
				
			case "오렌지" :
				result = 1200;
				break;
				
			case "귤" :
				result = 1300;
				break;	
				
			default:
				System.out.println("없는 과일 다시 입력");
	}
		System.out.println(fruit + "의 가격은 " + result + "원 이다." );

}
