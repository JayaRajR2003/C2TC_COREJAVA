package com.jayarajr.assignment.employees;

/**
 * The {@code Manager} class represents an employee in a managerial role.
 * It extends the {@code Employee} class and includes additional attributes specific to managers.
 */
public class Manager extends Employee {
    private String department; // Private: Accessible only within this class

    /**
     * Constructs a {@code Manager} object with the specified details.
     *
     * @param name       the name of the manager
     * @param employeeId the unique ID of the manager
     * @param salary     the salary of the manager
     * @param department the department managed by the manager
     */
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    /**
     * Gets the department of the manager.
     *
     * @return the department name
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the manager.
     *
     * @param department the new department name
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}

