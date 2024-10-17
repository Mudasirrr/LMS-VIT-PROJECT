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
// File: Category.java
import java.util.ArrayList;

public class Category {
    private String categoryID;
    private String name;
    private ArrayList<Book> booksInCategory;

    public Category(String categoryID, String name) {
        this.categoryID = categoryID;
        this.name = name;
        this.booksInCategory = new ArrayList<>();
    }

    // Add book to category
    public void addBook(Book book) {
        booksInCategory.add(book);
    }

    // Display category info
    public void displayCategoryInfo() {
        System.out.println("Category ID: " + categoryID + ", Name: " + name);
    }

    // Getter and Setter methods
    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooksInCategory() {
        return booksInCategory;
    }

    public void setBooksInCategory(ArrayList<Book> booksInCategory) {
        this.booksInCategory = booksInCategory;
    }
}
