package product.model.dto;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = -794729022988670651L;
	
	private String productId;
	private String pName;
	private int price;
	private String description;
	
	public Product() {
		super();
	}

	public Product(String productId, String pName, int price, String description) {
		super();
		this.productId = productId;
		this.pName = pName;
		this.price = price;
		this.description = description;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", pName=" + pName + ", price=" + price + ", productId="
				+ productId + "]";
	}
	
	
}
