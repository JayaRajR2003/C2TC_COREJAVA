package com.jayarajr.assignment.utilities;

import com.jayarajr.assignment.employees.Employee;

/**
 * The {@code EmployeeUtilities} class provides utility methods for working with employees.
 * This class demonstrates the use of access modifiers to operate on employee objects.
 */
public class EmployeeUtilities {

    /**
     * Displays basic information about an {@code Employee}.
     *
     * @param employee the employee whose information is to be displayed
     */
    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Updates the salary of an {@code Employee}.
     *
     * @param employee  the employee whose salary is to be updated
     * @param newSalary the new salary value
     */
    public static void updateEmployeeSalary(Employee employee, double newSalary) {
        employee.setSalary(newSalary);
        System.out.println("Salary updated to: " + employee.getSalary());
    }
}
