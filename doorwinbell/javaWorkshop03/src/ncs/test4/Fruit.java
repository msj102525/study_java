package ncs.test4;

public class Fruit {
	private String name;
	private int price;
	private int quantity;
	
	//
	public Fruit() {
		super();
	}
	
	public Fruit(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	//
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
