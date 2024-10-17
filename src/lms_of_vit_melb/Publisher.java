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
// File: Publisher.java
import java.util.ArrayList;

public class Publisher {
    private String publisherID;
    private String name;
    private ArrayList<Book> booksPublished;

    public Publisher(String publisherID, String name) {
        this.publisherID = publisherID;
        this.name = name;
        this.booksPublished = new ArrayList<>();
    }

    // Add book to publisher
    public void publishBook(Book book) {
        booksPublished.add(book);
    }

    // Display publisher info
    public void displayPublisherInfo() {
        System.out.println("Publisher ID: " + publisherID + ", Name: " + name);
    }

    // Getter and Setter methods
    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooksPublished() {
        return booksPublished;
    }

    public void setBooksPublished(ArrayList<Book> booksPublished) {
        this.booksPublished = booksPublished;
    }
}
