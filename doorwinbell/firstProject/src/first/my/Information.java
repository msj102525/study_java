package first.my;

// main 메소드가 없는 클래스 => 기능 제공용 클래스임
// 실행 할 수 없는 클래스임

public class Information {
	// Field : 멤버변수 => 객체지향의 제 1 목적은 캡슐화 (EnCapsulation)
	// 접근제한자 자료형 변수명;
	private  String name;
	private int age;
	private String phone;
	
	// Constructor : 생성자
	// public 클래스명(){}
	// public 클래스명(자료형 변수명){}
	 public Information() {}
	 
	 public Information(String name, int age, String phone) {
		 this.name = name;
		 this.age = age;
		 this.phone = phone;
	 }
	
	// Destructor : 소멸자 => 자바에는 없음 C++에서 씀
	// 자바가상기계(jvm : Java Virtual Machine)가 자동으로 메모리 관리를 해줌
	// 할당된 객체 공간(클래스에 의해 만들어진 공간 : instance)중에서 사용이 끝난 것들을
	// 가비지 컬렉터(Garbage Collector : 쓰래기 수집기)가 찾아내서 소멸 처리함
	
	// Method : 멤버함수
	// 접근제한자 반환자료형 메소드명(){}
	 
	public void print() {
		System.out.println(this.name + ", " + this.age + "세, " + this.phone);
	}
}
