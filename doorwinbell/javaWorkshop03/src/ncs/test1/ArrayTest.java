package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, { 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 } };
		float sum = 0, count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}

		System.out.printf("합계 : %.2f\t", sum);
		System.out.println();
		System.out.printf("통계 : %.2f\t", sum/count);

	}

}
