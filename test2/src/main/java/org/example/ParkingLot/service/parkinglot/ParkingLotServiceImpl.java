package org.example.ParkingLot.service.parkinglot;

import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.models.Capacity;
import org.example.ParkingLot.models.ParkingLot;
import org.example.ParkingLot.models.RateCard;

public class ParkingLotServiceImpl implements ParkingLotService {
    @Override
    public ParkingLot createParkingLot(String parkingLotId) {
        return new ParkingLot(parkingLotId);
    }

    @Override
    public void addCapacity(ParkingLot parkingLot, VehicleType vehicleType, int totalSpots) {
        parkingLot.getCapacityMap().put(vehicleType, new Capacity(vehicleType, totalSpots));
    }

    @Override
    public void addRateCard(ParkingLot parkingLot, VehicleType vehicleType, int start, int end, int cost) {
        parkingLot.getCapacityMap().get(vehicleType).getRateCard().add(new RateCard(start, end, cost));
    }
}
