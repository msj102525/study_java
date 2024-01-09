package array.sample;

import java.util.Random;

public class ArraySample {
	//기본자료형 확인용 기능 제공
	
	public void testArray1() {
		//1. 배열 선언 : 배열공간의 주소 저장용 레퍼런스변수 만들기
		//자료형[] 배열명;  => 배열명 == 배열 레퍼런스
		int[] ar;
		
		//2. 배열 할당 : 자바에서는 배열공간을 힙(heap)에 할당하고,
		//		발생한 주소(위치정보)를 준비된 배열레퍼런스에 저장 처리함
		//배열명 = new 자료형[방갯수];  => 첨자(방갯수) : 정수값 | 정수변수 사용 가능함
		ar = new int[5];
		
		//3. 배열공간 사용 : 값 기록 또는 값 읽어오기
		//배열명[순번] => 순번(index) : 각 방에 부여된 순서에 대한 번호(0부터 시작함)
		ar[0] = 25;
		ar[1] = 33;
		ar[2] = 45;
		ar[3] = 55;
		ar[4] = 67;
		//ar[5] = 78;   //error : ArrayIndexOutOfBoundsException (인덱스 범위 초과시 발생)
		
		System.out.println("할당된 방갯수 : " + ar.length);
		
		//배열 데이터 처리에는 주로 for 문을 사용함
		for(int index = 0; index < ar.length; index++) {
			System.out.println("ar[" + index + "] : " + ar[index]);
		}  //for
		
	} //method
	
	public void testArray2() {
		//배열 선언과 배열 할당을 한번에 선언할 수도 있음
		//자료형[] 배열명 = new 자료형[첨자];
		//자료형 []배열명 = new 자료형[첨자];
		//자료형 배열명[] = new 자료형[첨자];
		double[] dar = new double[10];
		
		System.out.println("할당된 방갯수 : " + dar.length);  //10
		
		//배열 데이터 처리에는 for 문을 주로 사용함
		for(int i = 0; i < dar.length; i++) {
			dar[i] = Math.random();
		}
		
		//출력 확인
		for(int i = 0; i < dar.length; i++) {
			System.out.print(dar[i] + "    ");
		}
		System.out.println();
	}
	
	public void testArray3() {
		//1부터 100까지 정수를 10개 난수로 발생시켜 기록 저장한 다음, 합계를 구해서 출력
		int[] ar = new int[10];
		Random r = new Random();
		int sum = 0;
		
		//값 기록
		for(int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(100) + 1;
			sum += ar[i];
		}
		
		//값 출력
		for(int i = 0; i < ar.length; i++) {
			if(i == ar.length - 1)
				System.out.print(ar[i] + " = ");
			else
				System.out.print(ar[i] + " + ");
		}
		System.out.println(sum);
	}	//method
	
	public void arrayInitialization() {
		//배열 초기화 : 배열 선언과 동시에 초기값 기록 처리하는 것
		//자료형[] 배열명 = {초기값, 초기값, 초기값, ....., 초기값};
		//int[] ar = {12, 23, 34, 45, 56};  => 초기화가 한 개의 구문이어야 함
		//int[] ar;  //레퍼런스 선언과 초기화를 분리할 수 없음
		//ar = {12, 23, 34, 45, 56};  //에러남
		
		//자료형[] 배열명 = new 자료형[]{초기값, 초기값, 초기값, ...., 초기값};
		//초기값의 갯수가 할당될 방갯수가 되므로, 자료형[] 안에 첨자 사용하면 안 됨
		int[] ar;  //레퍼런스 선언과 초기화를 분리할 수 있음
		ar = new int[]{12, 23, 34, 45, 56};
		
		System.out.println("ar.length : " + ar.length);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}  //for
		System.out.println();
	}
	
	
	
	
	
	
} //class











