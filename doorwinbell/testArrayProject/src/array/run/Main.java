package array.run;

import array.sample.ArraySample;
import array.sample.ArraySample2;

public class Main {

	public static void main(String[] args) {
		// 기본자료형 배열 실행 테스트용
		ArraySample asamp = new ArraySample();
//		asamp.testDefaultValue();
//		asamp.testStaticField();
		asamp.arrayCopy();
		
		// 가비지컬렉터 직접 구동 가능함
//		System.gc();
		
//		System.out.println(asamp);
//		asamp.testArray1();
//		asamp.testArray2();
//		asamp.testArray3();
//		asamp.arrayInitialization();

//		int[] array = null; // 주소가 없는 빈 레퍼런스임, null(주소없다) 상태임
		// if (array == null) 조건처리 가능함
//		int num; // 값이 저장될 기본자료형 변수임
//		if(num == null) {}; // null은 기본자료형 변수에 적용할 수 없음

//		ArraySample2 asamp2 = new ArraySample2();
//		asamp2.arrayInit(array);
//		asamp2.printArray(array);

	}

}
