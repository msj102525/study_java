package inherit.run;

import inherit.model.dto.Person;

public class TestPerson {
	public static void main(String[] args) {
		// overriding method test
		Person p1 = new Person();
		Person p2 = new Person("문", 30,'남',"ㄹㄴㅇㄹ@test.org", "010-12-12");
		
		// toString() 사용테스트
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		// print시에 .toString()은 생략해도 됨
		System.out.println(p1);
		System.out.println(p2);
		
		// equals() 사용
		Person p3 = p2;
		System.out.println("주소 비교 : " + (p2 == p3)); // true
		
		Person p4 = (Person)p2.clone(); // 실행시 동적 바인딩(dynamic binding) 됨
		System.out.println("주소비교 : "+ (p2 == p4)); // false
		System.out.println("두 객체의 필드값들이 모두 일치하는지 확인 : " + p2.equals(p4));// false
	}
}
