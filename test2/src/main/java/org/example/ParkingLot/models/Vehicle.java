package org.example.ParkingLot.models;

import org.example.ParkingLot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String vehicleNumber;
    private VehicleType vehicleType;
    private List<Bookings> bookingHistory;

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        bookingHistory = new ArrayList<>();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void addHistory(Bookings bookings) {
        bookingHistory.add(bookings);
    }

    public List<Bookings> getBookingHistory() {
        return bookingHistory;
    }

    public Bookings getLatestBooking() {
        return bookingHistory.get(bookingHistory.size()-1);
    }
}
