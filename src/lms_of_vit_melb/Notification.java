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
// File: Notification.java
public class Notification {
    private String notificationID;
    private String message;
    private Patron recipient;

    public Notification(String notificationID, String message, Patron recipient) {
        this.notificationID = notificationID;
        this.message = message;
        this.recipient = recipient;
    }

    // Send notification
    public void sendNotification() {
        System.out.println("Notification to " + recipient.getName() + ": " + message);
    }

    // Getter and Setter methods
    public String getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Patron getRecipient() {
        return recipient;
    }

    public void setRecipient(Patron recipient) {
        this.recipient = recipient;
    }
}
