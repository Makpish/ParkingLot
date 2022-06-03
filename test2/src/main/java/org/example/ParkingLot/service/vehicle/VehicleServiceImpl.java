package org.example.ParkingLot.service.vehicle;

import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.models.Bookings;
import org.example.ParkingLot.models.Vehicle;

public class VehicleServiceImpl implements VehicleService {
    @Override
    public Vehicle createVehicle(String vehicleId, VehicleType vehicleType) {
        return new Vehicle(vehicleId, vehicleType);
    }

    @Override
    public void printBookingHistory(Vehicle vehicle) {
        if (vehicle.getBookingHistory().isEmpty()) {
            System.out.println("No History Available for vehicle = " + vehicle.getVehicleNumber());
            return;
        }
        for (Bookings bookings: vehicle.getBookingHistory()) {
            System.out.println(bookings.toString());
        }
    }
}
