package test1.model;

import java.util.Scanner;

public class Score {
	public void process() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		int tot = kor + eng + mat, avg = tot /3;
		
		String result = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) ? "합격입니다." : "불합격입니다.";
		System.out.println(result);
	}

}
