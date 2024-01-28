package de.aittr.g_31_2_homework011.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "travel_date")
    private Date travelDate;

    @Column(name = "customer")
    private String customer;

    @Column(name = "destination")
    private String destination;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && Objects.equals(travelDate, ticket.travelDate) && Objects.equals(customer, ticket.customer) && Objects.equals(destination, ticket.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, travelDate, customer, destination);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", travelDate=" + travelDate +
                ", customer='" + customer + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
