package org.example.ParkingLot.service.platform;

import org.example.ParkingLot.models.Bookings;
import org.example.ParkingLot.models.ParkingLot;
import org.example.ParkingLot.models.Platform;
import org.example.ParkingLot.models.Vehicle;

public interface PlatformService {

    Platform createPlatform();
    void addVehicle(Platform platform, Vehicle vehicle);
    void addParkingLot(Platform platform, ParkingLot parkingLot);
    void addBooking(Platform platform, Bookings bookings);
}
