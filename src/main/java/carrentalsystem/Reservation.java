package carrentalsystem;

import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Double totalPrice;

    public Reservation(String reservationId, Customer customer, LocalDateTime fromDate, LocalDateTime toDate, Double totalPrice) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalPrice = totalPrice;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
