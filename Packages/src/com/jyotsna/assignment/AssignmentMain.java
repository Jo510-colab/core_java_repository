package com.jyotsna.assignment;

import employees.Developer; 
import utilities.EmployeeUtilities;
import employees.Manager;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Jyotsna", 100, 50000, "HR");
        Developer developer = new Developer("Priya", 101, 60000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}