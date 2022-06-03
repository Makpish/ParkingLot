package org.example.ParkingLot;

import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.models.Platform;
import org.example.ParkingLot.service.booking.BookingService;
import org.example.ParkingLot.service.booking.BookingServiceImpl;
import org.example.ParkingLot.service.parkinglot.ParkingLotService;
import org.example.ParkingLot.service.parkinglot.ParkingLotServiceImpl;
import org.example.ParkingLot.service.platform.PlatformService;
import org.example.ParkingLot.service.platform.PlatformServiceImpl;
import org.example.ParkingLot.service.vehicle.VehicleService;
import org.example.ParkingLot.service.vehicle.VehicleServiceImpl;

public class Application {

    public static void main(String[] args) {
        PlatformService platformService = new PlatformServiceImpl();
        ParkingLotService parkingLotService = new ParkingLotServiceImpl();
        VehicleService vehicleService = new VehicleServiceImpl();
        BookingService bookingService = new BookingServiceImpl();


        Platform platform = platformService.createPlatform();

        platformService.addParkingLot(platform, parkingLotService.createParkingLot("PL1"));
        platformService.addParkingLot(platform, parkingLotService.createParkingLot("PL2"));
        platformService.addParkingLot(platform, parkingLotService.createParkingLot("PL3"));

        platformService.addVehicle(platform, vehicleService.createVehicle("V1", VehicleType.TWO_WHEELER));
        platformService.addVehicle(platform, vehicleService.createVehicle("V5", VehicleType.TWO_WHEELER));
        platformService.addVehicle(platform, vehicleService.createVehicle("V6", VehicleType.TWO_WHEELER));
        platformService.addVehicle(platform, vehicleService.createVehicle("V2", VehicleType.HATCHBACK));
        platformService.addVehicle(platform, vehicleService.createVehicle("V3", VehicleType.SUV));
        platformService.addVehicle(platform, vehicleService.createVehicle("V7", VehicleType.SUV));
        platformService.addVehicle(platform, vehicleService.createVehicle("V4", VehicleType.CYCLE));

        parkingLotService.addCapacity(platform.getParkingLotMap().get("PL1"), VehicleType.TWO_WHEELER, 2);
        parkingLotService.addCapacity(platform.getParkingLotMap().get("PL1"), VehicleType.SUV, 2);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL1"), VehicleType.TWO_WHEELER, 0, 2, 20);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL1"), VehicleType.TWO_WHEELER, 2, 4, 40);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL1"), VehicleType.SUV, 0, 2, 50);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL1"), VehicleType.SUV, 2, 4, 100);

        parkingLotService.addCapacity(platform.getParkingLotMap().get("PL2"), VehicleType.HATCHBACK, 3);
        parkingLotService.addCapacity(platform.getParkingLotMap().get("PL2"), VehicleType.SUV, 2);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL2"), VehicleType.HATCHBACK, 0, 2, 20);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL2"), VehicleType.HATCHBACK, 2, 4, 40);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL2"), VehicleType.SUV, 0, 2, 50);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL2"), VehicleType.SUV, 2, 4, 100);

        parkingLotService.addCapacity(platform.getParkingLotMap().get("PL3"), VehicleType.CYCLE, 3);
        parkingLotService.addCapacity(platform.getParkingLotMap().get("PL3"), VehicleType.TWO_WHEELER, 2);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL3"), VehicleType.TWO_WHEELER, 0, 2, 20);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL3"), VehicleType.TWO_WHEELER, 2, 4, 40);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL3"), VehicleType.CYCLE, 0, 2, 50);
        parkingLotService.addRateCard(platform.getParkingLotMap().get("PL3"), VehicleType.CYCLE, 2, 4, 100);

        platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                platform.getVehicleMap().get("V1"), 0));
        platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                platform.getVehicleMap().get("V5"), 2));
        platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                platform.getVehicleMap().get("V3"), 1));
        try {
            platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                    platform.getVehicleMap().get("V7"), 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                    platform.getVehicleMap().get("V1"), 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                    platform.getVehicleMap().get("V6"), 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        bookingService.closeBooking(platform.getVehicleMap().get("V1").getLatestBooking(), 4);
        bookingService.closeBooking(platform.getVehicleMap().get("V3").getLatestBooking(), 2);
        bookingService.closeBooking(platform.getVehicleMap().get("V5").getLatestBooking(), 4);
        bookingService.closeBooking(platform.getVehicleMap().get("V7").getLatestBooking(), 4);

        platformService.addBooking(platform, bookingService.createBooking(platform.getParkingLotMap().get("PL1"),
                platform.getVehicleMap().get("V1"), 4));
        bookingService.closeBooking(platform.getVehicleMap().get("V1").getLatestBooking(), 6);

        vehicleService.printBookingHistory(platform.getVehicleMap().get("V1"));
        vehicleService.printBookingHistory(platform.getVehicleMap().get("V3"));
        vehicleService.printBookingHistory(platform.getVehicleMap().get("V5"));
        vehicleService.printBookingHistory(platform.getVehicleMap().get("V6"));
        vehicleService.printBookingHistory(platform.getVehicleMap().get("V7"));


    }
}
