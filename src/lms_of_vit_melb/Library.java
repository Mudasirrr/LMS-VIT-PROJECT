package lms_of_vit_melb;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Patron> patrons = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();
    private List<Reservation> reservation = new ArrayList<>();
    private List<Category> category = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    private List<Notification> notifications = new ArrayList<>();
    //private List<Patron> patrons = new ArrayList<>();

    // Method to add a new Patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

       // Method to add a new Employee to the library
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /* // Method to get a Patron by name
    public Patron getPatron(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(name)) {
                return patron;
            }
        }
        return null; // Return null if no patron found
    }*/
    // Method to get a patron by name or ID
    public Patron getPatron(String patronNameOrID) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(patronNameOrID) || patron.getUserId().equals(patronNameOrID)) {
                return patron;
            }
        }
        return null; // Return null if no patron is found
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
    // Method to add a reservation to the library

    public void addReservation(Reservation res) {
        reservation.add(res);
    }

    // Method to get a book by ID
    public Book getBook(String bookID) {
        for (Book book : books) {
            // Compare the book's ID using .equals() method
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null; // If no book is found, return null
    }

// Method to add a loan to the library's list of loans
    public void addLoan(Loan loan) {
        loans.add(loan);

    }
    // Method to retrieve a loan by Patron name and Book ID
// Method to retrieve a loan by Patron name and Book ID

    public Loan getLoanByPatronAndBook(String patronName, String bookID) {
        for (Loan loan : loans) {
            // Correct method call chain
            if (loan.getPatron().getName().equals(patronName) && loan.getBook().getBookID().equals(bookID)) {
                return loan;
            }
        }
        return null;  // Return null if no matching loan is found
    }
// Method to return a book (remove loan)

    public void returnBook(Loan loan) {
        loans.remove(loan);  // Remove the loan from the list of loans
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    // Optional: Method to add a notification
    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public List<Category> getCategories() {
        return category;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
public Patron getPatronByName(String name) {
    for (Patron patron : patrons) {
        if (patron.getName().equals(name)) {
            return patron;
        }
    }
    return null;  // Return null if patron is not found
}
public Book getBookByID(String id) {
    for (Book book : books) {
        if (book.getBookID().equals(id)) {
            return book;
        }
    }
    return null;  // Return null if book is not found
}


}
