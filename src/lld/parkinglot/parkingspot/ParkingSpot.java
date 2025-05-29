package lld.parkinglot.parkingspot;

import lld.parkinglot.parkingfloor.ParkingFloor;
import lld.parkinglot.vehicle.Vehicle;

public interface ParkingSpot {
    public PARKING_SPOT getType();
    public ParkingFloor getFloor();
    public boolean isVacant();
    public void vacateParkingSpot();
    public boolean parkVehicle(Vehicle vehicle);
    public boolean canParkVehicle(Vehicle vehicle);
    public void setParkingSpotNumber(int number);
    public int getParkingSpotNumber();
    public void printSpotLocation();
}
