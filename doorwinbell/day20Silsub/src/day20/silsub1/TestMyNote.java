package day20.silsub1;

import java.util.Scanner;

public class TestMyNote {
	
	public static void main(String[] args) {
		TestMyNote tmn = new TestMyNote();
		tmn.menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		MyNote mn = new MyNote();
		
		
		int num = 0;
		do {
			System.out.println("******   MyNote  *******");

			System.out.println("1. 노트 새로 만들기"); // MyNote의 fileSave()
			System.out.println("2. 노트 열기"); // MyNote의 fileOpen()
			System.out.println("3. 노트 수정하기 "); // MyNote의 fileEdit()
			System.out.println("4. 끝내기"); // main() 으로 리턴
			
			System.out.print("번호 입력 : ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				mn.fileSave();
				break;
			case 2:
				mn.fileOpen();
				break;
			case 3:
				mn.fileEdit();
				break;
			case 4:
				return;
			default:
				System.out.println("잘못입력");
			}

		} while (num != 4);
	}

	

}
