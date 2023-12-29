package var.parctice;

import java.util.Scanner;

public class Practice {
	Scanner sc = new Scanner(System.in);

	public void myProfile() {
		System.out.print("이름 :");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("성별 :");
		String gender = sc.next();

		System.out.print("전화번호 :");
		String phone = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		System.out.println("신상정보 : " + name + ", " + age + ", " + gender + ", " + phone + ", " + email);

	}

	public void inputEmployee() {
		System.out.print("사번 : ");
		String empId = sc.next();

		System.out.print("이름 : ");
		String empName = sc.next();

		System.out.print("주민번호 : ");
		String empNo = sc.next();

		System.out.print("급여 : ");
		int salary = sc.nextInt();

		System.out.print("보너스지급율 : ");
		double bonusPct = sc.nextDouble();

		System.out.print("소속부서명 : ");
		String deptName = sc.next();

		System.out.print("직급 : ");
		String jobName = sc.next();

		System.out.println("직원 정보 : " + empId + "," + empName + "," + empNo + "," + salary + "," + bonusPct + ","
				+ deptName + "," + jobName);
		System.out.println("연봉 : " + (int) (salary + (salary * bonusPct) * 12));

	}

	public void calculator() {
		System.out.print("첫번째 수 : ");
		int firstNum = sc.nextInt();

		System.out.print("두번째 수 : ");
		int secondNum = sc.nextInt();

		System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
		System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
		System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
		System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
		System.out.println(firstNum + "%" + secondNum + "=" + (firstNum % secondNum));

	}

	public void printUnicode() {
		System.out.print("문자입력 : ");
		String str = sc.next();
		char strChar = str.charAt(0);
		int uniChar = str.codePointAt(0);

//		System.out.println(strChar + " is unicode " + (int) strChar);
		System.out.println(strChar + " is unicode " + uniChar);

	}

	public void gugudan() {
		System.out.print("구구단 수 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public void rectangleCalculator() {
		System.out.print("사각형 가로 길이 : ");
		double width = readRoundedDouble();

		System.out.print("사각형 세로 높이 : ");
		double height = readRoundedDouble();

		double perimeter = (width + height) * 2;
		double area = width * height;

		System.out.println("둘래길이 : " + perimeter);
		System.out.println("면적 : " + area);
	}

	private double readRoundedDouble() {

		double value = sc.nextDouble();
		return Math.floor(value * 10) / 10;

	}

}
