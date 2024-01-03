package operator.sample;

public class OperatorSample2 {
	
	public void 반올림테스트() {
		float fnum = 1.23456789f;
		// 소숫점 아래 둘째자리까지 표시한다면		
		System.out.println("fnum : " + fnum);
		System.out.println("fnum : " + ((int)(fnum * 100) / 100f));
		System.out.printf("fnum : %.2f\n", fnum);
	}
	
	public void 복합대입연산자테스트() {
		// = 대입연산자와 산술, 쉬프트, 비트논리 연산자와 함께 사용하는 경우 : = 은 오른쪽에 표기함
		// 산술대입연산자 : +=, -=, *=, /=, %=
		// 쉬프트대입연산자 : <<=, >>=, >>>=
		// 비트논리대입연산자 : &=, ^=, |=
		int k = 10;
		System.out.println("k : " + k);
		
		k += 2; // k = k + 2; 보다 연산속도가 빠름
		System.out.println("k : " + k); // 12
		
		k -= 3; // k = k - 3; 보다 연산속도가 빠름
		System.out.println("k : " + k); // 9
		
		k *= 4; // k = k * 4; 보다 연산속도가 빠름
		System.out.println("k : " + k); // 36
		
		k /= 4; // k = k / 4; 보다 연산속도가 빠름
		System.out.println("k : " + k); // 9
		
		k %= 4; // k = k % 4; 보다 연산속도가 빠름
		System.out.println("k : " + k); // 1
		
		k <<= 2; // k = k << 4; 보다 연산속도가 빠름 2²을 곱해라
		System.out.println("k : " + k); // 4
		
		k >>= 2; // k = k << 4; 보다 연산속도가 빠름 2²을 나눠라
		System.out.println("k : " + k); // 1		
		
	}
	
}
