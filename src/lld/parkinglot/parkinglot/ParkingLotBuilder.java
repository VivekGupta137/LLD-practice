package lld.parkinglot.parkinglot;

import lld.parkinglot.parkingfloor.ParkingFloor;

public class ParkingLotBuilder {
    private static ParkingLot parkingLot = null;
    public ParkingLotBuilder () {
        parkingLot = new ParkingLot();
    }
    public ParkingLotBuilder addFloor(ParkingFloor floor){
        parkingLot.addFloor(floor);
        return this;
    }

}
