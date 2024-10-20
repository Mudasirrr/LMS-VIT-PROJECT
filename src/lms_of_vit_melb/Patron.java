package lms_of_vit_melb;

import java.util.ArrayList;
import java.util.List;

public class Patron extends User {
    private List<Loan> loans;
    private List<Reservation> reservations;

    public Patron(String userId, String name) {
        super(userId, name);
        this.loans = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // Add a loan to the patron
    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    // Return a loan
    public void returnLoan(String loanId) {
        loans.removeIf(loan -> loan.getLoanId().equals(loanId));
    }

    // Add a reservation
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Check fines (for simplicity, assuming no fines)
    public void checkFines() {
        System.out.println("No fines for the patron.");
    }
    public String getPatronId(){
        return userId;
    }
      public String getName(){
        return name;
      }
      public String getPatrons(){
           return "Patron ID: " + userId + ", Patron Name: " + name + "\n " ;
      }
    
      //public String toString() {
       // return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author.getName() + ", Publisher: " + publisher.getName() + ", Category: " + category.getCategoryName();
    }
