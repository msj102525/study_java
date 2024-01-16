package inherit.polymorphism.model;

public  class Circle implements IShape{
	double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	 @Override
	    public double area() {
		 	return this.radius * this.radius * Math.PI;
	    }

	    @Override
	    public double perimeter() {
	    	return this.radius * 2 * Math.PI;	        
	    }
	
	
	
}
