package org.example.ParkingLot.models;

public class Bookings {

    private ParkingLot parkingLot;
    private Vehicle vehicle;
    private String areaId;
    private int startTime;
    private int endTime;
    private int amountPaid;

    public Bookings(ParkingLot parkingLot, Vehicle vehicle, String areaId, int startTime) {
        this.parkingLot = parkingLot;
        this.vehicle = vehicle;
        this.areaId = areaId;
        this.startTime = startTime;
        this.endTime = -1;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "parkingLot=" + parkingLot.getId() +
                ", vehicle=" + vehicle.getVehicleNumber() +
                ", areaId='" + areaId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", amountPaid=" + amountPaid +
                '}';
    }
}
