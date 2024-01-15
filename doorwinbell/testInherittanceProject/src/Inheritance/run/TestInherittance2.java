package Inheritance.run;

import Inheritance.sample.Shape;

public class TestInherittance2 {

	public static void main(String[] args) {
		// 후손 객페 생성시, 부모 생성자 작동 테스트
		Shape sp1 = new Shape(); // 기본생성자
		// 부모의 x, y = 0.0, Shape 의 area, perimeter = 0.0초기화
		Shape sp2 = new Shape(12.5, 8.89, 123.45, 465.77);
		// 부모의 x = 12.5, y = 8.89, Shape의 area = 123.45, perimeter = 465. 77

		System.out.println(sp1.information()); // 오버라이딩된 Shape의 information() 이 실행됨
		System.out.println(sp2.information()); // 오버라이딩된 Shape의 information() 이 실행됨

		System.out.println(sp1.toString()); // 오버라이딩된 toString() 실행
		System.out.println(sp2.toString()); // 오버라이딩된 toString() 실행

		System.out.println(sp1); // 오버라이딩된 toString() 실행
		System.out.println(sp2); // 오버라이딩된 toString() 실행

		Shape sp3 = new Shape(sp2);
		System.out.println(sp3.hashCode());
		System.out.println(sp2.hashCode());

		System.out.println(sp3); // print 시에 레퍼런스 뒤에 .toString() 표기 생략해도 됨
		System.out.println(sp2); // print 시에 레퍼런스 뒤에 .toString() 표기 생략해도 됨

		// equals() 오버라이딩 되어 있음 : 각 필드값이 같은지 조회용 변경해음
		System.out.println(sp3.equals(sp2)); // true
		System.out.println(sp3 == sp2); // false;

		Shape sp4 = new Shape(10, 10, 10, 200);
		System.out.println(sp4);
		
		Shape sp5 = (Shape)sp4.clone(); // 반환형이 Object 임 => Shape에 대입 안 됨 (타입이 다른)
		System.out.println(sp5);
		
		System.out.println(sp4 == sp5);

	}
}
