package com.mvc.model;

public class Salary {
	private String name;
	private long pay;
	private long overtimeP;
	private long incenP;
	private long tax;
	private long totalPay;
	private int family;
	private int overtime;
	static float incentive;
	static int count;

	{
		incentive = 0.5F;
	}
	static {
		count = 0;
	}

	public Salary() {
		super();
		this.count += 1;
	}

	public Salary(String name, long pay, int family, int overtime) {
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;
		this.count += 1;
	}

//	public Salary(String name, long pay, long overtimeP, long incenP, long tax, long totalPay, int family,
//			int overtime) {
//		super();
//		this.name = name;
//		this.pay = pay;
//		this.overtimeP = overtimeP;
//		this.incenP = incenP;
//		this.tax = tax;
//		this.totalPay = totalPay;
//		this.family = family;
//		this.overtime = overtime;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPay() {
		return pay;
	}

	public void setPay(long pay) {
		this.pay = pay;
	}

	public long getOvertimeP() {
		return overtimeP;
	}

	public void setOvertimeP(long overtimeP) {
		this.overtimeP = overtimeP;
	}

	public long getIncenP() {
		return incenP;
	}

	public void setIncenP(long incenP) {
		this.incenP = incenP;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static float getIncentive() {
		return incentive;
	}

	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}

}
