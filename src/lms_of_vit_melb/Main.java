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
// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("A1", "J.K. Rowling");
        Author author2 = new Author("A2", "George R.R. Martin");

        // Create publishers
        Publisher publisher1 = new Publisher("P1", "Bloomsbury");
        Publisher publisher2 = new Publisher("P2", "Bantam Books");

        // Create categories
        Category category1 = new Category("C1", "Fantasy");
        Category category2 = new Category("C2", "Adventure");

        // Create books
        Book book1 = new Book("B1", "Harry Potter", author1.getName());
        Book book2 = new Book("B2", "Game of Thrones", author2.getName());

        // Assign books to authors, publishers, and categories
        author1.addBook(book1);
        author2.addBook(book2);
        publisher1.publishBook(book1);
        publisher2.publishBook(book2);
        category1.addBook(book1);
        category2.addBook(book2);

        // Create a patron and an employee
        Patron patron = new Patron("PATRON1", "John Doe", "johndoe@example.com");
        Employee employee = new Employee("EMP1", "Jane Smith", "janesmith@example.com", "Librarian");

        // Patron borrows a book
        patron.borrowBook(book1);

        // Create a loan
        Loan loan = new Loan("L1", book1, patron);

        // Check loan status and apply fine if overdue
        loan.applyFine(50.0);

        // Display information
        author1.displayAuthorInfo();
        publisher1.displayPublisherInfo();
        category1.displayCategoryInfo();
        patron.displayUserInfo();
        employee.displayUserInfo();
        book1.displayBookInfo();
    }
}
