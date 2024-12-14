package com.jayarajr.assignment.employees;

/**
 * The {@code Employee} class represents a general employee with attributes for name, ID, and salary.
 * This class uses private access modifiers for attributes to ensure encapsulation.
 * Getter and setter methods are provided for controlled access to these attributes.
 */
public class Employee {
    private String name;       // Private: Accessible only within this class
    private int employeeId;    // Private: Accessible only within this class
    private double salary;     // Private: Accessible only within this class

    /**
     * Constructs an {@code Employee} object with the specified details.
     *
     * @param name       the name of the employee
     * @param employeeId the unique ID of the employee
     * @param salary     the salary of the employee
     */
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    /**
     * Gets the name of the employee.
     *
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employee ID.
     *
     * @return the unique employee ID
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee ID.
     *
     * @param employeeId the new employee ID
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the salary of the employee.
     *
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary the new salary of the employee
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

