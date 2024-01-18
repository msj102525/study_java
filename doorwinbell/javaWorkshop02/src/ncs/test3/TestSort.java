package ncs.test3;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		System.out.print("before : ");
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(numArr[i] + ", ");
		}
		
		Arrays.sort(numArr);
		
		System.out.println();
		System.out.print("after : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + ", ");
			
		}
		
	}

}
