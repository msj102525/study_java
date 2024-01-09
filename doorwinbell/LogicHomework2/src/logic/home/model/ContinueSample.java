package logic.home.model;

public class ContinueSample {

	public void sumJumpThree() {
		// 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			sum += i;
			if (i % 3 == 0) {
				continue;
			}
		}
		System.out.println("합은 : " + sum);
	}

	public void rowColJump() {
		// 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기
//		int [] intArr;
		// 모르겠음.
		for (int row = 1; row <= 3; row++) { // 행에 대한 반복 처리
			// 각 행별 열에 대한 반복 처리
			for (int col = 1; col <= 5; col++) {
				if (row == 1 && col > 2) {
					continue; // 아래쪽 구문을 실행하지 말고, 증감식으로 가라
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
