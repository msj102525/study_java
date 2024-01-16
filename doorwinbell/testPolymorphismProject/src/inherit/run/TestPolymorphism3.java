package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism3 {
	
	// 다형성은 주로 메소드 중복의 갯수를 줄이기 위해 사용함
	public static void print(Object[] arr) {
		for(Object p : arr) {
			System.out.println(p);
		}
	}
	
	public static Object[] initArray(int su) {
		Object[] par = new Object[su];

		par[0] = new Customer("문", 281, '남', "msj1@test.org", "0101-123-123", "자양동1", 123.1231);
		par[1] = new Customer("문1", 282, '남', "msj2@test.org", "0102-123-123", "자양동2", 123.1232);
		par[2] = new Customer("문2", 283, '남', "msj3@test.org", "0103-123-123", "자양동3", 123.1233);

		par[3] = new Student("문", 11, '남', "msj1@test.org", "0101-123-123", 11, "자양동1", 12.3);
		par[4] = new Student("문", 12, '남', "msj2@test.org", "0102-123-123", 12, "자양동2", 12.3);
		par[5] = new Student("문", 13, '남', "msj3@test.org", "0103-123-123", 13, "자양동3", 12.3);
		
		return par;
	}
			

	public static void main(String[] args) {
		// 다형성 테스트 3 : 메소드 매개변수, 리턴타입에 적용
		Object[] arr = initArray(6);
		print(arr);
	}

}
