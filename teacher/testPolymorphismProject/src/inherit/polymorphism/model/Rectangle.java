package inherit.polymorphism.model;

public class Rectangle /* extends Shape */  implements IShape {
	private double width;
	private double height;
	
	public Rectangle(){}	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// 사각형 면적 계산 리턴
		return width * height;
	}

	@Override
	public double perimeter() {
		// 사각형 둘레 계산 리턴
		return (width + height) * 2;
	}

}
