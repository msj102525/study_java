package inherit.polymorphism.controller;

import inherit.polymorphism.model.*;

public class TestShape {

	public static void main(String[] args) {
		// 상속 다형성 실습문제 1
		Shape s;

		s = new Circle(15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : " + s.area());
		System.out.println("사각형둘레 : " + s.perimeter());
	}

}
