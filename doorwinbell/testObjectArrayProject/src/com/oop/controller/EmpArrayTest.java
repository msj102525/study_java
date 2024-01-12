package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
//		Employee[] ear = new Employee[3];
//
//		ear[0] = new Employee();
//		ear[1] = new Employee(201503, "박길동", null, null, 29, 'M', 0, 0., "010-1234-9876", "의정부");
//		ear[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "노원구");
		
		// 객체 배열의 초기화ㄴ
		Employee[] ear = new Employee[]{
				new Employee(),
				new Employee(201503, "박길동", null, null, 29, 'M', 0, 0., "010-1234-9876", "의정부"),
				new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "노원구")
				};
		
		for (int i = 0; i < ear.length; i++) {
			System.out.println(ear[i].empInformation());
		} // for

		ear[0].setEmpNo(201305);
		ear[0].setEmpName("이영희");
		ear[0].setDept("총무부");
		ear[0].setJob("대리");
		ear[0].setAge(28);
		ear[0].setGender('F');
		ear[0].setSalary(3750000);
		ear[0].setBonusPoint(0.1);
		ear[0].setPhone("010-952-7534");
		ear[0].setAddress("동두천");

		ear[1].setDept("기획부");
		ear[1].setJob("사원");
		ear[1].setSalary(2900000);
		ear[1].setBonusPoint(0.05);
		ear[1].setPhone("010-1234-5678");
		ear[1].setAddress("의정부시");

		System.out.println("==============================");

		for (int i = 0; i < ear.length; i++) {
			System.out.println(ear[i].empInformation());
		}

		long[] empSal = new long[ear.length];
		long empSaltot = 0, empSalAvg = 0;

		for (int i = 0; i < ear.length; i++) {
			empSal[i] = (long) ((ear[i].getSalary() + (ear[i].getSalary() * ear[i].getBonusPoint()))) * 12;
			empSaltot += empSal[i];
			System.out.println(ear[i].getEmpName() + "의 연봉 : " + empSal[i]);
			empSalAvg = empSaltot / 3;
		}

		System.out.println("==============================");

		System.out.println("직원들 평균 연봉 : " + empSalAvg);
	}

}
