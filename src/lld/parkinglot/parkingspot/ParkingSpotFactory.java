package lld.parkinglot.parkingspot;

import lld.parkinglot.parkingfloor.ParkingFloor;

public class ParkingSpotFactory {
    public static ParkingSpot getBikeSpot (ParkingFloor parkingFloor) {
        return new BikeSpot(parkingFloor);
    }
    public static ParkingSpot getCarSpot(ParkingFloor parkingFloor) {
        return new CarSpot(parkingFloor);
    }
}
