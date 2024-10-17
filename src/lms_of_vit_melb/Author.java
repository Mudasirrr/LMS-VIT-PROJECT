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
// File: Author.java
import java.util.ArrayList;

public class Author {
    private String authorID;
    private String name;
    private ArrayList<Book> books;

    public Author(String authorID, String name) {
        this.authorID = authorID;
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to author
    public void addBook(Book book) {
        books.add(book);
    }

    // Display author info
    public void displayAuthorInfo() {
        System.out.println("Author ID: " + authorID + ", Name: " + name);
    }

    // Getter and Setter methods
    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
