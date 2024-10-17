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
// File: Patron.java
import java.util.ArrayList;

public class Patron extends User {
    private String patronID;
    private ArrayList<Book> borrowedBooks;

    public Patron(String patronID, String name, String email) {
        super(patronID, name, email);
        this.patronID = patronID;
        this.borrowedBooks = new ArrayList<>();
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setAvailable(false);
        System.out.println("Book '" + book.getTitle() + "' borrowed by " + getName());
    }

    // Return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
        System.out.println("Book '" + book.getTitle() + "' returned by " + getName());
    }

    // Display patron info
    @Override
    public void displayUserInfo() {
        System.out.println("Patron ID: " + getUserID() + ", Name: " + getName());
    }

    // Getter and Setter methods
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
