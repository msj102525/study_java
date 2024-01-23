package ncs.test8;

public class PhoneSortTest {
	public static void main(String args[]) {
		Phone[] phones = new Phone[3];

		phones[0] = new Phone("galaxy S7", 563500, "삼성", 7);
		phones[1] = new Phone("iphone 6s", 840000, "애플", 3);
		phones[2] = new Phone("G5", 563500, "LG", 5);

		System.out.println("저장된 정보는 다음과 같습니다.");
		for (int i = 0; i < phones.length; i++) {
			System.out.println(i + " : " + phones[i].toString());
		}

		System.out.println("모델명 기준");
		sortModelAsc(phones);

		System.out.println("수량 기준");
		sortQuantityDesc(phones);
	}

	public static void sortModelAsc(Phone[] phones) {
		for (int i = 0; i < phones.length - 1; i++) {
			for (int j = i + 1; j < phones.length; j++) {
				if (phones[i].getModel().compareTo(phones[j].getModel()) > 0) {
					Phone temp = phones[i];
					phones[i] = phones[j];
					phones[j] = temp;
				}
			}
		}

		for (int i = 0; i < phones.length; i++) {
			System.out.println(i + " : " + phones[i].toString());
		}
	}

	public static void sortQuantityDesc(Phone[] phones) {
		for (int i = 0; i < phones.length - 1; i++) {
			for (int j = i + 1; j < phones.length; j++) {
				if (phones[i].getQuantity() < phones[j].getQuantity()) {
					Phone temp = phones[i];
					phones[i] = phones[j];
					phones[j] = temp;
				}
			}
		}

		for (int i = 0; i < phones.length; i++) {
			System.out.println(i + " : " + phones[i].toString());
		}
	}

}