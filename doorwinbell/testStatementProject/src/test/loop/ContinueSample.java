package test.loop;

public class ContinueSample {
	// continue 문 : 반복문 안에서만 사용할 수 있음
	// if(조건식) continue;
	// 반복할 내용을 중간 생략시킬 때 주로 사용함

	public void testContinue() {
		// 1부터 100까지의 정수들의 합계를 출력
		// 단, 5의 배수는 제외함
		int sum = 0;
		for (int k = 1; k < 101; k++) {

			if (k % 5 == 0) {
				continue;
			}

			sum += k;

			if (k < 99) {
				System.out.print(k + " + ");
			} else
				System.out.print(k);

		}
		System.out.println(" = " + sum);
	}

	public void testContinueChangeWhile() {
		// 1부터 100까지의 정수들의 합계를 출력
		// 단, 5의 배수는 제외함
		int sum = 0;
//		for(int k = 1; k < 101; k++) {
		int k = 1;

		while (k < 101) {

			if (k % 5 == 0) {
				k++;
				continue;
			}

			sum += k;

			if (k < 99) {
				System.out.print(k + " + ");
			} else
				System.out.print(k);
			k++;
		}

		System.out.println(" = " + sum);
	}

	public void testContinueChangeDoWhile() {
		// 1부터 100까지의 정수들의 합계를 출력
		// 단, 5의 배수는 제외함
		int sum = 0;
		int k = 1;

//		for(int k = 1; k < 101; k++) {
//		while(k < 101) {
		do {

			if (k % 5 == 0) {
				k++;
				continue;
			}

			sum += k;

			if (k < 99) {
				System.out.print(k + " + ");
			} else
				System.out.print(k);
			k++;
		} while (k < 101);

		System.out.println(" = " + sum);
	}

	// for문 안에 for문을 사용하는 경우 : 2중 for문
	// 반복되는 내용 전체가 다시 반복되는 경우에 사용함
	/*
	 * ††††††††††
	 * †††††††††† 
	 * †††††††††† 
	 * †††††††††† 
	 * ††††††††††
	 */

	public void doubleFor() {
		for (int k = 1; k < 6; k++) {
			for (int i = 1; i < 11; i++) {
				System.out.print("†");
			}
			System.out.println();
		}
	}
	
	// 구구단 2단부터 9단까지 출력
	public void printGugudan() {
		for(int j = 2; j < 10; j++) {
			for(int i =1; i<10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println("------------------");
		}	
	}
	
	// *****
	// *****
	// *****
	// *****
	// *****
	public void printStar() {	

		for (int k = 1; k < 6; k++) {
			for (int i = 1; i < 6; i++) {
				System.out.print("*");
			}
			System.out.println();
		}			
		
	}
	
	// *
	// **
	// ***
	// ****
	// *****
	
	public void printStar2() {	

		for (int k = 1; k < 6; k++) {
			for (int i = 1; i <= k; i++) {
				System.out.print("*");
			}
			System.out.println();
		}			
		
	}
	
	// 1****
	// *2***
	// **3**
	// ***4*
	// ****5
	public void printStar3() {	

		for (int k = 1; k < 6; k++) {
			for (int i = 1; i < 6; i++) {
				if(i == k) {
					System.out.print(k);
				}else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}			
		
	}
	
	// *****
	// 	  ****
	//      ***
	//         **
	//           *
	public void printStar4() {	

		for (int k = 1; k < 6; k++) {
			
			for (int i = 1; i < 6; i++) {
				if(k > i) {
					System.out.print('1');
				}else {
					System.out.print('*');					
				}
			}
			System.out.println();
		}			
		
	}

}
