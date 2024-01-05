package logic.home.model;

public class BreakSample {

	public void sumBreak() {
		// 1~100까지 정수들의 합계 출력하기(break문 사용)
		int sum = 0;

		for (int i = 1; i > 0; i++) {
			sum += i;
			if (i == 100) {
				break;
			}
		}
		System.out.println("합은 : " + sum);
	}

	public void guguDanBreak() {
		// 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j<10;j++) {
				if( j == 5 || i == 5) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}

	

}
