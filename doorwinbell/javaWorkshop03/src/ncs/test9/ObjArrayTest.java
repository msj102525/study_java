package ncs.test9;

import java.util.Date;

public class ObjArrayTest {

	public static void main(String[] args) {
		Inventory[] inventories = new Inventory[3];

		inventories[0] = new Inventory("삼성 갤럭시S7", new Date(116, 2, 15), 30);
		inventories[1] = new Inventory("LG G5", new Date(116, 1, 25), 20);
		inventories[2] = new Inventory("애플 아이패드 Pro", new Date(116, 0, 23), 15);

		for (Inventory inventory : inventories) {
			System.out.println(inventory);
			inventory.setGetDate(new Date(116, 3, 28));
			inventory.setGetAmount(10);
		}

		System.out.println("=============");
		for (Inventory inventory : inventories) {
			System.out.println(inventory);
		}

	}
}
