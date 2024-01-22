package ncs.test4;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		double[][] arr = new double[3][5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("과목 1 : ");
			arr[i][0] = sc.nextDouble();
			System.out.print("과목 2 : ");
			arr[i][1] = sc.nextDouble();
			System.out.print("과목 3 : ");
			arr[i][2] = sc.nextDouble();
			
			arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
			arr[i][4] = arr[i][3] / 3.0;
		}
		
		System.out.printf("%-7s%5s%5s%5s%5s%7s \n", 
				"index", "과목1", "과목2", "과목3", "총점", "평균");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%-7d%-7.1f%-7.1f%-7.1f%-9.1f%-9.1f \n",
				i ,arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
		}
	}

}
