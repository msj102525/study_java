package array;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] copyAr =  new int[array.length * array[0].length];
		int copyArIndex = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
				if (array[i][j] % 3 == 0) {
					copyAr[copyArIndex] = array[i][j];
					copyArIndex++;
				}
					
			}
		}

		for (int i = 0; i < copyArIndex; i++) {
			System.out.print(copyAr[i] + " ");
		}
	}

}
