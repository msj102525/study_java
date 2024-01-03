package silsub.sample;

import java.util.Scanner;

public class Munjae {
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		int avg = tot / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ) {
			System.out.println("합격");
			
		} else System.out.println("불합격");
	}
	
	public void test2() {
		System.out.print("1. 입력 2. 수정 3. 조회 4. 삭제 7. 종료");
		System.out.println();
		System.out.print("입력 : ");
		
		int num = sc.nextInt();
		String result;
		
		switch(num) {
		case 1:
			result = "입력메뉴가 선택되었습니다.";
			break;
		case 2:
			result = "수정메뉴가 선택되었습니다.";
			break;
		case 3:
			result = "조회메뉴가 선택되었습니다.";
			break;
		case 4:
			result = "삭제메뉴가 선택되었습니다.";
			break;
		case 7:
			result = "종류메뉴가 선택되었습니다.";
			break;
			
		 default:
				result = "번호가 잘못 입력.";		
		}
		System.out.println(result);
		
	}
	
	public void test3() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if( num > 0) System.out.println("양수다");
		else System.out.println("양수가 아님");
		
	}
	
	public void test4() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if ( num > 0) {
			
			if( num % 2 == 0) System.out.println("짝수다");
			else System.out.println("홀수다");
			
		} else {
			System.out.println("양수 아님");
		}
		
		String str = sc.next();
	} // test5();
	
	public void inputTest() {
		System.out.print("이름 입력 : ");		
		String name = sc.next();
		
		System.out.print("나이 입력 : ");		
		int age = sc.nextInt();
		
		System.out.print("키 입력 : ");		
		double height = sc.nextDouble();
		
		if (name != null && name.length() > 0 && age > 0 && height > 0) {
			System.out.println(name + "의 나이는 " + age + "세 이고, 키는 " + height + " cm 이다.");			
		} else System.out.println("다시 입력");
		
	}
	
	
	public void test6() {
		int first, second;
		
		System.out.print("첫번째 수 입력 : ");
		first = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		second = sc.nextInt();
		
		if( first > 0 && second > 0) {
			
			System.out.println("합 : " + (first + second));
			System.out.println("차 : " + (first - second));
			System.out.println("곱 : " + (first * second));
			System.out.println("몫 : " + (first / second));
			
		} else System.out.println("양수아님");
		
	} // test6();
	
	public void test7() {
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		if (score > 0) {
			if( score >= 90 ) grade = 'A';
			else if (score >= 80 ) grade = 'B';
			else if (score >= 70 ) grade = 'C';
			else if (score >= 60 ) grade = 'D';
			else grade = 'F';
		} else {
			grade = ' ';
		}
		System.out.println("점수 : " + score);
		System.out.println("등급 : " + grade);
	}
	
}
