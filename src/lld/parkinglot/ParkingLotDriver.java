package lld.parkinglot;

import lld.Driver;
import lld.parkinglot.parkinglot.ParkingLot;
import lld.parkinglot.parkinglot.ParkingLotSingletonFactory;
import lld.parkinglot.vehicle.Motorcycle;
import lld.parkinglot.vehicle.Vehicle;

public class ParkingLotDriver implements Driver {
    @Override
    public void start() {
        ParkingLot parkingLot = ParkingLotSingletonFactory.getTwoStoreyParkingLot();

        // bikes
        Vehicle bike1 = new Motorcycle(3344);
        Vehicle bike2 = new Motorcycle(3322);

        ParkingSystem parkingSystem = new ParkingSystem(parkingLot);

        parkingSystem.vehicleEntry(bike1);
        parkingSystem.vehicleEntry(bike2);

    }
}
