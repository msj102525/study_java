package test.method;

import java.util.Scanner;

public class NonStaticSample {
	// 1. 반환값 없고 매개변수 없는 메소드
	// 실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	// 메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		int[] numArr = new int[6];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) { // 중복검사
				if (numArr[i] == numArr[j]) {
					i--;
					break;
				}
			}
			System.out.println(i + 1 + "번째 숫자 : " + numArr[i]);
		}
	}

	// 2. 반환값 없고 매개변수 있는 메소드
	// 실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	// 메소드명 : outputChar

	public void outputChar(int i, char ch) {

		for (int j = 0; j < i; j++) {
			System.out.println(ch);
		}
	}

	// 3. 반환값 있고 매개변수 없는 메소드
	// 실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	// 메소드명 : alphabette

	public char alphabette() {
		int code = 0;
		do {
			code = (int)(Math.random() * ('z'- 'A' + 1)) + 65;
			if((code >= 'A' && code <= 'Z' || code >= 'a' && code <= 'z')) {
				break;
			}while(true)
		}
//		char ch = (char) (Math.random() * ((122 - 65) + 1) + 65);
		return (char)code;
	}

	// 4. 반환값 있고 매개변수 있는 메소드
	// 실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	// 추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	// 메소드명 : mySubstring
	public String mySubString(String str, int sI, int fI) {
		String result = str.substring(sI, fI);
		if(result.length() < 1) {
			return null;
		}else {
			return result;			
		}
	}
}
