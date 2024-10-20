/*package lms_of_vit_melb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String bookId;
        // Create a library instance
        Library library = new Library();

        // Create some authors, publishers, books, patrons, and employees
        Author author1 = new Author("A1", "J.K. Rowling");
        Author author2 = new Author("A2", "George Orwell");

        Publisher publisher1 = new Publisher("P1", "Bloomsbury Publishing");
        Publisher publisher2 = new Publisher("P2", "Houghton Mifflin Harcourt");

        Category category1 = new Category("C1", "Fantasy");
        Category category2 = new Category("C2", "Dystopian");

        Book book1 = new Book("B1", "Harry Potter and the Philosopher's Stone", author1, publisher1, category1);
        Book book2 = new Book("B2", "1984", author2, publisher2, category2);

        library.addBook(book1);
        library.addBook(book2);

        Patron patron1 = new Patron("P101", "Harry Potter");
        Patron patron2 = new Patron("P102", "John Smith");

        Employee employee1 = new Employee("E201", "Emma Johnson", "Librarian");

        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addEmployee(employee1);

        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            // Display the menu
            System.out.println("*************************************************\n\b\t****Library Management Menu:****\n*************************************************");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Reserve a Book");
            System.out.println("4. Check Patron Fines");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("*******************************\n");
            switch (choice) {
                case 1:
                    // Borrow a book
                    System.out.print("Enter Patron Name: ");
                    String patronName = scanner.nextLine();
                    Patron patronBorrowing = library.findPatronByName(patronName);

                    if (patronBorrowing != null) {
                        System.out.print("Enter Book ID to Borrow: ");
                        bookId = scanner.nextLine();
                        Book bookToBorrow = library.findBookById(bookId);

                        if (bookToBorrow != null && !bookToBorrow.isLoaned()) {
                            Loan loan = new Loan("L1", patronBorrowing, bookToBorrow, "2024-10-20", "2024-11-20");
                            patronBorrowing.addLoan(loan);
                            System.out.println("Book borrowed successfully: " + bookToBorrow.getTitle());
                        } else {
                            System.out.println("Book is either not available or already loaned.");
                        }
                    } else {
                        System.out.println("Patron not found.");
                    }
                    break;

                case 2:
                    // Return a book
                    System.out.print("Enter Patron Name: ");
                    patronName = scanner.nextLine();
                    Patron patronReturning = library.findPatronByName(patronName);

                    if (patronReturning != null) {
                        System.out.print("Enter Loan ID to Return: ");
                        String loanId = scanner.nextLine();
                        patronReturning.returnLoan(loanId);
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Patron not found.");
                    }
                    break;

                case 3:
                    // Reserve a book
                    System.out.print("Enter Patron Name: ");
                    patronName = scanner.nextLine();
                    Patron patronReserving = library.findPatronByName(patronName);

                    if (patronReserving != null) {
                        System.out.print("Enter Book ID to Reserve: ");
                        bookId = scanner.nextLine();
                        Book bookToReserve = library.findBookById(bookId);

                        if (bookToReserve != null) {
                            Reservation reservation = new Reservation("R1", patronReserving, bookToReserve);
                            patronReserving.addReservation(reservation);
                            System.out.println("Book reserved successfully: " + bookToReserve.getTitle());
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Patron not found.");
                    }
                    break;

                case 4:
                    // Check fines for a patron
                    System.out.print("Enter Patron Name: ");
                    patronName = scanner.nextLine();
                    Patron patronCheckingFines = library.findPatronByName(patronName);

                    if (patronCheckingFines != null) {
                        patronCheckingFines.checkFines();
                    } else {
                        System.out.println("Patron not found.");
                    }
                    break;

                case 5:
                    // Exit the system
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
 */
package lms_of_vit_melb;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String bookId;
        // Create an instance of the Library to manage all operations
        Library library = new Library();

        // Create some authors, publishers, books, patrons, and employees
        Author author1 = new Author("A1", "J.K. Rowling");
        Author author2 = new Author("A2", "George Orwell");

        Publisher publisher1 = new Publisher("P1", "Bloomsbury Publishing");
        Publisher publisher2 = new Publisher("P2", "Houghton Mifflin Harcourt");

        Category category1 = new Category("C1", "Fantasy");
        Category category2 = new Category("C2", "Dystopian");

        Book book1 = new Book("B1", "Harry Potter and the Philosopher's Stone", author1, publisher1, category1);
        Book book2 = new Book("B2", "1984", author2, publisher2, category2);

        library.addBook(book1);
        library.addBook(book2);

        Patron patron1 = new Patron("P101", "Harry Potter");
        Patron patron2 = new Patron("P102", "John Smith");

        Employee employee1 = new Employee("E201", "Emma Johnson", "Librarian");

        library.addPatron(patron1);
        library.addPatron(patron2);
        //library.addEmployee(employee1);

        // Using scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Stylish and functional menu with proper handling of class relationships
        while (choice != 9) { // Loop until the user chooses to exit
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add a Patron");
            System.out.println("2. Add a Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. View Notifications");
            System.out.println("6. View Loan Records");
            System.out.println("7. View Categories");
            System.out.println("8. Add a Reservation");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after integer input

            switch (choice) {
                case 1:
                    // Adding a Patron
                    System.out.println("--- Add a New Patron ---");
                    System.out.print("Enter Patron Name: ");
                    String patronName = scanner.nextLine();
                    System.out.print("Enter Patron ID: ");
                    String patronId = scanner.nextLine();

                    Patron newPatron = new Patron(patronName, patronId); // Create new Patron
                    library.addPatron(newPatron); // Add to the library
                    System.out.println("Patron added successfully: " + newPatron.getName());
                    break;

                case 2:
                    // Adding a Book
                    System.out.println("--- Add a New Book ---");
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    bookId = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter Publisher Name: ");
                    String publisherName = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String categoryName = scanner.nextLine();

                    // Creating related objects (Author, Publisher, Category)
                    Author author = new Author("A1", authorName); // Create Author object
                    Publisher publisher = new Publisher("P1", publisherName); // Create Publisher object
                    Category category = new Category("C1", categoryName); // Create Category object

                    // Create new Book object using the correct constructor
                    Book newBook = new Book(bookId, bookTitle, author, publisher, category);

                    // Add the book to the library
                    library.addBook(newBook);
                    System.out.println("Book added successfully: " + newBook.getTitle());
                    break;

                case 3:
                    // Borrow a Book
                    System.out.println("--- Borrow a Book ---");
                    System.out.print("Enter Patron Name: ");
                    patronName = scanner.nextLine();
                    System.out.print("Enter Book ID to Borrow: ");
                    String bookID = scanner.nextLine();

// Get the Patron
                    Patron borrowingPatron = library.getPatron(patronName);
                    if (borrowingPatron == null) {
                        System.out.println("Patron not found.");
                        break;
                    }

// Get the Book
                    Book bookToBorrow = library.getBook(bookID);
                    if (bookToBorrow == null) {
                        System.out.println("Book not found.");
                        break;
                    }

// Create a new loan
                    Loan loan = new Loan("1", borrowingPatron, bookToBorrow, "2024", "2");
                    library.addLoan(loan);
                    System.out.println("Book borrowed successfully by " + patronName);
                case 4:
                    // Return a Book
                    System.out.println("--- Return a Book ---");
                    System.out.print("Enter Patron Name: ");
                    String returnPatronName = scanner.nextLine();
                    System.out.print("Enter Book ID to Return: ");
                    String returnBookID = scanner.nextLine();

                    // Get the Loan based on Patron and Book
                    Loan loanToReturn = library.getLoanByPatronAndBook(returnPatronName, returnBookID);
                    if (loanToReturn == null) {
                        System.out.println("No loan found for Patron: " + returnPatronName + " and Book ID: " + returnBookID);
                        break;
                    }

                    library.returnBook(loanToReturn);
                    System.out.println("Book returned successfully by " + returnPatronName);
                    break;

                case 5:
                    // View Notifications
                    System.out.println("--- View Notifications ---");
                    List<Notification> notifications = library.getNotifications();

                    if (!notifications.isEmpty()) {
                        for (Notification notification : notifications) {
                            System.out.println("Notification: " + notification.getMessage());
                        }
                    } else {
                        System.out.println("No notifications at the moment.");
                    }
                    break;

                case 6:
                    // Creating a new loan (ensure that borrowingPatron and bookToBorrow exist)
                    Loan newLoan = new Loan("1", borrowingPatron, bookToBorrow, "2024-10-20", "2024-11-20");

// Adding the loan to the library
                    library.addLoan(newLoan);

// Retrieving the list of loans
                    List<Loan> allLoans = library.getLoans();
                    if (!allLoans.isEmpty()) {
                        for (Loan l : allLoans) {  // Changed loop variable name to 'l'
                            System.out.println("Patron: " + l.getPatron().getName() + " | Book: " + l.getBook().getTitle());
                        }
                    } else {
                        System.out.println("No loan records found.");
                    }

                    break;

                case 7:
                    // View Categories
                    System.out.println("--- View Book Categories ---");
                    ArrayList<Category> categories = library.getCategories();
                    if (!categories.isEmpty()) {
                        for (Category category : categories) {
                            System.out.println("Category: " + category.getCategoryName());
                        }
                    } else {
                        System.out.println("No categories found.");
                    }
                    break;

                case 8:
                    // Add a Reservation
                    System.out.println("--- Add a Reservation ---");
                    System.out.print("Enter Patron Name: ");
                    String reservationPatronName = scanner.nextLine();
                    System.out.print("Enter Book ID to Reserve: ");
                    String reserveBookId = scanner.nextLine();

                    // Check if Patron and Book exist
                    Patron reservingPatron = library.getPatron(reservationPatronName);
                    Book reservedBook = library.getBook(reserveBookId);

                    if (reservingPatron != null && reservedBook != null) {
                        // Create Reservation and add to library
                        Reservation reservation = new Reservation(reservingPatron, reservedBook);
                        library.addReservation(reservation);
                        System.out.println(reservingPatron.getName() + " reserved " + reservedBook.getTitle());
                    } else {
                        System.out.println("Invalid Patron or Book ID.");
                    }
                    break;

                case 9:
                    // Exit the program
                    System.out.println("Exiting the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Close scanner to avoid resource leaks
        scanner.close();
    }
}
