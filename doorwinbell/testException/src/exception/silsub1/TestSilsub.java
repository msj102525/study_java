package exception.silsub1;

import java.util.Scanner;

public class TestSilsub {

	public static void main(String[] args) {
		TestSilsub ts = new TestSilsub();
//		ts.silsub1();
		ts.silsub2();
	}

	public void silsub1() {
		Scanner sc = new Scanner(System.in);
		CharacterProcess cp = new CharacterProcess();

		System.out.print("문자열입력 : ");

		try {
			System.out.println(cp.countAlpha(sc.next()));
		} catch (CharCheckException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	public void silsub2() {
		Scanner sc = new Scanner(System.in);
		NumberProcess np = new NumberProcess();

		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt();

		System.out.print("두번째 숫자 입력 : ");
		int b = sc.nextInt();

		try {
			if (np.checkDouble(a, b)) {
				System.out.println(a + "는 " + b + "의 배수이다");
			} else {
				System.out.println(a + "는 " + b + "배수가 아니다");
			}

		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
