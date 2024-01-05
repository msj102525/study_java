package logic.home.model;

import java.util.Scanner;

public class IfSample {

	Scanner sc = new Scanner(System.in);

	public int[] scNum() {
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int secondNum = sc.nextInt();
		int[] result = { firstNum, secondNum };
		return result;

	}

	public void maxNumber() {
		// 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int secondNum = sc.nextInt();

		System.out.println(firstNum + "와" + secondNum + "중" + Math.max(firstNum, secondNum) + "이 크다.");

	}

	public void minNumber() {
		// 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int secondNum = sc.nextInt();

		System.out.println(firstNum + "와" + secondNum + "중" + Math.min(firstNum, secondNum) + "이 작다.");
	}

	public void threeMaxMin() {
		// 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기
		System.out.print("첫번째 정수 입력 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int secondNum = sc.nextInt();

		System.out.print("세번째 정수 입력 : ");
		int thirdNum = sc.nextInt();

		int resultMax, resultMin;

		if (firstNum > secondNum && firstNum > thirdNum) {
			resultMax = firstNum;
			resultMin = Math.min(secondNum, thirdNum);

		} else if (secondNum > thirdNum) {
			resultMax = secondNum;
			resultMin = Math.min(firstNum, thirdNum);

		} else {
			resultMax = thirdNum;
			resultMin = Math.min(firstNum, secondNum);
		}

		System.out.println(firstNum + "와 " + secondNum + "와 " + thirdNum + "중 " + resultMax + "가 크다.");
		System.out.println(firstNum + "와 " + secondNum + "와 " + thirdNum + "중 " + resultMin + "가 작다.");

	}

	public void checkEven() {
		// 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기
		System.out.print("정수 입력 : ");
		
		if(sc.nextInt() % 2 == 0) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");			
		}
		

	}

	public void isPassFail() {
		// 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		int avg = tot / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");			
		}

	}

	public void scoreGrade() {
		// 점수를 입력받아, 학점 확인하기
		System.out.print("점수 입력 : ");
		int score = 	sc.nextInt();
		
		char result = ' ';		
		if (score >= 90) {
			result = 'A';
		}
		if (score >= 80) {
			result = 'B';
		}
		if (score >= 70) {
			result = 'C';
		}
		if (score >= 60) {
			result = 'D';
		}
		if (score < 60) {
			result = 'F';
		}
		if (score >= 0) {
			System.out.println("등급 : " + result);			
		}else {
			System.out.println("다시 입력");
		}
		

	}

	public void checkPlusMinusZero() {
		// 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기
		System.out.print("정수 입력 : ");
		int num = 	sc.nextInt();
		String result = (num > 0) ? "양수" : (num == 0) ? "0이다." : "음수다";
		
		System.out.println(result);
		
	}

	public void whatCaracter() {
		//문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		
		String result;
		if(Character.isAlphabetic(ch)) {
			
			if(Character.isUpperCase(ch)) {
				result = "영어대문자";
			}else {
				result = "영어소문자";
			}
			
		} else if (Character.isDigit(ch)) {
			result = "숫자";
		} else {
			result = "etc....";
		}
		System.out.println(ch + " = " + result);

	}

}
