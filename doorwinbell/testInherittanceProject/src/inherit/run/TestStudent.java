package inherit.run;

import inherit.model.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// 오버라이딩 메소드, super() 테스트
		Student s1 = new Student();
		Student s2 = new Student(123, "컴공", 4.5);
		Student s3 = new Student("문문", 23, '남', "sdf@test.org", "010-14-14", 24, "정보보안", 3.3);

		// toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// clone()
		Student s4 = (Student)s3.clone();
		System.out.println(s4);
		System.out.println("주소 확인 : " + s3.hashCode() + ", " + s4.hashCode());
		System.out.println(s3 == s4); // false
		
		// equals()
		System.out.println(s3.equals(s4));
		
		
	}

}
