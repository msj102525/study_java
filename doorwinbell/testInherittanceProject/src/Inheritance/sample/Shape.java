package Inheritance.sample;

public class Shape extends Point {
	// Field
	private double area;
	private double perimeter;
	public Shape() {
		super();
		System.out.println("Shape 기본생성자 this :" + this.hashCode());
	}
	
	public Shape(double area, double perimeter) {
		super();
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
