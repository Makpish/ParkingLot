package org.example.ParkingLot.service.parkinglot;

import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.models.ParkingLot;

public interface ParkingLotService {

    ParkingLot createParkingLot(String parkingLotId);
    void addCapacity(ParkingLot parkingLot, VehicleType vehicleType, int totalSpots);
    void addRateCard(ParkingLot parkingLot, VehicleType vehicleType, int start, int end, int cost);
}
