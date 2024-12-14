package com.jayarajr.assignment.employees;

/**
 * The {@code Developer} class represents an employee in a developer role.
 * It extends the {@code Employee} class and includes additional attributes specific to developers.
 */
public class Developer extends Employee {
    private String programmingLanguage; // Private: Accessible only within this class

    /**
     * Constructs a {@code Developer} object with the specified details.
     *
     * @param name                the name of the developer
     * @param employeeId          the unique ID of the developer
     * @param salary              the salary of the developer
     * @param programmingLanguage the primary programming language of the developer
     */
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    /**
     * Gets the primary programming language of the developer.
     *
     * @return the programming language
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Sets the primary programming language of the developer.
     *
     * @param programmingLanguage the new programming language
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
