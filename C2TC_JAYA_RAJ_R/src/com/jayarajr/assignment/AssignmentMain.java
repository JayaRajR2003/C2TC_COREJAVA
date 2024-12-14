package com.jayarajr.assignment;

import com.jayarajr.assignment.employees.Developer;
import com.jayarajr.assignment.employees.Manager;
import com.jayarajr.assignment.utilities.EmployeeUtilities;

/**
 * The {@code AssignmentMain} class serves as the entry point for testing the package structure and access modifiers.
 */
public class AssignmentMain {
    /**
     * The main method creates instances of {@code Manager} and {@code Developer},
     * and uses utility methods to perform operations on them.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Jaya Raj R", 101, 85000, "HR");
        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeInfo(manager);
        System.out.println("Department: " + manager.getDepartment());

        // Create a Developer object
        Developer developer = new Developer("Muthu", 102, 75000, "Java");
        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeInfo(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Update salaries
        System.out.println("\nUpdating Salaries:");
        EmployeeUtilities.updateEmployeeSalary(manager, 90000);
        EmployeeUtilities.updateEmployeeSalary(developer, 80000);
    }
}

