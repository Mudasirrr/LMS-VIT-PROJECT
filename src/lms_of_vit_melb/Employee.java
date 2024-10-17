/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_of_vit_melb;
/**
 *
 * @author User
 */
// File: Employee.java
public class Employee extends User {
    private String employeeID;
    private String position;

    public Employee(String employeeID, String name, String email, String position) {
        super(employeeID, name, email);
        this.employeeID = employeeID;
        this.position = position;
    }

    // Display employee info
    @Override
    public void displayUserInfo() {
        System.out.println("Employee ID: " + employeeID + ", Name: " + getName() + ", Position: " + position);
    }

    // Getter and Setter methods
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
