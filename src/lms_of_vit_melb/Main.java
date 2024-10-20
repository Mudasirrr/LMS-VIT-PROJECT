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

        Employee employee1 = new Employee("E201", "Mudasir Hussain", "Cyber Security Engineer");
        Employee employee2 = new Employee("E202", "Amara", "Librarian");

        library.addPatron(patron1);
        library.addPatron(patron2);

        library.addEmployee(employee1);
        library.addEmployee(employee2);
        //library.addEmployee(employee1);

        // List<Employee> employees = library.getEmployees();
        // Using scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice = 100;

        // Stylish and functional menu with proper handling of class relationships
        while (choice != 0) { // Loop until the user chooses to exit
            System.out.println("\n\n\n*************************************************\n\b\t****Library Management Menu:****\n*************************************************");

            System.out.println("1. Add a Patron");
            System.out.println("2. Add a Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. View Notifications");
            System.out.println("6. View Loan Records");
            System.out.println("7. View Categories");
            System.out.println("8. Add a Reservation");
            System.out.println("9. Show all the Employees");
            System.out.println("10. Show all the Patrons");
            System.out.println("11. Show all the Books");
            System.out.println("0. Exit");
            System.out.println("****************************************************\n*****************************************************");

            System.out.print("Enter your choice: ");
            System.out.println("\n****************************************************\n*****************************************************");

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
                    Patron borrowinggPatron = library.getPatronByName("Harry Potter"); // Get the patron by name or ID
                    Book bookTooBorrow = library.getBookByID("B1"); // Get the book by ID

                    if (borrowinggPatron != null && bookTooBorrow != null) {
                        // Creating a new loan with proper details
                        Loan newLoan = new Loan("1", borrowinggPatron, bookTooBorrow, "2024-10-20", "2024-11-20");

                        // Adding the loan to the library
                        library.addLoan(newLoan);
                        System.out.println("Loan created successfully!");
                    } else {
                        System.out.println("Patron or Book not found.");
                    }
                    /*
                    // Creating a new loan (ensure that borrowingPatron and bookToBorrow exist)
                    Loan newLoan = new Loan("1", patron1, book1, "2024-11-20", "2024-11-20");

// Adding the loan to the library
                    library.addLoan(newLoan);

// Retrieving the list of loans
                    List<Loan> allLoans = library.getLoans();
                    if (!allLoans.isEmpty()) {
                        for (Loan l : allLoans) {  // Changed loop variable name to 'l'
                            System.out.println("Patron: " + patron1.getName() + " | Book: " + book1.getTitle());
                        }
                    } else {
                        System.out.println("No loan records found.");
                    }*/

                    break;

                case 7:
                    // Retrieve the list of categories
                    List<Category> categories = library.getCategories();  // Change to List instead of ArrayList
                    System.out.println(category1.getCategoryName());
                    if (categories != null && !categories.isEmpty()) {
                        for (Category categ : categories) {
                            System.out.println("Category: " + categ.getCategoryName());
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
                        Reservation reservation = new Reservation("R1", reservingPatron, reservedBook);
                        library.addReservation(reservation);
                        System.out.println(reservingPatron.getName() + " reserved " + reservedBook.getTitle());
                    } else {
                        System.out.println("Invalid Patron or Book ID.");
                    }
                    break;

                // New cases for displaying all employees, patrons, and books
                case 9:  // Display all Employees
                    List<Employee> employees = library.getEmployees();
                    if (!employees.isEmpty()) {
                        System.out.println("--- List of Employees---");
                        for (Employee employee : employees) {
                            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Employee Name: " + employee.getName());
                        }
                    } else {
                        System.out.println("No Employee found.");
                    }

                    break;

                case 10:  // Display all Patrons
                    List<Patron> patrons = library.getPatrons();
                    if (!patrons.isEmpty()) {
                        System.out.println("--- List of Patrons ---");
                        for (Patron patron : patrons) {
                            System.out.println("Patron ID: " + patron.getPatronId() + ", Name: " + patron.getName());
                        }
                    } else {
                        System.out.println("No Patrons found.");
                    }
                    break;

                case 11:  // Display all Books
                    List<Book> books = library.getBooks();
                    if (!books.isEmpty()) {
                        System.out.println("--- List of Books ---");
                        for (Book book : books) {
                            System.out.println("Book ID: " + book.getBookID() + ", Title: " + book.getTitle());
                        }
                    } else {
                        System.out.println("No books found.");
                    }
                    break;
                case 0:
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
