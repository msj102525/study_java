package product.run;

import product.view.ProductView;

public class Main {

	public static void main(String[] args) {
		ProductView pview = new ProductView();
		pview.displayMenu();
		
		System.out.println("상품 관리 프로그램 종료.");
	}

}
