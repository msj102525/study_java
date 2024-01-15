package member.controller;

import member.model.dto.Member;
import member.view.MemberMenu;

public class Main {

	public static void main(String[] args) {
		
		MemberMenu mMenu = new MemberMenu();
		mMenu.mainMenu();
		
		System.out.println("회원관리 프로그램 종료");

	}

}
