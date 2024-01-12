package array2.controller;

import java.util.Scanner;

import array2.model.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// 객체배열실습 문제 2
		// 1. 최대 10명의 학생 정보를 기록할 수 있게 배열 할당함
		Student[] stArr = new Student[10];
		int count = 0, totalScore = 0;
		
		// 2. 학생 정보가 한명씩 추가될 때 마다 카운트함
		// => while() 문 사용함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면
		// 계속 객체 추가하고 키보드로 값 입력받아 기록함.
		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println(count + 1 + "번째 학생 정보입력");

			stArr[count] = new Student();

			// 3. 키보드로 3명의 학생 정보를 입력받아, 각 객체에 저장함
			System.out.print("반 종류(A, B, C) : ");
			stArr[count].setSclass(sc.next().toUpperCase().charAt(0));

			System.out.print("학생 이름 : ");
			stArr[count].setName(sc.next());

			System.out.print("점수 : ");
			stArr[count].setScore(sc.nextInt());

			// 4. 현재 입력된 학생들의 점수의 평균을 구하여 출력함
			totalScore += stArr[count].getScore();

			count++;

			System.out.print("계속 추가함? (y | n)");

			if (sc.next().toUpperCase().charAt(0) != 'Y') {
				break;
			}
		} // while

		System.out.println(count + "명의 점수 평균 : " + (totalScore / count));

		// 5. 현재 기록된 학생들의 정보를 모두 출력함
		for (int i = 0; i < count; i++) {
			System.out.println(stArr[i].studentInformation());
		}
	}

}
