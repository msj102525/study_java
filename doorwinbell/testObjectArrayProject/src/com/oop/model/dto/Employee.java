package com.oop.model.dto;

public class Employee {
	private int empNo; // 사번 : - empNo:int
	private String empName; // 이름 : - empName:String
	private String dept; // 소속부서 : - dept:String
	private String job; // 직급 : - job:String
	private int age; // 나이 : - age:int
	private char gender; // 성별 : - gender:char
	private int salary; // 급여 : - salary:int
	private double bonusPoint; // 보너스포인트 : - bonusPoint:double
	private String phone; // 핸드폰 : - phone:String
	private String address; // 주소 : - address:String
	
	public Employee() {}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		super();
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

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String empInformation() {
		return "Emp [" + this.empNo + ", " + this.empName + ", " + this.dept + ", "
							+ this.job + ", " + this.age + ", " + this.gender + ", "
							+ this.salary + ", " + this.bonusPoint + ", " + this.phone + ", "
							+ this.address;
	}
	
	

}
