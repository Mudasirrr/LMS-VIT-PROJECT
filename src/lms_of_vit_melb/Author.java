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
public class Author {

    private String authorId;
    private String name;

    public Author(String authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author ID: " + authorId + ", Name: " + name;
    }
}

