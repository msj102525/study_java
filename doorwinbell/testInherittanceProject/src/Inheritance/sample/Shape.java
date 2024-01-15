package Inheritance.sample;

// 자바는 클래스끼리 상속에는 단일상속만 허용함 : 부모클래스 1개
// 클래스끼리의 다중상속은 허용 안함 : 부모클래스가 여러개 => 에러 발생
public class Shape extends Point /* , java.util.Timer */ {
	// Field
	private double area;
	private double perimeter;
	
	// Constructor
	// 상속에 사용되는 클래스는 반드시 기본생성자를 직접 작성해야 함.
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
	public Shape(double x, double y, double area, double perimeter) {
		super(x, y); // 부모의 매개변수 있는 생성자 실행
		System.out.println("Point 매게변수 있는 생성자 this :" + this.hashCode());
//		this.x = x; // protected 이면 가능함
//		this.y = y; // protected 이면 가능함
		this.area = area;
		this.perimeter = perimeter;
	}
	
	// 복사생성자 : 새 객체 할당하면서, 기존의 다른 객체의 값들을 초기값으로 복사해서 초기화 함
	public Shape(Shape other) {
		// 깊은 복사 (deep copy)
		super(other.getX(), other.getY());
		this.area = other.area;
		this.perimeter = other.perimeter;
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
	
	// 오버라이딩(Overriding) : 재작성
	// 후손이 부모 메소드를 똑같이 다시 만들기함
	@Override
	public String information() {
		// 메소드 오버라이딩시에 메소그 안에서 오버라이딩하는 부모 메소드를 실행시킬 수 있음
		// 이때는 반드시 super.메소드명()으로 표기해야 함
		// super. 이 누락되면 this. 이 되므로, 재귀호출이 되어서 무한루프 됨
		return super.information() + ", area : " + this.area + ", perimeter : " + this.perimeter; 
	}

	@Override
	public String toString() {
		return super.toString() + ", Shape [area=" + area + ", perimeter=" + perimeter + "]";
	}
	
	// 오버라이딩시에는 부모메소드의 시그니처를 그대로 똑같이 다시 작성해야 함
	// 단, 접근제한자는 부모것보다 넓은 범위의 접근제한자로 변경할수 있음
//	protected Object clone() throws CloneNotSupportedException{
	// 단, 부모메소드의 예외클래스 갯수를 줄일 수 있음 => 0개로 줄여도 됨
	
	@Override	
	public Object clone() {
		// 똑같은 필드값을 가진 객체를 하나 복제해서 만드는 
		return new Shape(this); // 복사생성자 이용함
	}
	
	
	
	
}
