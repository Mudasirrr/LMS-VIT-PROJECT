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
// File: Loan.java
import java.util.Date;

public class Loan {
    private String loanID;
    private Book book;
    private Patron patron;
    private Date loanDate;
    private Date dueDate;
    private Fine fine;

    public Loan(String loanID, Book book, Patron patron) {
        this.loanID = loanID;
        this.book = book;
        this.patron = patron;
        this.loanDate = new Date();
        this.dueDate = new Date(loanDate.getTime() + 14L * 24 * 60 * 60 * 1000); // 2 weeks
        this.fine = null;
    }

    // Check if loan is overdue
    public boolean isOverdue() {
        Date today = new Date();
        return today.after(dueDate);
    }

    // Apply fine if overdue
    public void applyFine(double amount) {
        if (isOverdue()) {
            this.fine = new Fine(amount);
            System.out.println("Fine applied to loan ID: " + loanID + " for book '" + book.getTitle() + "'");
        }
    }

    // Getter and Setter methods
    public String getLoanID() {
        return loanID;
    }

    public void setLoanID(String loanID) {
        this.loanID = loanID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }
}

