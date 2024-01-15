package Inheritance.sample;

public class Point {
	// Field
	private double x;
	private double y;
	
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
	
}
