package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	
	// 실습문제 3
	public void selectMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		int menuNo, account = 0, price = 0, totalPrice = 0;
		String orderItem = "", orderList = "";
		char continueAnswer;

		do {
			continueAnswer = 'N';

			System.out.println("*** 메뉴를 선택하세요 ***");
			System.out.println();
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	    3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김	    1000원");
			System.out.println("4. 치즈스틱	    400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 ***************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("********************");
			System.out.print("메뉴 선택 : ");
			menuNo = sc.nextInt();

			switch (menuNo) {
			case 1:
				orderItem = "불고기버거";
				price = 3500;
				break;
			case 2:
				orderItem = "치킨버거";
				price = 3200;
				break;
			case 3:
				orderItem = "감자튀김";
				price = 1000;
				break;
			case 4:
				orderItem = "치즈스틱";
				price = 400;
				break;
			case 5:
				orderItem = "샐러드";
				price = 2000;
				break;
			case 6:
				orderItem = "콜라";
				price = 700;
				break;
			case 7:
				orderItem = "에이드";
				price = 1200;
				break;
			case 8:
				orderItem = "커피";
				price = 1000;
				break;
			default:
				System.out.println("없는 항목을 선택하였습니다.");
				System.out.println("다시 주문하십시오.");
				continueAnswer = 'Y';
			} // switch closed
			if (continueAnswer == 'Y')
				continue;

			System.out.println(orderItem + "를 선택하셨습니다.");
			System.out.print("수량은 ? ");
			account = sc.nextInt();
			System.out.println(account + "개 주문하셨습니다.");

			// ** 계산된 가격은 계속 저장되어 있음 **
			int total = price * account; // 계산 처리됨
			orderList += orderItem + " : " + account + "개 - " + total + "원 \n";
			totalPrice += total; // 주문한 가격 합산 처리

			System.out.print("추가 주문하시겠습니까?(y/n) : "); // y 입력시 메뉴화면 반복실행됨
			continueAnswer = sc.next().toUpperCase().charAt(0);

		} while (continueAnswer == 'Y');

		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-----------------------------------------------");
		System.out.print(orderList);
		System.out.println("------------------------------------------------");
		System.out.println("총 가격 : " + totalPrice + "원");
	}
}
