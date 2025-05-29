package lld.parkinglot.parkinglot;

import lld.parkinglot.parkingfloor.ParkingFloor;
import lld.parkinglot.parkingspot.BikeSpot;
import lld.parkinglot.parkingspot.CarSpot;
import lld.parkinglot.parkingspot.ParkingSpot;

public class ParkingLotSingletonFactory {
    private static ParkingLot twoStoreyParkingLot = null;
    public static ParkingLot getTwoStoreyParkingLot () {
        if(twoStoreyParkingLot == null){
            ParkingLot parkingLot = new ParkingLot();
            ParkingFloor floor1 = new ParkingFloor(parkingLot);

            floor1.addParkingSpot(new BikeSpot(floor1));
            floor1.addParkingSpot(new CarSpot(floor1));
            floor1.addParkingSpot(new CarSpot(floor1));

            ParkingFloor floor2 = new ParkingFloor(parkingLot);
            floor2.addParkingSpot(new CarSpot(floor2));
            floor2.addParkingSpot(new CarSpot(floor2));


            parkingLot.addFloor(floor1);
            parkingLot.addFloor(floor2);

            twoStoreyParkingLot = parkingLot;
        }
        return twoStoreyParkingLot;
    }
}
