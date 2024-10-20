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
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    
    private Library library;
    
    @Before
    public void setUp() {
        library = new Library();  // Initialize the library before each test
    }

    @Test
    public void testAddPatron() {
        Patron patron = new Patron("John Doe");
        library.addPatron(patron);
        assertEquals(1, library.getPatrons().size());  // Verify patron was added
        assertEquals("John Doe", library.getPatronByName("John Doe").getName());
    }

    @Test
    public void testAddBook() {
        Book book = new Book("001", "Effective Java", "Joshua Bloch");
        library.addBook(book);
        assertEquals(1, library.getBooks().size());
        assertEquals("Effective Java", library.getBookByID("001").getTitle());
    }

    @Test
    public void testRetrieveLoansWhenNoneExist() {
        assertTrue(library.getLoans().isEmpty());
    }
}