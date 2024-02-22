package product.view;

import java.util.ArrayList;
import java.util.Scanner;

import product.controller.ProductController;
import product.model.dto.Product;

public class ProductView {
	private static ProductController pcon = new ProductController();
	private static Scanner sc = new Scanner(System.in);
	private static Product prod = null;
	public static void displayMenu() {
		do {
			System.out.println("\n ********* 상품 관리 프로그램 *******\n");

			System.out.println("1. 전체 조회");
			System.out.println("2. 추가 ");
			System.out.println("3. 수정 ");
			System.out.println("4. 삭제 ");
			System.out.println("5. 검색 ");
			System.out.println("6. 끝내기 ");

			System.out.print("메뉴 번호 : ");
			int no = sc.nextInt();

			try {
				switch (no) {
				case 1:
					displayList(pcon.selectList());
					break;
				case 2:
					prod = inputProduct();
					if(pcon.insertProduct(prod) > 0) {
						System.out.println("상품 등록 성공");
						display(pcon.selectById(prod.getProductId()));
//						display(prod);
					} else {
						System.out.println("상품 등록 실패");
					}
					break;
				case 3:
					prod =pcon.selectById(inputProuductId());
					if(prod != null) {
						if(pcon.updatePorduct(updateProduct(), prod.getProductId()) > 0) {;
							System.out.println("수정 완료");
						} else {
							System.out.println("수정 실패");
						}
					}
				case 4:
					prod =pcon.selectById(inputProuductId());
					if(prod != null) {
						if(pcon.deleteProduct(prod.getProductId()) > 0) {;
							System.out.println("삭제 완료");
						} else {
							System.out.println("삭제 실패");
						}
					}
					break;
				case 5:
					System.out.println(pcon.selectByName(inputProductName()));
					break;
				case 6:
					System.out.print("프로그램 종료 ? (Y/N) : ");
					if (sc.next().toUpperCase().charAt(0) == 'Y') {
						return;
					} else {
						break;
					}
				default:
					System.out.println("잘못된 번호 입니다. 다시 입력");
				}
			} catch (Exception e) {
				printError(e.getMessage());
			}

		} while (true);
	}	

	private static int updateProduct() {
		System.out.print("수정할 가격 :");
		return sc.nextInt();
	}

	private static String inputProuductId() {
		System.out.print("수정 또는 삭제할 상품의 아이디 : ");
		return sc.next();
	}

	private static String inputProductName() {
		System.out.print("조회 또는 삭제할 상품의 이름 : ");
		return sc.next();
	}

	private static Product inputProduct() {
		Product prod = new Product();
		
		System.out.print("상품 아이디 : ");
		prod.setProductId(sc.next());
		
		System.out.print("상품 이름 : ");
		prod.setpName(sc.next());
		
		System.out.print("상품 가격 : ");
		prod.setPrice(sc.nextInt());
		
		System.out.print("상품 정보 : ");
		prod.setDescription(sc.next());
		
		return prod;
	}

	private static void displayList(ArrayList<Product> list) {
		System.out.println("현재 상품 수 : " + list.size() + "개");
		for(Product prod : list) {
			System.out.println(prod);
		}
	}
	
	private static void display(Product prod) {
		System.out.println(prod);
	}
	
	private static void printError(String message) {
		System.out.println("Error 발생 : " + message);
	}
}
