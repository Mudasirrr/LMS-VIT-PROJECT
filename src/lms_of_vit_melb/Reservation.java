package lms_of_vit_melb;

public class Reservation {
    private String reservationId;
    private Patron patron;
    private Book book;

    public Reservation(String reservationId, Patron patron, Book book) {
        this.reservationId = reservationId;
        this.patron = patron;
        this.book = book;
    }

    public String getReservationId() {
        return reservationId;
    }
    public void addReservation(String reservationId, Patron patron, Book book){
         this.reservationId = reservationId;
        this.patron = patron;
        this.book = book;
        }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + ", Book: " + book.getTitle() + ", Patron: " + patron.getName();
    }
}
