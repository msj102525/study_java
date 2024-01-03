package test.operator;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);
	
	
	public void sample1() {
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		
		System.out.println((kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) ? "합격" : "불합격");
		
	}
	
	public void sample2() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 번호 : ");
		int classNo = sc.nextInt();
		
		System.out.print("출석번호 : ");
		int studentNo = sc.nextInt();
		
		System.out.print("Male or Female : ");
		char ch = sc.next().charAt(0);
		String gender = (ch == 'M' || ch == 'm') ? "남" : "여";
		
		System.out.print("점수 : ");
		double score = sc.nextDouble();
		
		System.out.println(grade + "학년 " + classNo + "반 " + studentNo + "번 "
				+ gender + "학생 " + name  + "은 성적이 " + score + "이다.");
		
	}
	
	public void sample3() {
		int num = scInt();
		
		String result = num > 0 ?  " 양수다." : " 양수가 아니다.";
		System.out.println(num + "=" + result);	
		
	}
	
	public void sample4() {
		int num = scInt();
		
		String result = num % 2 == 0 ? "짝수다." : "홀수다.";
//		System.out.println(result);	
		
		
	}
	
	private int scInt () {
		System.out.print("숫자 입력 : ");	
		int num = sc.nextInt();
		return num;
	}
	
	public void sample5() {
		double dbMax = Double.MAX_VALUE, 
				dbMin = Double.MIN_VALUE, 
				dbByte = Double.BYTES,
				dbMaxExp = Double.MAX_EXPONENT,
				dbMinExp = Double.MIN_EXPONENT,
				dbSize = Double.SIZE,
				dbNm = Double.MIN_NORMAL;
				
		System.out.println("double 자료형 정보");
		System.out.println("최대값 : " + dbMax);
		System.out.println("최소값 : " + dbMin);
		System.out.println("할당크기 : " + dbByte);
		System.out.println("최대 : " + dbMaxExp);
		System.out.println("최소 : " + dbMinExp);
		System.out.println("비트수 : " + dbSize);
		System.out.println("일반 : " + dbNm);
		
		
	}
	
	public void sample6() {
		System.out.print("고객이름 : ");
		String customerName = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("포인트 : ");
		double point = sc.nextDouble();
		
		System.out.print("특이사항 : ");
		sc.nextLine();
		String etc = sc.nextLine();
		
		
		System.out.println(customerName + age + gender + phone + point );
		System.out.println("특이사항 : " + etc);
		
	}
	
	
	
	
}
