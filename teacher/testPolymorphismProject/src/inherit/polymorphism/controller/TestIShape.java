package inherit.polymorphism.controller;

import inherit.polymorphism.model.*;

public class TestIShape {

	public static void main(String[] args) {
		// 상속 다형성 실습문제 2
		IShape s;	  //부모 인터페이스로도 레퍼런스 선언 가능, 후손 주소 받을 수 있음

		s = new Circle(15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : " + s.area());
		System.out.println("사각형둘레 : " + s.perimeter());

	}

}
