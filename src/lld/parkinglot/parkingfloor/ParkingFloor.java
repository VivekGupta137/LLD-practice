package lld.parkinglot.parkingfloor;

import lld.parkinglot.parkinglot.ParkingLot;
import lld.parkinglot.parkingspot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    // each floor will have a list of parking spots
    private List<ParkingSpot> parkingSpots;
    private ParkingLot parkingLot;
    private int floorNumber = -1;

    public ParkingFloor(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
        this.parkingSpots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        parkingSpot.setParkingSpotNumber(parkingSpots.size());
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
