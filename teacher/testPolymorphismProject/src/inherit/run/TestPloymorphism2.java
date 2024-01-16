package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPloymorphism2 {

	public static void main(String[] args) {
		// 다형성 테스트 2 : 객체배열에 적용
		//Person[] par = new Person[6];
		Object[] par = new Object[6];
		
		par[0] = new Customer("김철수", 28, '남', "kimcs33@test.org", "010-3333-3333", 
				"서울시 서초구 신논현동 77", 1350.77);
		par[1] = new Customer("홍길순", 25, '여', "hongks77@test.org", "010-7777-8888", 
				"서울시 강남구 논현동 123", 25450.50);
		par[2] = new Customer("이순신", 48, '남', "leess49@test.org", "010-4949-9494", 
				"서울시 성동구 성내동 33", 35478.23);
		par[3] = new Student("김철수", 28, '남', "kimcs33@test.org", "010-3333-3333", 
				12, "영어영문학", 3.8);
		par[4] = new Student("홍길순", 25, '여', "hongks77@test.org", "010-7777-8888", 
				25, "기계공학과", 4.2);
		par[5] = new Student("이순신", 48, '남', "leess49@test.org", "010-4949-9494", 
				30, "실용음악학과", 4.3);
		
		//for(Person p : par) {
		for(Object p : par) {
			System.out.println(p);
		}

	}

}
