package org.example.ParkingLot.models;

import org.example.ParkingLot.enums.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private String id;
    private Map<VehicleType, Capacity> capacityMap;

    public ParkingLot(String id) {
        this.id = id;
        this.capacityMap = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<VehicleType, Capacity> getCapacityMap() {
        return capacityMap;
    }

//    public void setCapacityMap(Map<VehicleType, Capacity> capacityMap) {
//        this.capacityMap = capacityMap;
//    }
}
