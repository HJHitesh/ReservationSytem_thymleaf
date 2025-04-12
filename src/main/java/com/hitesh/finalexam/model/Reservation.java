package com.hitesh.finalexam.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String details;
    private String reservationDate; // Format: YYYY-MM-DD
    private Customer customer;
    private Payment payment;

    public Reservation() { }

    public Reservation(String details, String reservationDate, Customer customer, Payment payment) {
        this.details = details;
        this.reservationDate = reservationDate;
        this.customer = customer;
        this.payment = payment;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}