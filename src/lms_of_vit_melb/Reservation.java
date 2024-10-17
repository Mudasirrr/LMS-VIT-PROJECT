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
// File: Reservation.java
public class Reservation {
    private String reservationID;
    private Book book;
    private Patron patron;

    public Reservation(String reservationID, Book book, Patron patron) {
        this.reservationID = reservationID;
        this.book = book;
        this.patron = patron;
    }

    // Getter and Setter methods
    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservation
