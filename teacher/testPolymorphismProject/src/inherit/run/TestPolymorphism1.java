package inherit.run;

import java.util.GregorianCalendar;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		// 다형성(polymorphism) 테스트
		// 다형성 : 상속을 통해 사용할 수 있는 기술임
		// 상속관계에 있는 부모클래스는 후손클래스 객체의 주소를 받을 수 있음
		
		Person p = null;
		//부모타입의 레퍼런스에 후손 객체의 주소 대입 가능함
		p = new Customer("김철수", 28, '남', "kimcs33@test.org", "010-3333-3333", 
				"서울시 서초구 신논현동 77", 1350.77);
		System.out.println(p);  //p.toString() 과 같음
		
		Customer c = new Customer("김철수", 28, '남', "kimcs33@test.org", "010-3333-3333", 
				"서울시 서초구 신논현동 77", 1350.77);
		p = c;
		System.out.println(p);  //p.toString() 과 같음
		
		p = new Student("김철수", 28, '남', "kimcs33@test.org", "010-3333-3333", 
				12, "영어영문학", 3.8);
		System.out.println(p);  //p.toString() 과 같음
		
		Object obj = new Person("홍길동", 30, '남', "hong77@test.org", "010-1234-5678");
		System.out.println(obj); //obj.toString()
		
		obj = new Customer("김철수", 28, '남', "kimcs33@test.org", "010-3333-3333", 
				"서울시 서초구 신논현동 77", 1350.77);
		System.out.println(obj); //obj.toString()
		
		obj = new String("다형성 확인");
		System.out.println(obj); //obj.toString()
		
		obj = new GregorianCalendar();
		System.out.println(obj); //obj.toString()
		
		//다형성은 부모가 여러 후손들을 다루는 기술임
		//상속관계가 아닌 클래스간에는 사용할 수 없음
		//Customer c = new Student();  //error
	}

}





