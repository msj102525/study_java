package var.practice;

public class TestExample1 {
	
	public static void main(String[] args) {
		TestExample1 test = new TestExample1();
		test.example();
		System.out.println("----------------------------------------------");
		test.example2();	
		
}
	public  void example() {
		String name;
		int age;
		float height;
		double weight;
		char sex;
		
		String phone;
		String email;
		
		name = "문승종";
		age = 26;
		height = 183.f;
		weight = 73.1;
		sex = 'M';
		phone = "010-1234-5678";
		email = "msj102525@gmail.com";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + sex);
		System.out.println("번호 : " + phone);
		System.out.println("이메일 : " + email);
		
		
	}
	
	public  void example2() {
		String name = "문승종";
		int age = 26;
		float height = 183.1f;
		double weight = 73.1;
		char sex = 'M';
		String phone = "010-1234-5678";
		String email = "msj102525@gmail.com";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + sex);
		System.out.println("번호 : " + phone);
		System.out.println("이메일 : " + email);
		
		
	}


}
