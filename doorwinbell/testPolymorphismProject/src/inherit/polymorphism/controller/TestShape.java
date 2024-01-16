package inherit.polymorphism.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Shape;

public class TestShape {

	public static void main(String[] args) {
//		Shape s =null;
//		s = new Circle(15.5);
//		
//		System.out.println("원면적 : " + s.area());
//		System.out.println("원둘레 : " + s.perimeter());
//
//		s = new Rectangle(34.5, 43.7);
//		System.out.println("사각형면적 : " + s.area());
//		System.out.println("사각형둘레 : " + s.perimeter());
		
		IShape iS =null;
		iS = new Circle(15.5);
		
		System.out.println("원면적 : " + iS.area());
		System.out.println("원둘레 : " + iS.perimeter());

		iS = new Rectangle(34.5, 43.7);
		System.out.println("사각형면적 : " + iS.area());
		System.out.println("사각형둘레 : " + iS.perimeter());
	}

}
