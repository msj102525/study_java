package ncs.test8;

import java.util.Scanner;

class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("휴대폰 기종 : ");
		String name = sc.next();
		System.out.print("휴대폰 가격 : ");
		int price = sc.nextInt();
		System.out.print("휴대폰 수량 : ");
		int quantity = sc.nextInt();
		Product pro = new Product(name,price,quantity);
		
		System.out.println("휴대폰 이름 : " + pro.getName());
		System.out.println("휴대폰 가격 : " + pro.getPrice());
		System.out.println("휴대폰 수량 : " + pro.getQuantity());
		System.out.println("총 가격 : " + (pro.getQuantity() * pro.getPrice()) + "원");
		

	}

}
