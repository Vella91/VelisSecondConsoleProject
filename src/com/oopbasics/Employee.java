package com.oopbasics;

public class Employee {
    final int Id = 5;
    final String firstName = "John";
    final String lastName = "Smith";
    private double employeeSalary;

    public Employee() {
        this.employeeSalary = employeeSalary;
    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public double setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
        return employeeSalary;
    }

    public double getEmployeeAnnualSalary() {
        System.out.println("The employee salary per annum equals: ");
        return employeeSalary * 12;
    }

    public Double raiseSalary(double x) {
        var updatedSalary = employeeSalary + (employeeSalary * x / 100);
        System.out.println("The new employee salary after the raise is: ");
        return updatedSalary;
    }
}
