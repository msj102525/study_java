package test.sample;

// 형변환 연습용
public class CastingSample {
	
	public void autoCasting() {
		// 자동형변환 확인용
		
		int num = 125;
		double dnum = 3.5;
		
		// 원칙 1. 같은 종류끼리만 계산할 수 있음
		System.out.println("계산결과 : " + (num + dnum) ); // 128.5
		// 계산 결과가 double 이면, double + double 이라는 뜻
		// 즉, int가 double로 자동형변환 됨
		
		// 원칙 2. 같은 종류끼리만 대입할 수 있음
		double pay = 345000; // int가 double로 자동형변환
		// 345000.0
		System.out.println("pay : " + pay);
		
	}
	
	public void testCasting() {
		// 강제형변환(명시적형변환)
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		// 원칙 3. 계산의 결과값도 같은 타입이여야 함
		int result = a + b;
		System.out.println("result : " + result); // 결과값이 int 범위를 벗어난 값임
		
		long result2 = a + b; // int + int => int => long; 그래서 overflow돼서 -2임
		System.out.println("result2 : " + result2);
		
		long result3  = (long)a + b; // long + int => long + long => long; 4294967294
		System.out.println("result3 : " + result3);
		
		int iNum = (int)123.5;
		// 크기가 큰 자료형 값이 작은 크기의 자료형 변수에 대입 될 때, 형변환 명시가 필요함
		
	}

}
