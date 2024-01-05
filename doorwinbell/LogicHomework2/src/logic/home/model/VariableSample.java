package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	
	// 클래스 안에 생성자가 존재하지 않으면, java virtual machine(jvm)이 컴파일 할 때
	// 기본생성자를 (public 클래스명(){}) 클래스에 자동 추가하면서 컴파일함

	public void myProfile() {
		// 내 신상정보 변수에 담아 출력하기
		System.out.println("이름 : 문승종");
		System.out.println("나이 : 27세");
		System.out.println("생일년월일 : 1998 07 11");
		System.out.println("성별 : 남자");
		System.out.println("전화번호 : 010010101");
		System.out.println("이메일 : msj@gmail.com");
		
		
	}

	public void empInformation() {
		// 사원정보를 키보드로 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원명 : ");
		String employeeName = sc.next();
		
		System.out.print("직급 : ");
		String employeePosition = sc.next();
		
		System.out.print("연봉 : ");
		double pay = sc.nextDouble();
		
		System.out.println("사원명 : " + employeeName);
		System.out.println("직급 : " + employeePosition);
		System.out.println("연봉 : " + pay);
		
	}

	public void defaultValue() {
		// 기본 자료형 변수의 초기값 확인하기
		// 변수 초기화 : 변수 방 만들면서 바로 초기값을 기록시킴
		// 초기값 : 변수 방에 첫번째로 기록되는 값
		// 작성 : 자료형 변수명 = 초기값;
		boolean flag = false;
		char ch = '\u0000';
		byte bnum = 0;
		short snum = 0;
		int inum = 0;
		long lnum = 0L;
		float fnum = 0.0f;
		double dnum = 0.0;
		
		System.out.println("boolean : " + flag);
		System.out.println("char : " + ch);
		System.out.println("byte : " + bnum);
		System.out.println("short : " + snum);
		System.out.println("int : " + inum);
		System.out.println("long : " + lnum);
		System.out.println("float : " + fnum);
		System.out.println("double : " + dnum);
	}
	
}
