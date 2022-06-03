package org.example.ParkingLot.service.platform;

import org.example.ParkingLot.models.Bookings;
import org.example.ParkingLot.models.ParkingLot;
import org.example.ParkingLot.models.Platform;
import org.example.ParkingLot.models.Vehicle;
import org.example.ParkingLot.service.vehicle.VehicleService;

public class PlatformServiceImpl implements PlatformService {

    @Override
    public Platform createPlatform() {
        return new Platform();
    }

    @Override
    public void addVehicle(Platform platform, Vehicle vehicle) {
        platform.getVehicleMap().put(vehicle.getVehicleNumber(), vehicle);
    }

    @Override
    public void addParkingLot(Platform platform, ParkingLot parkingLot) {
        platform.getParkingLotMap().put(parkingLot.getId(), parkingLot);
    }

    @Override
    public void addBooking(Platform platform, Bookings bookings) {
        platform.getBookings().add(bookings);
    }
}
