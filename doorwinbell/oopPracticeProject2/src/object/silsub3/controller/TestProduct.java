package object.silsub3.controller;

import object.silsub3.modle.Product;

public class TestProduct {

	public static void main(String[] args) {
		Product pd = new Product();
		pd.information();
		System.out.println("=====================");
		Product pd1 = new Product("ssgnote6", "갤럭시노트6", "경기도수원", 960000, 10.);
		Product pd2 = new Product("lgxnote5", "스마트폰5", "경기도평택", 780000, 0.7);
		Product pd3 = new Product("ktnorm3", "일반폰3", "경기서울시강남도수원", 25000, 0.3);
		pd1.information();
		pd2.information();
		pd3.information();

		
		System.out.println("=====================");

		pd1.setPrice(1200000);
		pd2.setPrice(1200000);
		pd3.setPrice(1200000);

		pd1.setTex(0.05);
		pd2.setTex(0.05);
		pd3.setTex(0.05);
		
		System.out.println("상품명 : " + pd1.getName() + " 부가세 포함 가격 : " + 
		(pd1.getPrice() + (pd1.getPrice() * pd1.getTex())) + "원");

		System.out.println("상품명 : " + pd2.getName() + " 부가세 포함 가격 : " + 
				(pd2.getPrice() + (pd2.getPrice() * pd2.getTex())) + "원");
		
		System.out.println("상품명 : " + pd3.getName() + " 부가세 포함 가격 : " + 
				(pd3.getPrice() + (pd3.getPrice() * pd3.getTex())) + "원");

	}

}
