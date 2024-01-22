package test2.model;

import java.util.Scanner;

public class Student {
	public void information() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name = sc.next();

		System.out.print("학년 : ");
		int grade = sc.nextInt();

		System.out.print("반: ");
		int classNum = sc.nextInt();

		System.out.print("번호: ");
		int studentID = sc.nextInt();

		System.out.print("성별 (M/F) : ");
		char gender = Character.toUpperCase(sc.next().charAt(0));
		String strGender = (gender == 'M') ? "남학생" : "여학생";

		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.println(grade + "학년 " + classNum + "반 " + studentID + "번 " + strGender +
									" " + name + "는 성적이 " + score + "이다.");
	}

}
