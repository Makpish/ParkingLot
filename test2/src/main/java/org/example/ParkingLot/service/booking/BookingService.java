package org.example.ParkingLot.service.booking;

import org.example.ParkingLot.models.Bookings;
import org.example.ParkingLot.models.ParkingLot;
import org.example.ParkingLot.models.Vehicle;

public interface BookingService {

    Bookings createBooking(ParkingLot parkingLot, Vehicle vehicle, int startTime);
    void closeBooking(Bookings bookings, int endTime);
}
