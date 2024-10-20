package lms_of_vit_melb;

public class Loan {
    private String loanId;
    private Patron patron;
    private Book book;
    private String loanDate;
    private String dueDate;
    private Fine fine;

    public Loan(String loanId, Patron patron, Book book, String loanDate, String dueDate) {
        this.loanId = loanId;
        this.patron = patron;
        this.book = book;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.book.setLoaned(true);
    }

    public String getLoanId() {
        return loanId;
    }

    public Fine getFine() {
        return fine;
    }

    public void addFine(Fine fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId + ", Book: " + book.getTitle() + ", Patron: " + patron.getName() + ", Loan Date: " + loanDate + ", Due Date: " + dueDate;
    }
    public Patron getPatron(){
        return patron;
    }
    public Book getBook(){
        return book;
    }
 
}
    

