package io.silsub1;

import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		// 입출력 실습문제 1
		menu();
		System.out.println("MyNote 프로그램 종료.");
	}

	public static void menu(){
		MyNote note = new MyNote();
		Scanner sc = new Scanner(System.in);
		int no;
		
		do{
			System.out.println("\n******   MyNote  *******\n");

			System.out.println("1. 노트 새로 만들기");		//MyNote의 fileSave()
			System.out.println("2. 노트 열기");		//MyNote의 fileOpen()
			System.out.println("3. 노트 열어서 수정하기");	//MyNote의 fileEdit()
			System.out.println("4. 끝내기");		//main() 으로 리턴
			System.out.print("메뉴 선택 : ");
			no = sc.nextInt();
			
			switch(no){
			case 1:	note.fileSave();    break;
			case 2:	note.fileOpen();   break;
			case 3:	note.fileEdit();     break;
			case 4:	return;
			default:	System.out.println("\n잘못 입력하였습니다." + 
															"\n다시 입력하십시오.");
			}
		}while(true);
	}
}

