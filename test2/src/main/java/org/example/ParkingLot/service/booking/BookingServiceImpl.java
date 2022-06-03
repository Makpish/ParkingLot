package org.example.ParkingLot.service.booking;

import org.example.ParkingLot.models.*;

public class BookingServiceImpl implements BookingService {
    @Override
    public Bookings createBooking(ParkingLot parkingLot, Vehicle vehicle, int startTime) {
        if ((!vehicle.getBookingHistory().isEmpty()) && vehicle.getLatestBooking().getEndTime() == -1) {
            throw new RuntimeException("Illegal Booking. Vehicle already has active booking");
        }
        if (!parkingLot.getCapacityMap().containsKey(vehicle.getVehicleType()))
            throw new RuntimeException("Sorry this vehicle cant be parked here");
        Capacity capacity = parkingLot.getCapacityMap().get(vehicle.getVehicleType());
        if (capacity.getAreaIds().isEmpty())
            throw new RuntimeException("Sorry we are full currently");
        String areaId = capacity.getAreaIds().remove(capacity.getAreaIds().size()-1);
        Bookings bookings = new Bookings(parkingLot, vehicle, areaId, startTime);
        vehicle.addHistory(bookings);
        return bookings;
    }

    @Override
    public void closeBooking(Bookings bookings, int endTime) {
        bookings.setEndTime(endTime);
        Capacity capacity = bookings.getParkingLot().getCapacityMap().get(bookings.getVehicle().getVehicleType());
        capacity.addAreaId(bookings.getAreaId());
        int duration = endTime - bookings.getStartTime();
        int cost = 0;
        for (RateCard rateCard: capacity.getRateCard()) {
            if (rateCard.getStartTime() < duration) {
                cost += rateCard.getCost();
            }
        }
        bookings.setAmountPaid(cost);
        System.out.println("Please pay amount = " + cost + " for vehicle number = " + bookings.getVehicle().getVehicleNumber());
    }
}
