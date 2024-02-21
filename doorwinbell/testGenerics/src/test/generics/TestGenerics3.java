package test.generics;

import java.util.ArrayList;

public class TestGenerics3 {

	public static void main(String[] args) {
		// List 계열에서 Generics 사옹 활용 : 한 가지 타입으로 사용에 제한을 설정함
		ArrayList<Book> bookList = new ArrayList<Book>();
		listInit(bookList);
		display(bookList);
	}
	
	// 리스트 저장 객체 초기화 처리
	public static void listInit(ArrayList<Book> list) {
		list.add(new Book("java 정복", "김철수"));
		list.add(new Book("oracle 완성", "이영희"));
		list.add(new Book("jdbc 코딩", "박문수"));
	}
	
	// 리스트 저장 객체 정보 출력 처리
	public static void display(ArrayList<Book> list) {
		for(Book book : list) { // 클래스 타입 확인 안 함, 형변환 필요없음 => 제네릭스 사용 목적임
			System.out.println(book);
		}
	}
	
}
