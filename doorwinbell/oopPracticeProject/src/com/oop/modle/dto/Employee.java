package com.oop.modle.dto;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	public Employee() {
	};

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	public void empInput() {

		System.out.print("사번 : ");
		this.empNo = sc.nextInt();

		System.out.print("이름 : ");
		this.empName = sc.next();

		System.out.print("소속부서 : ");
		this.dept = sc.next();

		System.out.print("직급 : ");
		this.job = sc.next();

		System.out.print("나이 : ");
		this.age = sc.nextInt();

		System.out.print("성별 : ");
		this.gender = sc.next().charAt(0);

		System.out.print("급여 : ");
		this.salary = sc.nextInt();

		System.out.print("보너스포인트 : ");
		this.bonusPoint = sc.nextDouble();

		System.out.print("급여 : ");
		this.phone = sc.next();

		System.out.print("주소 : ");
		this.address = sc.next();
	}

	public void empOutput() {

		System.out.print("사번 : " + this.empNo);
		System.out.print("이름 : " + this.empName);
		System.out.print("소속부서 : " + this.dept);
		System.out.print("직급 : " + this.job);
		System.out.print("나이 : " + this.age);
		System.out.print("성별 : " + this.gender);
		System.out.print("급여 : " + this.salary);
		System.out.print("보너스포인트 : " + this.bonusPoint);
		System.out.print("핸드폰 : " + this.phone);
		System.out.print("주소 : " + this.address);
		System.out.println();
	}

	public void setEmpName(String empName) {
		
		this.empName = empName;
	}

	public void setSalary(int salary) {
		
		this.salary = salary;
	}

	public void setDept(String dept) {
		
		this.empName = empName;
	}

	public void setJob(String job) {
		
		this.empName = empName;
	}

}
