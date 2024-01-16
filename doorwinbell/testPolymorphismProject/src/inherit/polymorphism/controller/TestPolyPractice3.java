package inherit.polymorphism.controller;

import inherit.polymorphism.model.*;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		// 상속 다형성 실습문제 3
		IShape[] iarr = new IShape[5];

		//5개의 객체를 무작위로 생성함(Circle, Rectangle, Triangle)
		iarr[0] = new Circle(3.5);
		iarr[1] = new Circle(5.3);
		iarr[2] = new Rectangle(2.0, 2.0);
		iarr[3] = new Rectangle(7.0, 7.0);
		iarr[4] = new Triangle(4.0, 5.0);
		
		//for loop 문으로 각 객체의 면적과 둘레를 출력 처리함
		//단, Triangle 객체는 빗변길이도 출력 처리함
		for(int i = 0; i < iarr.length; i++){
			if(iarr[i] instanceof Circle){
				System.out.println("원둘레 : " + iarr[i].perimeter());
				System.out.println("원면적 : " + iarr[i].area());
			}else if(iarr[i] instanceof Rectangle){
				System.out.println("사각형둘레 : " + iarr[i].perimeter());
				System.out.println("사각형면적 : " + iarr[i].area());
			}else if(iarr[i] instanceof Triangle){
				System.out.println("삼각형빗변길이 : " + ((Triangle)iarr[i]).getHypotenuse());
				System.out.println("삼각형둘레 : " + iarr[i].perimeter());
				System.out.println("삼각형면적 : " + iarr[i].area());
			}
		}

	}

}
