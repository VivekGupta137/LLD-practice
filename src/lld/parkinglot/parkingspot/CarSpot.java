package lld.parkinglot.parkingspot;

import lld.parkinglot.parkingfloor.ParkingFloor;
import lld.parkinglot.vehicle.VEHICLE_TYPE;
import lld.parkinglot.vehicle.Vehicle;

public class CarSpot implements ParkingSpot{
    private ParkingFloor parkingFloor;
    private Vehicle parkedVehicle = null;
    private int parkingSpotNumber = -1;

    public CarSpot(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    @Override
    public PARKING_SPOT getType() {
        return PARKING_SPOT.CAR;
    }
    @Override
    public ParkingFloor getFloor() {
        return parkingFloor;
    }

    @Override
    public boolean isVacant() {
        return parkedVehicle == null;
    }

    @Override
    public void vacateParkingSpot() {
        this.parkedVehicle = null;
    }

    @Override
    public boolean parkVehicle(Vehicle vehicle) {
        if(canParkVehicle(vehicle)){
            parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        if(vehicle.getType() == VEHICLE_TYPE.CAR && getType() == PARKING_SPOT.CAR && isVacant()){
            return true;
        }
        return false;
    }

    @Override
    public void setParkingSpotNumber(int number) {
        parkingSpotNumber = number;
    }

    @Override
    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    @Override
    public void printSpotLocation() {
        System.out.println("location :Parking floor: "+ parkingFloor.getFloorNumber() +" at Parking spot: "+ parkingSpotNumber);
    }

}
