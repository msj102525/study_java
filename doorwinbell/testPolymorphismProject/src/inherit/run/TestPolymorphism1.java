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
		// 부모타입의 레퍼런스에 후손 객체의 주소 대입 가능함
		p = new Customer("문", 28, '남', "msj@test.org", "010-123-123", "자양동", 123.123);
		System.out.println(p); // p.toString();

		Customer c = new Customer("문", 28, '남', "msj@test.org", "010-123-123", "자양동", 123.123);
		p = c;
		System.out.println(p); // p.toString();

		System.out.println();
		p = new Student("문", 11, '남', "msj1@test.org", "0101-123-123", 11, "자양동1", 12.3);

		System.out.println(p); // p.toString();

		Object obj = new Person("문", 30, '남', "ㄹㄴㅇㄹ@test.org", "010-12-12");
		System.out.println(obj); // obj.toString()

		obj = new Customer("문", 28, '남', "msj@test.org", "010-123-123", "자양동", 123.123);
		System.out.println(obj); // obj.toString()

		obj = new String("다형성 확인");
		System.out.println(obj); // obj.toString()
		
		obj = new GregorianCalendar();
		System.out.println(obj); // obj.toString()
		
		// 다형성은 부모가 여러 후손들을 다루는 기술임
		// 상속관계가 아닌 클래스간에는 사용할 수 없음
//		Customer c = new Student(); // error
		
	}

}
