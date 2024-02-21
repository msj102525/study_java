package test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics2 {

	public static void main(String[] args) {
		// 제네릭스(Generics) 기능 : 
		// 사용시 클래스 타입을 정하면서 이용하는 기능임
		// 클래스명<영문자> 또는 인터페이스명<영문자> 표시된 클래스들이 제네릭스 기능을 사용할 수 있다는 표시임
		// 클래스 사용시 한가지 타입의 클래스 객체만 취급하겠다는 용도로 사용함
		List<String> list = listAllocation(); // String 객체만 저장하는 리스트로 선언함
		// String이 아닌 객체는 저장할 수 없음
		
		listInitialization(list);
		printList(list);
	}

	private static void printList(List<String> list) {
		// 제네릭스가 적용된 컬렉션에서 객체를 하나씩 추출할 때,
		// Object 타입이 아니라 표기된 제네릭스 타입으로 추출됨 => 타입확인 필요없음, 다운캐스팅 필요없음
		for(String str : list) {
			System.out.println(str);
		}
		
	}

	// 제네릭스가 사용된 전달인자를 받는 매개변수도 동일한 타입의 제네릭스를 표기해야 함
	private static void listInitialization(List<String> list) {
		list.add("apple");
		list.add(new String("orange"));
//		list.add(new java.util.Date()); // 선언된 제네릭스 타입이 아닌 클래스 객체는 취급할 수 없음
		list.add("grape");
		
	}

	// 제네릭스가 설정된 레퍼런스를 리턴할 경우 :
	// 해당 메소드의 반환자료형에도 같은 타입의 제네렉스가 사용되어야 함
	private static ArrayList<String> listAllocation(){
		return new ArrayList<String>();
	}
	
}
