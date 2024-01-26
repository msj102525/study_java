package io.silsub1;

import java.util.Scanner;
import java.io.*;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	
	public MyNote(){}
	
	public void fileSave(){
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();
		String input = null;
		
		try {			
			System.out.println("파일에 저장할 내용을 입력하시오");
			while(!(input = sc.nextLine()).equals("exit")){
				sb.append(input + "\n");
			}
			
			System.out.print("저장하시겠습니까? (y/n) : ");
			if(sc.next().toUpperCase().charAt(0) == 'Y'){
				System.out.print("저장할 파일명 : ");
				String fileName = sc.next();
				
				bw = new BufferedWriter(new FileWriter(fileName));
				bw.write(sb.toString());
				
				System.out.println(fileName + " 파일에 성공적으로 저장하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void fileOpen(){
		BufferedReader br = null;
		
		try {
			System.out.print("열기할 파일명 : ");
			String fileName = sc.next();
			
			br = new BufferedReader(new FileReader(fileName));
			
			String readValue;
			while((readValue = br.readLine()) != null){
				System.out.println(readValue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
	
	public void fileEdit(){
		BufferedWriter bw = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String input = null;
		
		try {			
			System.out.print("수정할 파일명 : ");
			String fileName = sc.next();
			br = new BufferedReader(new FileReader(fileName));
			
			//기존의 내용을 읽어 StringBuilder 에 저장
			while((input = br.readLine()) != null){
				sb.append(input + "\n");
			}
			
			//추가할 내용 입력받음
			System.out.println("파일에 추가할 내용을 입력하시오.");
			while(!(input = sc.nextLine()).equals("exit")){
				sb.append(input + "\n");
			}			
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			if(sc.next().toUpperCase().charAt(0) == 'Y'){				
				bw = new BufferedWriter(new FileWriter(fileName, true));
				bw.write(sb.toString());
				
				System.out.println(fileName + " 파일의 내용이 변경되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

