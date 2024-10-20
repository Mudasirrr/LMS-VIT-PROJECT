package lms_of_vit_melb;

public class Book {
    private String bookID;
    private String title;
    private Author author;
    private Publisher publisher;
    private Category category;
    private boolean isLoaned;

    public Book(String bookId, String title, Author author, Publisher publisher, Category category) {
        this.bookID = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.isLoaned = false;
    }
    public String getBookID() {
        return bookID;
    }

    public String getBookId() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author.getName() + ", Publisher: " + publisher.getName() + ", Category: " + category.getCategoryName();
    }
}