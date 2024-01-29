package test.list;

import java.util.ArrayList;

public class TestBookList {

	public static void main(String[] args) {
		// Book 객체를 리스틍 저장 처리
		// 객체 배열이라면,
//		Book[] books = new Book[저장갯수지정];
		ArrayList bookList = new ArrayList();
		
		bookList.add(new Book("해리포터", 25000));
		bookList.add(new Book("자바의 정석", 23000));
		bookList.add(new Book("sql의 이해", 28000));
		bookList.add(new Book("오라클의 정석", 33000));
		bookList.add(new Book("개발자 자기개발", 22000));
		
		System.out.println("11" + bookList);
		
		// for 문
		for(int i = 0; i<bookList.size();i++){
			System.out.println(i + " : " + bookList.get(i));
		}
		
		// for each문
		for(Object ref : bookList) {
			System.out.println(ref);
		}

		// sort()로 정렬 처리 : 저장됨 객체의 피드값 중에서 정렬 기준으로 사용할 필드 지정이 필요함
		// sort(Comparator 레퍼런스) : 정렬기준이 지정된 Comparator 후손 클래스 사용함
		// 즉, Compareator를 상속받은 후손클래스를 먼저 만들어야 함 => compare를 오버라이딩함 : 정렬기준 정함
		
		System.out.println("도서제목 기준 오름차순 정렬 ----------");
		bookList.sort(new BookTitleAscending());
		System.out.println(bookList);
		
		System.out.println("도서가격 기준 오름차순 정렬 ----------");
		bookList.sort(new BookPriceDescending());
		System.out.println(bookList);
	}

}
