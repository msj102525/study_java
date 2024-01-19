package ncs.test4;

public class FruitTest {

	public static Fruit[] initFruit(int length) {
		Fruit[] fruits = new Fruit[length];

		return fruits;
	}

	public static void printFruit(Fruit[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}

	public static void main(String[] args) {
		
		Fruit[] ft = initFruit(5);
		
		ft[0] = new Fruit("apple", 1200, 3);
		ft[1] = new Fruit("banana", 2500, 2);
		ft[2] = new Fruit("grape", 4500, 5);
		ft[3] = new Fruit("orange", 800, 10);
		ft[4] = new Fruit("melon", 5000, 2);

		printFruit(ft);
	}

}
