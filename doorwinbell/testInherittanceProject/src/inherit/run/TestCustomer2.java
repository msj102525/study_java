package inherit.run;

import inherit.model.dto.Customer;

public class TestCustomer2 {

	public static void main(String[] args) {
		// 객체배열 사용 테스트
		Customer[] car = new Customer[3];
		
		car[0] = new Customer("문",281,'남',"msj1@test.org", "0101-123-123",
				"자양동1", 123.1231);
		car[1] = new Customer("문1",282,'남',"msj2@test.org", "0102-123-123",
				"자양동2", 123.1232);

		car[2] = new Customer("문2",283,'남',"msj3@test.org", "0103-123-123",
				"자양동3", 123.1233);

		for(int i=0;i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		 System.out.println();
		 
		// for each문 사용 : 객체배열, 컬렉션에서 주로 사용함
		// for(클래스타입 레퍼런스 : 배열명){레퍼런스.메소드()}
		 for(Customer c : car) {
			 System.out.println(c);
		 }
		 
		 // 고객들의 포인트 누적 합산 처리
		 double totalPoint = 0; //0. == 0.0
		 for(Customer c : car) {
			 totalPoint += c.getPoint();
		 }
		 System.out.println();
		 System.out.println("누적포인트 : " + totalPoint);

	}

}
