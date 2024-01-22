package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		String str = sc.nextLine();
		String[] astr = str.split(" ");
		
		if (astr.length == 5) {
			int a = Integer.parseInt(astr[0]);
			int b = Integer.parseInt(astr[1]);
			int c = Integer.parseInt(astr[2]);
			int d = Integer.parseInt(astr[3]);
			int e = Integer.parseInt(astr[4]);

			if ((a > 9 && a < 100) 
					&& (b > 9 && b < 100) 
					&& (c > 9 && c < 100) 
					&& (d > 9 && d < 100)
					&& (e > 9 && e < 100)) {
				double first = (a + b) / 2 * 0.6;
				double second = (c + d) / 2 * 0.2;
				double third = e * 0.2;
				int sum = (int) (first + second + third);				
				
				String level = null;
				if (sum >= 90) {
					level = "Gold Class";
				} else if (sum >= 80) {
					level = "Silver Class";
				} else if (sum >= 70) {
					level = "Bronze Class";
				} else {
					level = "Nomal Class";
				}
				
				System.out.println("평가점수 : " + sum);
				System.out.println("Class : " + level);
			} else {
				System.out.println("다시 입력 하세요");
			}
		}else {
			System.out.println("다시 입력 하세요");
		}
	}

}
