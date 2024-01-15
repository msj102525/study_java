package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {

//		Circle circle = new Circle(2, 3, 10);
//
//		System.out.println("원면적 : " + (circle.getRadius() * circle.getRadius()));
//		System.out.println("원의 넓이 : " + Math.floor((Math.PI * circle.getRadius() * circle.getRadius() * 10) / 10));
//		System.out.println("원둘래 : " + Math.floor((Math.PI * circle.getRadius() * 2) * 10) / 10);
		
		Rectangle rec = new Rectangle(12, 53);
		System.out.println("면적 : " + (rec.getWidth() * rec.getHeight()));
		System.out.println("둘레 : " + 2 * (rec.getWidth() + rec.getHeight()));
		
		Point[] pointArr = new Point[5];
		
		// 부모타입의 레퍼런스에 후손 객체의 주소 저장할 수 있음 : 상속 관계일 때만 가능함
		pointArr[0] = new Circle(100, 100, 10);
		pointArr[1] = new Circle(101, 100, 10);
		pointArr[2] = new Circle(102, 200, 20);
		pointArr[3] = new Circle(103, 300, 30);
		pointArr[4] = new Circle(104, 400, 40);
		
		for(int i = 0; i< pointArr.length; i++) {
			pointArr[i].draw(); // 컴파일시 부모의 draw()가 연결됨 : 정적 바인딩
			// 실행시 참조하는 객체 타입에 따라 draw()의 연결이 바뀜 : 동적 바인딩(dynamic binding)
			// 참조하는 객체 인스턴스 클래스의 오버라이딩된 draw() 메소드로 연결이 바뀌면서 실행함
			
		}
	}

}
