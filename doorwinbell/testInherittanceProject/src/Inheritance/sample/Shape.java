package Inheritance.sample;

public class Shape extends Point {
	// Field
	private double area;
	private double perimeter;
	
	// Constructor
	// 상속에 사용되는 클래스는 반드시 기본생성자르 직접 작성해야 함.
	public Shape() {
		super();
		System.out.println("Shape 기본생성자 this :" + this.hashCode());
	}
	
	public Shape(double area, double perimeter) {
		super(); // 부모의 기본 생성자 생성
		System.out.println("Point 매게변수 있는 생성자 this :" + this.hashCode());
		this.area = area;
		this.perimeter = perimeter;
	}
	
	// getters setters
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	
}
