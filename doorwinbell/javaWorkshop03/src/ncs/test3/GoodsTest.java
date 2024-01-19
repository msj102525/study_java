package ncs.test3;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods goods = new Goods();
		
		System.out.println("항목의 값을 입력하세요. ");
		System.out.print("상품명 : ");
		goods.setName(sc.nextLine());
		
		System.out.print("가격 : ");
		goods.setPriece(sc.nextInt());
		
		System.out.print("수량 : ");
		goods.setQuatity(sc.nextInt());

		
		System.out.println(goods);
		System.out.println("총 구매 가격: " + (goods.getPriece() * goods.getQuatity()) + " 원");
	}

}
