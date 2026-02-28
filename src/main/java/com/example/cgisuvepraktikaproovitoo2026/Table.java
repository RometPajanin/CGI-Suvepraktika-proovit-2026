package com.example.cgisuvepraktikaproovitoo2026;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.Table(name = "restaurant_table")
public class Table extends BaseEntity {
    private int seats;
    private String zone;

    @Column(name = "is_near_window")
    private boolean nearWindow;

    @Column(name = "is_private")
    private boolean privateTable;

    public Table() {
    }

    public Table(int seats, String zone, boolean nearWindow, boolean privateTable) {
        this.seats = seats;
        this.zone = zone;
        this.nearWindow = nearWindow;
        this.privateTable = privateTable;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public boolean isNearWindow() {
        return nearWindow;
    }

    public void setNearWindow(boolean nearWindow) {
        this.nearWindow = nearWindow;
    }

    public boolean isPrivateTable() {
        return privateTable;
    }

    public void setPrivateTable(boolean privateTable) {
        this.privateTable = privateTable;
    }
}
