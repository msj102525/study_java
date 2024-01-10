package oop.encapsulation;

public class TestConstructor {

	public static void main(String[] args) {
		// 생성자 사용 테스트
		// 생성자 사용 : 클래스타입 래퍼런스 = new 생성자();
		Student s1 = new Student(); // 기본생성자 사용함
		System.out.println("s1이 가진 주소 : " + s1.hashCode());
		
		Student s2 = new Student(12, "춘향이", 27, "010-1234-5678"); // 매개변수 4개 있는 생성자 사용
		System.out.println("s2이 가진 주소 : " + s2.hashCode());
		
		// 모든 필드값 전달받아 초기화하는 생성자 사용
		Student s3 = new Student(15, "지니황", 25, "010-1234-5678", '여', "컴공", "jnh@test.org", "자양동", 100.0);
		System.out.println("s3이 가진 주소 : " + s3.hashCode());
		
		s1.printInformation();
		s2.printInformation();
		s3.printInformation();
		
		// setter 사용 필드값 변경
		s2.setMajor("건축");
		s2.setEmail("msj123@test.org");
		s2.setGender('남');
		s2.setAdress("서울시 강서구 당산동");
		s2.setScore(95.2);
		
		System.out.println("\t변경 후=============================");		
		s2.printInformation();
		
		// s1이 참조하는 객체의 인스턴스 변수 값 모두 수정 처리
		s1.setSno(11);
		s1.setName("문등동");
		s1.setAge(27);
		s1.setPhone("010-1231-1234");
		s1.setGender('남');
		s1.setMajor("수의학");
		s1.setEmail("msj@123.com");
		s1.setAdress("자양동");
		s1.setScore(100.1);
		
		System.out.println("\t변경 후=============================");		
		s1.printInformation();
	}

}
