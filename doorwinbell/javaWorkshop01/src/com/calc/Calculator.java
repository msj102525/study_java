package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] parseIntArr = new int[2];
		for(int i =0;i<args.length;i++) {
			parseIntArr[i] = Integer.parseInt(args[i]);
		}
		int sum = parseIntArr[0] + parseIntArr[1];
		int sub = parseIntArr[0] - parseIntArr[1];
		int mul = parseIntArr[0] * parseIntArr[1];
		int div = parseIntArr[0] / parseIntArr[1];
		
		System.out.println("합" + sum);
		System.out.println("차" + sub);
		System.out.println("곱" + mul);
		System.out.println("나누기" + div);
			
		
		
	}

}
