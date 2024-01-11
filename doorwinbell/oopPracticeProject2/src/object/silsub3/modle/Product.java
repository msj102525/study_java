package object.silsub3.modle;

public class Product {
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tex;

	public Product() {
	}

	public Product(String productId, String productName, String productArea, int price, double tex) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tex = tex;
	}
	
	public void information() {
		System.out.println("상품 ID : " + productId + ", 상품 이름 : " + productName + ", "
									+ "생산지 : " + productArea + ", 가격 : " + price + ", 부가세 비율 : " + tex );
	}
	
	public void setId(String productId) {
		this.productId = productId;
	}
	public void setName(String productName) {
		this.productName = productName;
	}
	public void setArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTex(double tex) {
		this.tex = tex;
	}
	
	public String getName() {
		return this.productName;
	}
	public int getPrice() {
		return this.price;
	}
	public double getTex() {
		return this.tex;
	}
	

}
