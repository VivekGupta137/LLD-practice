package lld.parkinglot.parkinglot;

public class ParkingLot5BillPugh {
    private static ParkingLot5BillPugh instance = null;

    private ParkingLot5BillPugh() {}

    private static class ParkingLotPrivate {
        private static final ParkingLot5BillPugh INSTANCE = new ParkingLot5BillPugh();
    }

    public static ParkingLot5BillPugh getInstance() {

        return ParkingLotPrivate.INSTANCE;
    }
}
