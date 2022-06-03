package org.example.ParkingLot.models;

import org.example.ParkingLot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Capacity {

    private VehicleType vehicleType;
    private int totalParkingSpots;
    private List<String> areaIds;
    private List<RateCard> rateCard;

    public Capacity(VehicleType vehicleType, int totalParkingSpots) {
        this.totalParkingSpots = totalParkingSpots;
        this.areaIds = new ArrayList<>();
        for (int i = 0; i<totalParkingSpots; i++) {
            addAreaId(vehicleType.toString() + i);
        }
        this.vehicleType = vehicleType;
        this.rateCard = new ArrayList<>();
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getTotalParkingSpots() {
        return totalParkingSpots;
    }

    public void setTotalParkingSpots(int totalParkingSpots) {
        this.totalParkingSpots = totalParkingSpots;
    }

    public List<RateCard> getRateCard() {
        return rateCard;
    }

    public void setRateCard(List<RateCard> rateCard) {
        this.rateCard = rateCard;
    }

    public List<String> getAreaIds() {
        return areaIds;
    }

    public void addAreaId(String id) {
        areaIds.add(id);
    }
}

{
    "cost": 50;
        "type": ;
        rateObj: {

        }
        }


