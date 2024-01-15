package Inheritance.sample;

import java.util.Objects;

public class Point {
	// Field : 캡슐화
	private double x;
	private double y;
	
	// 상속받은 후손 안에서만 접근 가능으로 변경
//	protected double x;
//	protected double y;
	
	// Constructor
	public Point() {
		System.out.println("기본생성자 this : " + this.hashCode());
	}

	public Point(double x, double y) {
		super(); // 부모의 기본생성자 호출 구문임,
		// 모든 생성자 안의 첫줄에 존재해야 함, 표기 생략 가능함
		this.x = x;
		this.y = y;
	}

	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String information() {
		return "x: " + this.x + ",y :" + this.y;
	}
	
	// annotation : 컴파일용 주석(comment)
	@Override
	public String toString() {
		// 객체 인스턴스가 가진 필드값 출력 확인 용도로 주로 오버라이딩 함
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 원래는 주소가 같은지 비교하는 용도임
		// 오버라이딩 하면서, 두 객체가 가진 값이 같은지 확인하는 용도로 재작성함
		if (this == obj) // 주소가 같은지
			return true;
		
		if (obj == null) // 전달받은 레퍼런스 obj가 널인지(null == 주소없다)
			return false;
		
		if (getClass() != obj.getClass()) // 레퍼런스가 참조하는 인스턴스의 클래스 타입이 같은지
			return false;
		
		Point other = (Point) obj; // 클래스 형변환 처리, Point == Object 타입을 일치시켜야 
//		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
//				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
		return (this.x == other.x) && (this.y == other.y);
	}

	

	
	
}
