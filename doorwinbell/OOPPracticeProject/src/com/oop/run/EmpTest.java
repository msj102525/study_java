package com.oop.run;

import java.util.Scanner;

import com.oop.modle.dto.Employee;

public class EmpTest {
	static Scanner sc = new Scanner(System.in);
	static Employee emp = new Employee();
	static int num = 0;
	

	public static void mainMenu() {

		do {
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("번호 입력 : ");
			num = sc.nextInt();
			
			
			switch(num) {
			case 1:
				emp.empInput();
				break;
			case 2:
				modifyMenu();
				break;
			case 3:
				emp = null;
				break;
			case 4:
				emp.empOutput();
				break;
			case 9:
				System.out.println("종료함=============");
				System.exit(0);
				
			default:
				System.out.println("번호 잘못 입력");
				System.out.println("다시입력");
			}

		} while (num != 9);
	} // mainMenu();
	
public static void modifyMenu() {

		do {
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("5. 이전 메뉴로 이동");
			System.out.print(" 번호 입력 : ");
			System.out.println();
			num = sc.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.print("수정 이름 입력 : ");
				emp.setEmpName(sc.next());
				break;
			case 2:
				System.out.print("변경할 급여 입력 : ");
				emp.setSalary(sc.nextInt());
				break;
			case 3:
				System.out.print("부서 변경");
				emp.setDept(sc.next());
				break;
			case 4:
				System.out.print("직급 변경 : ");
				emp.setJob(sc.next());
				break;
			case 5:
				return;
			default:
				System.out.println("번호 잘못 입력");
				System.out.println("다시입력");
			}

		} while (num != 5);
	}// modifyMenu();

	public static void main(String[] args) {
		mainMenu();		

	}

}
