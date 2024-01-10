package com.oop.run;

import com.oop.model.dto.Employee;
import java.util.*;

public class EmpTest {
		
	public static void main(String[] args){
		mainMenu();
	}
	
	public static void mainMenu(){
		int no;
		Employee e = null;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("******* 사원 정보 관리 프로그램 ************");
			System.out.println();
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("번호 선택 : ");
			no = sc.nextInt();
			
			switch(no){
			case 1:	e = new Employee();
					e.empInput();     break;
			case 2:	if(e != null) {
						modifyMenu(e);	
					}else{
						System.out.println("수정할 대상 직원 정보가 없습니다.");
					}
					break;
			case 3:	e = null; break;
			case 4:	if(e != null) {
						e.empOutput();
					}else{
						System.out.println("출력할 대상 직원 정보가 없습니다.");
					}
					break;
			case 9:	System.out.println("프로그램을 종료합니다. 바이바이^^!");
			            System.exit(0);
			default:	System.out.println("잘못 입력하셨습니다.  다시 입력하세요.");
			}
		}while(true);
	}
	
	public static void modifyMenu(Employee e){
		int no;		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("\n**** 사원 정보 수정 메뉴 *****");
			System.out.println();
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("5. 이전 메뉴로 이동");
			System.out.print("번호 선택 : ");
			no = sc.nextInt();
			
			switch(no){
			case 1:	System.out.print("수정할 직원명 : ");
			   			e.setEmpName(sc.next());
						break;
			case 2:	System.out.print("수정할 급여 : ");	
						e.setSalary(sc.nextInt());
						break;
			case 3:	System.out.print("수정할 부서명 : ");
						e.setDept(sc.next());
						break;
			case 4:	System.out.print("수정할 직급 : ");   
						e.setJob(sc.next());
						break;
			case 5:	return;
			default:	System.out.println("잘못 입력하셨습니다.  다시 입력하세요.");
			}
		}while(true);
	}
}
