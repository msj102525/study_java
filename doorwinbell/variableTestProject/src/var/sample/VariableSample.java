package var.sample;


// 기능 제공용 클래스임 : main 메소드가 없음
public class VariableSample {
	
	// 멤버함수 (method) == 기능
	// 접근제한자 [예약어] 반환자료형 메소드([자료형 변수명]) { 기능에 대한 처리내용 코드 작성 }
	public void makeVariable() {
		// 1. 변수 선언 : 메모리(RAM)에 값(DATA)을 기록할 방(공간)을 만드는 것
		// 자료형 변수명;
		// 자료형(DATA TYPE : 값의종류) : 값을 구분하기 위한 단어
		// 자료형은 기본 자료형(Primitive Type)과 참조 자료형(Reference Type)이 구분됨
		// 기본 자료형은 boolean, byte, short, int, long, float, double, char 8개가 제공됨
		// 변수명은 네이밍 룰에 맞춰서 임의대로 지어주면 됨
		boolean flag;
		byte bnum;
		short snum;
		int score;
		long pay;
		float area;
		double perimeter;
		char grade;
		
		// 2. 준비된 변수방에 CPU가 사용할 값을 기록해 넣음
		// 대입 연산자 (=) 사용함
		// 변수명 = 기록할값; 또는 변수명 = 계산식;
		// 변수 선언 시 사용된 자료형에 해당되는 값만 변수에 기록할 수 있음
		flag = true; // 참(true), 거짓(false)
		bnum = 100; // 1byte : -128 ~ 127
		snum = 12345; // 2byte : -32768 ~ 32767
		score = 95; // 4byte : -2147483648 ~ 2147483647
		pay = 5000000000L; // 8byte : long 형 정수 값은 반드시 뒤에 L을 표기해야 함
		area = 34.5f; // 4byte : 소수점 아래 7째 자리까지 취급함, float형 실수 값뒤에는 반드시 f를 표기해야 함
		perimeter = 250.0; // 8byte : 소수점 아래 15째 자리까지 취급함
		grade = '뛟'; //문자 하나를 표기할 때는 반드시 작은따옴표 '' 로 묶어줌 
		
		// 3. 값 사용 : 값이 기록된 변수명을 코드 구문으로 사용하면, 변수방 안의 값을 읽어감
		System.out.println("flag : " + flag);
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("score : " + score);
		System.out.println("pay : " + pay);
		System.out.println("area : " + area);
		System.out.println("perimeter : " + perimeter);
		System.out.println("grade : " + grade);
		
	}
	
}
