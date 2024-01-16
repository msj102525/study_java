package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism2 {

	public static void main(String[] args) {
		// 다형성 테스트 2 : 객체배열에 적용
//		Person[] par = new Person[6];
		Object[] par = new Object[6];

		par[0] = new Customer("문", 281, '남', "msj1@test.org", "0101-123-123", "자양동1", 123.1231);
		par[1] = new Customer("문1", 282, '남', "msj2@test.org", "0102-123-123", "자양동2", 123.1232);
		par[2] = new Customer("문2", 283, '남', "msj3@test.org", "0103-123-123", "자양동3", 123.1233);

		par[3] = new Student("문", 11, '남', "msj1@test.org", "0101-123-123", 11, "자양동1", 12.3);
		par[4] = new Student("문", 12, '남', "msj2@test.org", "0102-123-123", 12, "자양동2", 12.3);
		par[5] = new Student("문", 13, '남', "msj3@test.org", "0103-123-123", 13, "자양동3", 12.3);

//		for(Person p : par) {
		for(Object p : par) {
			System.out.println(p);
		}
	}

}
