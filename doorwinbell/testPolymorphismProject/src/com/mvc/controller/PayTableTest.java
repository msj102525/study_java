package com.mvc.controller;

import com.mvc.model.Paytable;
import com.mvc.model.Salary;

public class PayTableTest {
    public static void main(String[] args) {
        Salary.setIncentive(0.5f);
        Paytable[] pt = new Paytable[3];

        pt[0] = new Paytable("소서노", 750000, 2, 3);
        pt[1] = new Paytable("고주몽", 800000, 1, 4);
        pt[2] = new Paytable("모팔모", 650000, 6, 2);


        Salary.setIncentive(0.1f);
        displaySalaryDetails(pt);
    }

    private static void displaySalaryDetails(Paytable[] pt) {
        System.out.println("             **** 급여명세서 ****");
        System.out.printf("%-10s%-10s%-8s%-10s%-9s%-12s%-6s%-12s%-8s%-10s\n",
                "이름", "기본급", "가족수", "가족수당", "시간외근무", "시간외수당", "세금", "인센티브(%)", "성과금", "실수령액");

        for (Paytable p : pt) {
            p.calc();
            p.out();
        }

        System.out.println("인원수 : " + Salary.getCount() + "명\n");
    }
}
