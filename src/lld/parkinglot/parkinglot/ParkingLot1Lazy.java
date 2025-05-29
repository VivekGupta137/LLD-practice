package lld.parkinglot.parkinglot;

public class ParkingLot1Lazy {
    // singleton instance

    private static ParkingLot1Lazy instance = null;

    private ParkingLot1Lazy() {
        // private constructor to prevent instantiation
    }

    public static synchronized ParkingLot1Lazy getInstance() {
        // lazy initialization
        if (instance == null) {
            // create a new instance if it doesn't exist
            instance = new ParkingLot1Lazy();
        }
        // return the existing instance
        return instance;
    }
}
