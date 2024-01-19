package ncs.test2;

import java.util.Arrays;

public class ListTest {

	private int compare(int num1, int num2) {
		return num2 - num1;
	}

	private void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (compare(array[i], array[j]) < 0) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	private void display(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		java.util.Random r = new java.util.Random();

		ListTest lt = new ListTest();

		int[] numArr = new int[10];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = r.nextInt(100) + 1;
		}
		System.out.print("정렬전 :");
		lt.display(numArr);
		lt.sort(numArr);
		System.out.print("정렬후 :");
		lt.display(numArr);

	}

}
