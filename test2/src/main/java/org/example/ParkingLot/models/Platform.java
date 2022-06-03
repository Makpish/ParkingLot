package org.example.ParkingLot.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Platform {

    private Map<String, ParkingLot> parkingLotMap;
    private Map<String, Vehicle> vehicleMap;
    private List<Bookings> bookings;

    public Platform() {
        parkingLotMap = new HashMap<>();
        vehicleMap = new HashMap<>();
        bookings = new ArrayList<>();
    }

    public Map<String, ParkingLot> getParkingLotMap() {
        return parkingLotMap;
    }

    public void setParkingLotMap(Map<String, ParkingLot> parkingLotMap) {
        this.parkingLotMap = parkingLotMap;
    }

    public Map<String, Vehicle> getVehicleMap() {
        return vehicleMap;
    }

    public void setVehicleMap(Map<String, Vehicle> vehicleMap) {
        this.vehicleMap = vehicleMap;
    }

    public List<Bookings> getBookings() {
        return bookings;
    }
}
