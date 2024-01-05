package logic.home.model;

public class ContinueSample {

	public void sumJumpThree() {
		// 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			sum += i;
			if (i %3 == 0) {
				continue;
			}
		}
		System.out.println("합은 : " + sum);
	}

	public void rowColJump() {
		// 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기
//		int [] intArr;
		// 모르겠음.
		
	}

}
