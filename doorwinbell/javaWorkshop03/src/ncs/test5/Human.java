package ncs.test5;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	//
	public Human() {
		super();
	}
	
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
}
