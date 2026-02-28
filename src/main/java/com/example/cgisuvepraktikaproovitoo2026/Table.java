package com.example.cgisuvepraktikaproovitoo2026;

import jakarta.persistence.Entity;

@Entity
@jakarta.persistence.Table(name = "restaurant_table")
public class Table extends BaseEntity {
    private int seats;
    private String zone;
    private boolean isNearWindow;
    private boolean isPrivate;

    public Table() {
    }

    public Table(int seats, String zone, boolean isNearWindow, boolean isPrivate) {
        this.seats = seats;
        this.zone = zone;
        this.isNearWindow = isNearWindow;
        this.isPrivate = isPrivate;
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
        return isNearWindow;
    }

    public void setNearWindow(boolean nearWindow) {
        isNearWindow = nearWindow;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
