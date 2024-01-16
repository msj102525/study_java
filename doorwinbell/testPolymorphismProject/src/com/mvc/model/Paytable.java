package com.mvc.model;

public class Paytable extends Salary implements Calculate, Output{
	
	public Paytable() {
		super();
	}
	public Paytable(String name, long pay, int family, int overtime) {
        super(name, pay, family, overtime);
    }
	@Override
	public void out() {
        System.out.printf("%-10s%-10d%-8d%-10d%-9d%-12d%-6d%-12.1f%-8d%-10d\n",
                getName(), getPay(), getFamily(), getFamily(), getOvertime(), getOvertimeP(),
                getTax(), getIncentive(), getIncenP(), getTotalPay());
    }

	@Override
	public void calc() {
        setFamily((getFamily() < 3) ? getFamily() * 20000 : 60000);
        setOvertimeP(getOvertime() * 5000);
        setTax((long) (getPay() * 0.1));
        setIncenP((long) (getIncentive() * getPay()));
        setTotalPay(getPay() + getFamily() + getIncenP() + getOvertimeP() - getTax());
    }

}
