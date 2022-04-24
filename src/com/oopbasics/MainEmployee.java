package com.oopbasics;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getFullName());
        System.out.println(e.setEmployeeSalary(4000.0));
        System.out.println(e.getEmployeeAnnualSalary());
        System.out.println(e.raiseSalary(15.0));
    }
}
