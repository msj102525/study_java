package test3.sample;

import java.util.Scanner;

public class LogicSample {
	public void inputProfile() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("성별 (남/여) : ");
			char gender = sc.next().charAt(0);

			System.out.print("전화번호 : ");
			String phone = sc.next();
			System.out.println(name + ", " + age + "세, " + gender + ", "+phone);
		} else {
			System.out.println("미성년자는 가입 X");
		}

	}

}
