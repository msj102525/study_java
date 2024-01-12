package array1.controller;

import java.util.Scanner;

import array1.model.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// 1. Person 클래스에 대한 객체 배열 5개 선언함
		Person[] pArr = new Person[2];
		Scanner sc = new  Scanner(System.in);
		
		// 2. 키보드로 5 사람의 정보를 입력받아, 각 객체에 기록함

		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
			
			System.out.println(i +1 + "번째 사람의 정보입력"  );
			
			System.out.print("이름 : ");
			pArr[i].setName(sc.next());
			
			System.out.print("나이 : ");
			pArr[i].setAge(sc.nextInt());
			
			System.out.print("성별 (남/여) : ");
			pArr[i].setGender(sc.next().charAt(0));
			
			System.out.print("키 : ");
			pArr[i].setHeight(sc.nextDouble());
			
			System.out.print("몸무게 : ");
			pArr[i].setWeight(sc.nextDouble());
			
			// 3. 출력 확인함
			System.out.println(pArr[i].information());
		}
		
		// 출력 따로 구문 작성 한다면;
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(i+1 + "번째 사람 : " + pArr[i].information());
		}
	
		
		// 4. 5명의 나이, 키, 몸무게의 평균을 구하여 각각 출력함
		// 평균계산 : 소숫점 첫째자리 까지;
		int totalAge = 0;
		double totalHeight = 0., totalWeight = 0.;
		
		
		for (int i = 0; i < pArr.length; i++) {
			totalAge += pArr[i].getAge();
			totalHeight += pArr[i].getHeight();
			totalWeight += pArr[i].getWeight();
		}
//		System.out.println("평균 나이 : " + totalAge / pArr.length);
		System.out.println("평균 나이 : " + (Math.floor( totalAge / pArr.length * 10)) / 10);
		System.out.println("평균 키 : " + (Math.floor( totalHeight / pArr.length * 10)) / 10);
		System.out.println("평균 몸무게 : " + (Math.floor( totalWeight / pArr.length * 10)) / 10);
		
	}

}
