package oop.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;

public class TestPolyPractice {

	public static void main(String[] args) {
		IShape[] iArr = new IShape[5];

		iArr[0] = new Circle(15.5);
		iArr[1] = new Circle(15.5);
		iArr[2] = new Rectangle(34.5, 43.7);
		iArr[3] = new Rectangle(34.5, 43.7);
		iArr[4] = new Triangle(34.5, 43.7);
		
		// for loop문의로 각 객체의 면적과 둘레를 출력 처리함
		// 단, Triangle 객체는 빗변길이도 출력 처리함
		
		for(int i =0;i< iArr.length; i++) {
			if(iArr[i] instanceof Circle) {
				System.out.println("원면적 : " + iArr[i].area());
				System.out.println("원둘레 : " + iArr[i].perimeter());
			}else if(iArr[i] instanceof Rectangle) {
				System.out.println("사각형면적 : " + iArr[i].area());
				System.out.println("사각형둘레 : " + iArr[i].perimeter());
			}else if(iArr[i] instanceof Triangle) {
				System.out.println("삼각형 빗변길이 : " + ((Triangle)iArr[i]).getHypotenuse());
				System.out.println("삼각형 면적 : " + iArr[i].area());
				System.out.println("삼각형 둘레 : " + iArr[i].perimeter());
			}
		}

	}

}
