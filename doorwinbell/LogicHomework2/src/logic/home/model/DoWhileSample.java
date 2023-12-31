package logic.home.model;


import java.util.Arrays;
import java.util.Scanner;

public class DoWhileSample {
	
	Scanner sc = new Scanner(System.in);
	
	public void testMathRandom() {
		// 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		String[] strArr = str.split("");
		
		
		String newStr = String.join("-", strArr);
		
		System.out.println(Arrays.toString(strArr));
		System.out.println(newStr);

	}

	public void burgerKingMenu() {
		// 버거킹 메뉴 주문 테스트
		int tot = 0;
		char yOrN;
		int select;

		do {
			System.out.println("*** 메뉴를 선택하세요 ***");

			System.out.println("햄버거 *******");
			System.out.println("1. 불고기버거	3500원 ");
			System.out.println("2. 치킨버거 3200원 ");

			System.out.println("추가 *******");
			System.out.println("3. 감자튀김	100원 ");
			System.out.println("4. 치즈스틱	400원 ");
			System.out.println("5. 샐러드	2000원 ");

			System.out.println("음료수 *******");
			System.out.println("6. 콜라 700원 ");
			System.out.println("7. 에이드 1200원 ");
			System.out.println("8. 커피 1000원 ");

			System.out.print("메뉴 선택 : ");
			select = sc.nextInt();

			switch (select) {
			case 1:
				select = 3500;
				break;

			case 2:
				select = 3200;
				break;

			case 3:
				select = 1000;
				break;

			case 4:
				select = 400;
				break;

			case 5:
				select = 2000;
				break;

			case 6:
				select = 700;
				break;

			case 7:
				select = 1200;
				break;
				
			case 8:
				select = 1000;
				break;
			}

			System.out.print("수량 선택 : ");
			int quantity = sc.nextInt();

			tot += select * quantity;

			System.out.print("추가 주문? (y / n): ");
			yOrN = sc.next().charAt(0);

		} while (yOrN == 'y');

		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-------------------------");
		
		System.out.println("총가격 : " + tot);
		
	}

	public void isStringAlphabet() {
		// 문자열 입력받아, "모든 글자 영문자다"/"영문자 아니다." 출력하기
		System.out.print("문자열 입력 : ");
		String str = sc.next();		
		
		char[] strArr = new char[str.length()];
		
		for(int i = 0; i< str.length();i++) {
			if(!Character.isAlphabetic(str.charAt(i))) {
				System.out.println("영문자가 아님.");
				break;
			}else {
				System.out.println("모든 글자 영문자.");
			}
			}
	}

}
