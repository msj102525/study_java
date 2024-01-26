package day20.silsub1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	private StringBuilder str = new StringBuilder();
	private String fileName;
	private final String exit = "exit";

	public void MyNote() {
	}

	public void fileSave() {
		System.out.print("저장할 파일명 (파일명.txt) : ");
		fileName = sc.next();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));) {
			System.out.println(fileName + " 기록 저장할 내용을 입력하세요.");

			str = new StringBuilder();
			String input = null;

			sc.nextLine();
			while (!(input = sc.nextLine()).equals(exit)) {
				str.append(input);
			}
			System.out.println("저장!");
			bw.write(str.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fileOpen() {
		System.out.print("읽을 파일명(.txt): ");
		fileName = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String readData = null;
			while ((readData = br.readLine()) != null) {
				System.out.println(readData);
			}
			System.out.println(fileName + " 읽기 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fileEdit() {
	    System.out.print("수정할 파일명(.txt): ");
	    fileName = sc.next();

	    StringBuilder str2 = new StringBuilder();
	    String newInput = null;
	    String readData = null;

	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        while ((readData = br.readLine()) != null) {
	            System.out.println(readData);
	            str2.append(readData).append("\n");
	        }
	        System.out.println("==== 이전 내용 ========");

	    } catch (Exception e) {
	        e.printStackTrace();
	    } // read

	    System.out.println("str2 : " + str2.toString());

	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
	        sc.nextLine(); // 개행 문자 처리

	        while (!(newInput = sc.nextLine()).equals(exit)) {
	            str2.append(newInput).append("\n");
	        }

	        System.out.println("변경된 내용을 파일에 추가 하시겠습니까? (y/n) :");
	        char yOrN = Character.toLowerCase(sc.next().charAt(0));

	        System.out.println("str2 : " + str2.toString());

	        if (yOrN == 'y') {
	            System.out.println("파일 내용이 변경되었습니다.");
	            bw.write(str2.toString());
	        } else {
	            bw.write(str.toString());
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
