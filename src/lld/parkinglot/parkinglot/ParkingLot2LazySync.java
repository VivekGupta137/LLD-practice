package lld.parkinglot.parkinglot;

public class ParkingLot2LazySync {
    // singleton instance

    private static ParkingLot2LazySync instance = null;

    private ParkingLot2LazySync() {
        // private constructor to prevent instantiation
    }

    public static synchronized ParkingLot2LazySync getInstance() {
        // lazy initialization
        if (instance == null) {
            instance = new ParkingLot2LazySync();
        }
        // return the existing instance
        return instance;
    }

}
