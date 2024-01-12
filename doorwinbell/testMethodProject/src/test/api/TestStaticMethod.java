package test.api;

public class TestStaticMethod {

	public static void main(String[] args) {
		// 자바가 제공하는 static method 사용 테스트
		// 메소드 반환자료형 앞에 static이 표시된 메소드
		// static메소드 안에는 this 레퍼런스가 존재하지 않음
		// => 메소드 실행시 주소 전달이 필요없음
		// 클래스명.메소드() 형식으로 사용함
		
		// 1. 반환값 없고 매개변수 없는 static 메소드
		// 클래스명.메소드();
		System.gc();
		
		// 2. 반환값 없고 매개변수 있는 static 메소드
		// 클래스명.메소드(전달인자);
		// 전달인자(argument)는 매개변수와 갯수, 자료형, 순서가 일치해야 함
//		System.out.println("프로그램 끝!");
//		System.exit(0);
		
		// 3. 반환값 있고 매개변수 없는 static 메소드
		// 반환자료형 반환값 받을 변수 = 클래스명.메소드();
		double value = Math.random();
		System.out.println("value : " + value);
		
		// 4. 반환값 있고 매개변수 있는 static 메소드
		// 반환자료형 반환값 받을 변수 = 클래스명.메소드(전달인자);
		double tesult = Math.abs(-3.5);
		System.out.println("tesult : " + tesult);
		System.out.println("절대값 : " + Math.abs(-3.5));

	}

}
