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
// File: Fine.java
public class Fine {
    private double amount;

    public Fine(double amount) {
        this.amount = amount;
    }

    // Getter and Setter methods
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayFineInfo() {
        System.out.println("Fine Amount: $" + amount);
    }
}
