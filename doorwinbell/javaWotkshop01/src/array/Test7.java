package array;

public class Test7 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
				sum += array[i];
			}
		}
		System.out.println("합계 : " + sum);
	}

}
