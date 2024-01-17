package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i = 0, count = 0;
		double sum = 0, avg = 0;

		while (i < 101) {
			i++;
			sum += i;
			count++;
		}
		avg = sum/count;
		System.out.println(sum + ", " + avg);

	}

}
