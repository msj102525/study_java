package test.generics;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestGenerics1 {

	public static void main(String[] args) {
		// 컬랙션 클래스들은 여러 종류의 클래스 객체들을 저장할 수 있다.
		List list = new ArrayList();
		
		list.add(new String("java"));
		list.add(new Book("자바 완성", "홍길동"));
		list.add(new Date());
		
		System.out.println(list); // 저장 순서대로 저장된 것 확인
		
		// 저장 후에 하나씩 꺼내서 사용하려고 할 때, 기본적으로 Object 타입으로 추출됨
		for(Object obj : list) {
			// Object 타입의 래퍼런스로는 Object 클래스가 가진 메소드나 필드만 처리할 수 있음
			// toString(), equals(), clone(), hashCode() 메소드만 사용할 수 있는 상태임
			// 후손클래스들이 오버라이딩한 경우에는 후손쪽의 오버라이딩된 부모메소드가 자동 연결되면서 실행되게 됨
//			System.out.println(obj/* .toString() */);
			
			// 만약, 각 후손클래스가(저장된 객체들) 가진 메소드를 실행시켜야 할 경우에는
//			obj.toUpperCase(); // 에러 발생함
			// 부모타입의 레퍼런스로는 후손이 가진 멤버를 사용할 수 없음 
			// => 레퍼런스 타입을 Object 에서 각각의 후손클래스 타입으로 형변환 필요함
			// 타입이 다른 객체를 다른 클래스형으로 형변환하면 에러 발생함
			// => 레퍼런스가 참조하는 객체의 클래스타입을 확인하고 형변환해야 함 (DownCasting)
			// 레퍼런스가 참조하는 객체의 클래스타입을 확인할 때 instanceof 연산자 사용함
			// => 레퍼런스 instanceof 클래스타입
			if(obj instanceof String) {
				String s = (String)obj;
				System.out.println(s + " => " + s.toUpperCase());
				System.out.println(((String)obj).toUpperCase());
			}
			if(obj instanceof Book) {
				System.out.println(((Book)obj).getTitle());
			}
			if(obj instanceof Date) {
				System.out.println(new SimpleDateFormat("yyyy'년' MM'월' dd'일' E").format((Date)obj));
			}
		}
	}

}

class Book {
	private String title;
	private String author;
	
	public Book() {
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + "]";
	}
	
}






