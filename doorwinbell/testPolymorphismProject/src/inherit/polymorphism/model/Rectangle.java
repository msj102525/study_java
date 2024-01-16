package inherit.polymorphism.model;

public class Rectangle implements IShape{
	//
	double width, height;
	
	public Rectangle() {
		super();
	}

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
		 	return this.width * this.height;
	    }

	    @Override
	    public double perimeter() {
	    	return 2 * this.width * this.height;
	    }
	
	
	
}
