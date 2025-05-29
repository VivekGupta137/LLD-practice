package lld.parkinglot;

import lld.parkinglot.parkingfloor.ParkingFloor;
import lld.parkinglot.parkinglot.ParkingLot;
import lld.parkinglot.parkingspot.ParkingSpot;
import lld.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingSystem {
    // brains of operating the parking lot
    ParkingLot parkingLot; // singleton instance
    ParkingSystem(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }


    // search for available parking spots
    // assign the parking spot

    public void vehicleEntry(Vehicle vehicle){
        // a vehicle enters
        // check if any parking spot is available
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        ParkingSpot availableParkingSpot = null;
        for (int i = 0; i < parkingFloors.size(); i++) {
            List<ParkingSpot> parkingSpots = parkingFloors.get(i).getParkingSpots();
            for (int spot_idx = 0; spot_idx < parkingSpots.size(); spot_idx++) {
                ParkingSpot parkingSpot = parkingSpots.get(spot_idx);
                boolean isAvailable = parkingSpot.canParkVehicle(vehicle);
                if(isAvailable){
                    // found the parking spot
                    availableParkingSpot = parkingSpot;
                    break;
                }

            }
        }

        if(availableParkingSpot == null){
            // no parking spots available
            System.out.println("No Parking space available");
        }
        else {
            System.out.println("Parking space found. Parking your vehicle.");
            availableParkingSpot.printSpotLocation();
            // create a ticket
            Ticket ticket = new Ticket(new Date().getTime(), vehicle);
            availableParkingSpot.parkVehicle(vehicle);
            parkingLot.addTicket(ticket);
        }
    }

    public void vehicleExit(Vehicle vehicle) {
        // find the ticket
        Ticket vehicleTicket = null;
        for (int i = 0; i < parkingLot.getActiveParkingTickets().size(); i++) {
            Ticket ticket = parkingLot.getActiveParkingTickets().get(i);
            if(ticket.vehicle.getVehicleNumber() == vehicle.getVehicleNumber()){
                // found the ticket
                vehicleTicket = ticket;
                break;
            }
        }

        if(vehicleTicket == null){
            System.out.println("An unexpected error happened, no existing ticket found.");
        }
        else {
            System.out.println("Calculating your parking fees, pls wait");
            vehicleTicket.printBill();
            System.out.println("Thanks for the payment.");
        }
    }
}
