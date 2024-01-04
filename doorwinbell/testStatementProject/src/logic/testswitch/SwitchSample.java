package logic.testswitch;

import java.util.Scanner;

public class SwitchSample {
	/*
	 * switch(변수) { // 값이 뭐냐? (변수 == 값) case 값 : 값이 맞았을 때 실행할 문장; break; case 값 :
	 * ................; break; ............ default : 위에 제시한 값이 모두 아닐 때 실행할 문장; }
	 * => default 생략 가능 => case에 사용하는 값은 양의 정수, 문자리터럴, 문자열값
	 */

	public void test1() {
		// 정수를 하나 입력받아서
		// 1이면 "입장하세요." 라고 출력
		// 2이면 "줄 서세요." 라고 출력
		// 3이면 "퇴장하세요." 출력
		// 제시한 값이 모두 아니면 "즐겁게 구경하세요." 출력 처리함

		System.out.print("숫자 입력 : ");
		int num = new Scanner(System.in).nextInt();
		String result;

		switch (num) {
		case 1:
			result = "입장하세요.";
			break;

		case 2:
			result = "줄 서세요.";
			break;

		case 3:
			result = "퇴장하세요.";
			break;

		default:
			result = "즐겁게 구경하세요.";
		}
		System.out.println(result);

	}

	public void calculator() {
		/*
		 * 입력 예 : 첫번째 정수 : 25 두번쨰 정수 : 7 연산문자 (+, -, *, /, %) : + 출력 에 : 25 + 7 = 32 =>
		 * 입력된 연산문자에 따라 계산식과 결과가 출력되게 구현
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int first = sc.nextInt();

		System.out.print("두번째 숫자 입력 : ");
		int second = sc.nextInt();

		System.out.print("연산자 입력 (+, -, *, /, %) : ");
		char oper = sc.next().charAt(0);

		int result = 0; // 지역변수는 반드시 초기화해야 함

		switch (oper) {
		case '+':
			result = first + second;
			break;

		case '-':
			result = first - second;
			break;

		case '*':
			result = first * second;
			break;

		case '/':
			result = first / second;
			break;

		case '%':
			result = first % second;
			break;

		default:
			System.out.println("다시 입력.");
		}
		System.out.println(first + " " + oper + " " + second + " = " + result);

	}

	public void calculator2() {
		/*
		 * 과일명(String)과 수량(int)을 입력받아, 가격을 계산해서 출력 과일에 따라 한개의 가격 저장용 변수 준비 : int price;
		 * 사과 1200 배 2500 포도 5000 오렌지 500 키위 350 그 외 다른 과일은 0
		 *
		 * 총구매가격: price * 수량 출력 : 사과 한 개의 가격은 1200원 구매수량은 5개 총 구매가격 : 6000원
		 */

		Scanner sc = new Scanner(System.in);

		int price = 0;

		System.out.print("과일 입력 : ");
		String ft = sc.next();

		System.out.print("수량 입력 : ");
		int quantity = sc.nextInt();

		switch (ft) {
		case "사과":
			price = 1200;
			break;
		case "배":
			price = 2500;
			break;
		case "포도":
			price = 5000;
			break;
		case "오렌지":
			price = 500;
			break;
		case "키위":
			price = 350;
			break;
		default:
			System.out.println("판매 X 과일");
		}

		if (price != 0) {
			System.out.println(ft + "의 한개의 가격은" + price);
			System.out.println("구매 수량 : " + quantity + "개");
			System.out.println("총 구매 가격 : " + (price * quantity) + "원");
		}

	}

	public void calculator2ChangeIfElse() {		
		Scanner sc = new Scanner(System.in);
		
		int price = 0; 
		
		System.out.print("과일 입력 : ");
		String ft = sc.next();
		
		// 입력된 과일명이 판매되는 과일일 때만 아레 내용이 작동되게 함
		
		if (ft.equals("사과") || ft.equals("배") || ft.equals("포도") || ft.equals("오렌지") || ft.equals("키위")) {			
				System.out.print("수량 입력 : ");
				int quantity = sc.nextInt();
				
				// 기본자료형(Primitive Type) 변수방에는 값이 기록되
				// 연산자는 값을 계산함
				// 클래스(Reference Type)를 자료형으로 만든 변수 == 레퍼런스 변수
				// 레퍼런스 변수방에는 할당된 객체의 주소가 기록됨
				
//				if(ft.equals("사과")) {
//					price = 1200;
//					
//				} else if (ft.equals("배")) {
//					price = 2500;
//					
//				} else if (ft.equals("포도")) {
//					price = 5000;
//					
//				} else if (ft.equals("오렌지")) {
//					price = 500;
//					
//				} else if (ft.equals("키위")) {
//					price = 350;
//					
//				}
				
				if(ft.equals("사과")) {
					price = 1200;
					
				}  if (ft.equals("배")) {
					price = 2500;
					
				}  if (ft.equals("포도")) {
					price = 5000;
					
				}  if (ft.equals("오렌지")) {
					price = 500;
					
				}  if (ft.equals("키위")) {
					price = 350;					
				} else {
					System.out.println("판매 X 과일");
				}
				
				System.out.println(ft + "의 한개의 가격은" + price );
				System.out.println("구매 수량 : " + quantity + "개");
				System.out.println("총 구매 가격 : " + (price * quantity) + "원");
			} // 판매되지 않는 과일이면
		else {
			System.out.println("판매하지 않는 과일");
			System.out.println("확인하고 다시 입력");
		}
	}
}
