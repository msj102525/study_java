package ncs.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개 점수 입력 : ");
		String score = sc.nextLine();

		String scoreArr[] = score.split(" ");
//		System.out.println(scoreArr.length);

		if (scoreArr.length == 5) {
//			
			int totoal1 = (Integer.parseInt(scoreArr[0]) + Integer.parseInt(scoreArr[1]) / 12);
			int totoal2 = (Integer.parseInt(scoreArr[2]) + Integer.parseInt(scoreArr[3]) / 4);
			int totoal3 = (Integer.parseInt(scoreArr[4]) / 2);

			int totalSum = totoal1 + totoal2 + totoal3;
//			System.out.println("totalSum : " + totalSum);
			if (totalSum >= 90) {
				System.out.println("Gold Class");
			} else if (totalSum >= 80) {
				System.out.println("Silver Class");
			} else if (totalSum >= 70) {
				System.out.println("Bronze Class");
			} else {
				System.out.println("Normal Class");
			}

		} else {
			System.out.println("다시 5개 입력");
		}

	}

}
