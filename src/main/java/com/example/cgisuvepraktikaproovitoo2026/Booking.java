package com.example.cgisuvepraktikaproovitoo2026;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Booking extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "table_id")
    private Table table;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private int numberOfGuests;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;

    public Booking() {
    }

    public Booking(Table table, Client client, int numberOfGuests, LocalDateTime startTime, LocalDateTime endTime, String status) {
        this.table = table;
        this.client = client;
        this.numberOfGuests = numberOfGuests;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
