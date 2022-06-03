package org.example.ParkingLot.models;

public class RateCard {

    private int startTime;
    private int endTime;
    private int cost;

    public RateCard(int startTime, int endTime, int cost) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.cost = cost;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
