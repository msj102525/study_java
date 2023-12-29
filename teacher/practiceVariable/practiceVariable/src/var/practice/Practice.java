package var.practice;

import java.util.Scanner;

public class Practice {

	public void myProfile() {
		Scanner sc = new Scanner(System.in);
		//본인의 이름(name), 나이(age), 성별(gender, 남 | 여), 전화번호(phone), 
		//이메일(email) 을
		// 키보드로 입력받아, 각 변수에 저장한 다음 콘솔에 출력 처리하시오.

		//입력 예 : 
		//이름 : 황지니
		//나이 : 27
		//성별 : 여
		//전화번호 : 010-7777-8888
		//이메일 : whang77@test.org
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 (남 | 여) : ");
//		String s = sc.next();  //"여" 또는 "남"
//		char gender = s.charAt(0);  //'여' , '남'
		char gender = sc.next().charAt(0);
		System.out.print("전화번호 : ");
		String phone = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		
		//출력 예 : 
		//신상정보 : 황지니, 27새, 여자, 010-7777-8888, whang77@test.org
		System.out.println("신상정보 : " + name + ", " + age + "세, "
				+ gender + "자, " + phone + ", " + email);
	}

	public void inputEmployee() {
		Scanner sc = new Scanner(System.in);
		//사원 정보를 키보드로 입력받아, 변수에 저장한 다음 
		//확인을 위해 콘솔에 출력 처리하시오.
		//사번(empId), 이름(empName), 주민번호(empNo), 급여(salary), 
		//보너스지급율(bonusPct, 0.5 | 1.2 등으로 입력), 
		//부서명(deptName, 기획부 | 개발부 | 총무부 | 인사부 등으로 입력), 
		//직급명(jobName, 사원 | 대리 | 과장 | 차장 등으로 입력)

		//마지막에 연봉을 계산하여 출력 처리하시오.
		//계산한 결과값은 정수로 바꾸어 출력되게 합니다.
		//계산식에서 먼저 계산하고 싶은 부분은 괄호 () 로 묶어준다.
		//연봉 = (int)((급여 + (급여 * 보너스지급율)) * 12);

		//입력 예 : 
		//사번 : s23037b5
		//이름 : 이똘똘
		//주민번호 : 941225-1234567
		//급여 : 3500000
		//보너스지급율 : 0.05
		//소속부서명 : 개발부
		//직급 : 사원
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
		

		//출력 예
		//직원 정보 : s23037b5, 이똘똘, 941225-1234567, 3500000, 0.05, 개발부, 사원
		//연봉 : 44100000
		System.out.println("직원 정보 : " + empId + ", " + empName 
						+ ", " + empNo + ", " + salary + ", "
						+ bonusPct + ", " + deptName + ", " + jobName);
		System.out.println("연봉 : " + (int)((salary + (salary * bonusPct)) * 12));
	}

	public void calculator() {
		Scanner sc = new Scanner(System.in);
		//정수 2개를 키보드로 입력받아, 
		//더하기, 빼기, 곱하기, 나누기한 몫, 나누기한 나머지를 계산하여
		//콘솔에 출력 처리하시오.

		//입력 예 : 
		//첫번째 수 : 33
		//두번째 수 : 16
		System.out.print("첫번째 수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 수 : ");
		int second = sc.nextInt();
		
		//출력 예 : 
		/*
		33 + 16 = 49 
		33 - 16 = 17
		33 * 16 = 528
		33 / 16 = 2
		33 % 16 = 1
		*/
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		System.out.println(first + " / " + second + " = " + (first / second));
		System.out.println(first + " % " + second + " = " + (first % second));
	}

	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		//문자 하나를 키보드로 입력받아
		//입력된 문자의 유니코드를 콘솔에 출력 처리하시오.
		//Scanner 클래스에 문자하나 입력받는 메소드 없음
		//힌트 : 문자하나를 String 형으로 입력받은 다음, 첫번째(0번째) 글자하나를 추출함
		
		//입력 예 :
		//문자 입력 : A
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		//출력 예 :
		//A is unicode 65
		System.out.println(ch + " is unicode " + (int)ch);
	}

	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		//정수 숫자 하나를 키보드로 입력받은 다음
		//입력받은 수의 구구단을 콘솔에 출력 처리하시오.

		//입력 예 : 
		//구구단 수 : 7
		System.out.print("구구단 수 : ");
		int dan = sc.nextInt();
		
		//출력 예 :
		/*
		7 * 1 = 7
		7 * 2 = 14
		7 * 3 = 21
		7 * 4 = 28
		7 * 5 = 35
		7 * 6 = 42
		7 * 7 = 49
		7 * 8 = 56
		7 * 9 = 63
		*/
//		System.out.println(dan + " * 1 = " + (dan * 1));
//		System.out.println(dan + " * 2 = " + (dan * 2));
//		System.out.println(dan + " * 3 = " + (dan * 3));
//		System.out.println(dan + " * 4 = " + (dan * 4));
//		System.out.println(dan + " * 5 = " + (dan * 5));
//		System.out.println(dan + " * 6 = " + (dan * 6));
//		System.out.println(dan + " * 7 = " + (dan * 7));
//		System.out.println(dan + " * 8 = " + (dan * 8));
//		System.out.println(dan + " * 9 = " + (dan * 9));
		
		//위의 출력구문을 반복문 사용으로 바꾼 다음
		for(int su = 1; su < 10; su++) {
			System.out.println(dan + " * " + su + " = " + (dan * su));
		}
	}

	public void rectangleCalculator() {
		Scanner sc = new Scanner(System.in);
		//사각형의 가로길이(width)와 세로길이(height)를
		//소숫점 아래 첫째자리까지 키보드로 입력받아서
		//둘레(perimeter) 와 면적(area) 을 계산하여 변수에 저장한 다음
		//둘레 = (가로 + 세로) * 2;
		//면적 = 가로 * 세로;
		//둘레와 면적을 콘솔에 출력 처리하시오.

		//입력 예 : 
		//사각형 가로 길이 : x.x
		//사각형 세로 높이 : x.x
		System.out.print("사각형 가로 길이 : ");
		double width = sc.nextDouble();
		System.out.print("사각형 세로 높이 : ");
		double height = sc.nextDouble();
		
		double perimeter = (width + height) * 2;
		double area = width * height;		
		
		//출력 예 : 
		//둘레길이 : x.x
		//면적 : x.x
		System.out.println("둘레길이 : " + perimeter);
		System.out.println("면적 : " + area);
		
	}
}
