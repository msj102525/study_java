package ncs.test4;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int max = 0, min = 100, oddCount = 0, evenCount = 0, sum = 0;

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (new java.util.Random().nextInt(100) + 1);
			System.out.print(numArr[i] + "   ");
			sum += numArr[i];

			if (numArr[i] > max) {
				max = numArr[i];
			}

			if (numArr[i] < min) {
				min = numArr[i];
			}

			if (numArr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

		}
		System.out.println();
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("짝수의 개수: " + evenCount);
		System.out.println("홀수의 개수: " + oddCount);
		System.out.println("합: " + sum);
		System.out.printf("평균 : %.2f", (double) sum / 10);

	}

}
