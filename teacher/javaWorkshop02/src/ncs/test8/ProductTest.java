package ncs.test8;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 : ");
		p.setName(sc.nextLine());
		System.out.print("가격 : ");
		p.setPrice(sc.nextInt());
		System.out.print("갯수 : ");
		p.setQuantity(sc.nextInt());
		
		System.out.println(p.information());
		System.out.println("총 구매 가격 : "+ p.getPrice() * p.getQuantity() + " 원");
	}
}
