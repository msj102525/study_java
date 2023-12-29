package test.input;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// 키보드 입력 테스트
		TestScanner ts = new TestScanner();
		ts.testKeyboardInput();		
		
	}
	
	// java.util.Scanner 클래스를 이용한 키보드 입력 테스트용 메소드
	public void testKeyboardInput() {
		// 자바에서 클래스가 제공하는 메소드를 사용하려면
		// 클래스명 래퍼런스 = new 클래스생성자(); 클래스생성자는 클래스명과 같아야 한다.
		// 래퍼런스.메소드();
		
		Scanner sc = new Scanner(System.in);
		
//		String name;
//		int age;
//		double pay;
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("급여를 입력하세요 : ");
		double pay = sc.nextDouble();
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("급여 : " + pay);
	}

}
