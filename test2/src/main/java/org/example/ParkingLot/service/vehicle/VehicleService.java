package org.example.ParkingLot.service.vehicle;

import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.models.Bookings;
import org.example.ParkingLot.models.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle createVehicle(String vehicleId, VehicleType vehicleType);
    void printBookingHistory(Vehicle vehicle);

}
