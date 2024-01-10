package test.run;

import oop.encapsulation.Student;
import test.access.PublicClass;
//import test.access.DefaultClass; // 에러

public class TestAccess {

	public static void main(String[] args) {
		// public class 와 default class 테스트
		PublicClass test = new PublicClass();
//		DefaultClass test2 = new DefaultClass(); 
		// default class는 패키지 밖에서 사용 불가능임
		
		Student std = new Student();
//		std.name = "춘향이"; // private, default, protected 이면 패키지 밖에서 접근 불가능
//		public이면 접근 가능 : 캡슐화에 위배됨

	}

}
