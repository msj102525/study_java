package logic.testif;

import java.util.Scanner;

public class IfSample {
	// 조건문 if 만 사용한 경우의 샘플
	// 제시한 조건을 만족하는 경우에만 실행 내용이 작동되게 하는 구문임
	// if(조건표현식){  조건의 결과가 참일 때 실행할 구문들 }
	// 조건표현식은 반드시 참(true) | 거짓(false)의 결과가 나오게끔 작성해야 함
	
	public void test1() {
		// 정수를 하나 입력받아서, 양수일 때만 입력된 수의 구구단 출력 처리
		// 양수가 아니면 실행할 내용 없음
		System.out.print("정수 하나 입력 : ");
		int dan = new Scanner(System.in).nextInt();
		
		if(dan > 0) {
			// dan 의 값이 양수일 때만 작동
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " +  dan * i );
			}
		} // if		
	} // test1()
	
	public void test2() {
		// 문자 하나 입력받아, 양수이면서 대문자일 때만 유니코드가 출력되게 처리
		System.out.print("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		if(ch > 0 && Character.isUpperCase(ch) ) {
			System.out.println(ch + " is unicode " + (int)ch);
		} else {
			System.out.println("잘못입력");			
		}		
	} //test2()
	
	public void test3() {
		// 콘솔에 "회원이면 1, 비회원이면 2 입력 : " 출력
		
		/* 입력값이 1일 때는
		// "로그인할 아이디 : " 출력하고, 아이디 입력받음
		 * "암호 : " 출력하고 , 암호 입력받음
		아이디와 암호를 확인 출력 처리
		*/
		
		/* 입력값이 2일때는
		 * "회원가입하셔야 합니다." 라고 출력하고
		 * "이름 : " 출력하고, 이름입력받음
		 * "아이디 지정 : " 출력하고, 아이디 입력받음
		 * "암호 지정 : " 출력하고, 암호 입력받음
		 * "이메일 : " 출력하고, 이메일 입력받음
		 * "전화번호 : " 출력하고, 전화번호 입력받음
		 * "성별[남/여] : " 출력하고, 성별 입력받음
		 * "나이 : " 출력하고 나이 입력받음
		 * 
		 * 입력받은 값 모두 출력 처리 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회원이면 1, 비회원이면 2 입력 : ");
		int yOrN = sc.nextInt();
		
		if(yOrN == 1) {
			System.out.print("로그인할 아이디 : ");
			String id = sc.next();
			System.out.print("암호 : ");
			String pw = sc.next();
			
			System.out.println("id  = " + id);
			System.out.println("pw  = " + pw);
		} else {
			
			System.out.println("회원가입하셔야 합니다.");
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("암호 : ");
			String pw = sc.next();
			
			System.out.print("이메일 : ");
			String email = sc.next();
			
			System.out.print("전화번호 : ");
			String phone = sc.next();
			
			System.out.print("성별 : ");
			String gender = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.println();
			System.out.println("이름 : " + name);
			System.out.println("아이디 : " + id);
			System.out.println("암호 : " + id);
			System.out.println("이메일 : " + email);
			System.out.println("전화번호 : " + phone);
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age + "세");
		}
		
	} // test3()
	
	
}
