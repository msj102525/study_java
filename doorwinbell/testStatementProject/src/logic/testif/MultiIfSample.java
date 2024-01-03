package logic.testif;

import java.util.Scanner;

public class MultiIfSample {
	/* if(조건식1) {
	 * 	조건식1이 true일때 실행할 구문들
	 * } else if(조건식2) {
	 * 	조건식1이 false이고, 조건식2가 true일때 실행할 구문들
	 * } else if(조건식3) {
	 * 	조건식2이 false이고, 조건식3가 true일때 실행할 구문들
	 * } else {
	 * 	위에 제시된 모든 조건이 false이면 실행할 구문
	 * }
	 * */
	Scanner sc = new Scanner(System.in);
	
	public void testThreeMax() {
		// 3개의 정수를 입력받아서, 세 수중에서 가장 큰값을 알아내어 출력
		System.out.print("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int second = sc.nextInt();
		
		System.out.print("세번째 정수 입력 : ");
		int third = sc.nextInt();
		
		int max;
		
		if(first > second && first > third) {
			max = first;
			
		}else if(second > third ) {
			max = second;
			
		}else {			
			max = third;
			
		}
		System.out.println("MAX = " + max);
	}
	
	public void testScoreGrade() {
		// 키보드로 점수(int)를 입력받아, 점수에 대한 등급(char)을 부여해서 출력
		// 단, 점수는 반드시 0이상의 값이어야 함
		// 다중 if문으로 
		// 점수가 90점 이상이면 'A'
		// 점수가 80점 이상이면 'B'
		// 점수가 70점 이상이면 'C'
		// 점수가 60점 이상이면 'D'
		// 점수가 60점 미만이면 'F'
		// 점수와 등급을 출력 처리함
		// 점수가 0미만이면 "잘못 입력하셨습니다." 출력
		
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		if( score >= 0 ) {
			if ( score >= 90 ) grade = 'A';
			
			 else if ( score >= 80) grade = 'B';
				
			 else if ( score >= 70) grade = 'C';
				
			 else if ( score >= 60) grade = 'D';
				
			 else  grade = 'F';
			
		} else {
			grade = ' ';
			System.out.println("잘못입력");
		}			
		System.out.println("점수 : " + score);
		System.out.println("등급 : " + grade);
		}
	
	public void testCharacter() {
		// 문자 하나 입력받아서,
		// 영문대문자이면 "upper"
		// 영어소문자이면 "lower"
		// 숫자문자이면 "digit"
		// 한글문자이면 "korean"
		// 그 외 면 " others"
		
		System.out.print("문자하나 입력 : ");
		char ch = sc.next().charAt(0);
		String str;
		if ( Character.isUpperCase(ch) )  str = "upper";
		
		else if ( Character.isLowerCase(ch) ) str= "lower";
		
		else if( Character.isDigit(ch) ) str = "digit";
		
		else if ( ch > 'ㄱ' && ch < '힝') str = "korean";
		
		else str = "others";	
	
		System.out.println(ch + " = " + str + " " + (int)ch);
	}
	
	public void testTwoMaxEqual() {
		// 두 개의 정수를 입력받아, 두 수를 비교해서
		// A가 B보다 크다.
		// A가 B와 같다.
		// B가 A보다 크다. 중 하나가 출력되게 구현
		System.out.print("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int second = sc.nextInt();
		
		String result;
		
		if(Math.max(first, second) == first) {
			result =  first + "가 " +  second + "보다 크다.";
			
		}else if (Math.max(first, second) == second ) {
			result =  second + "가 " +  first + "보다 크다.";
			
		} else {
			result =  second + "와 " +  first + "는 같다.";
			
		}
		
		System.out.println(result);
		
	}
	
	
	
}
