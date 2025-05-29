package lld.parkinglot.parkinglot;

public class ParkingLot3TwoCheckLazy {
    private static volatile ParkingLot3TwoCheckLazy instance = null;

    private ParkingLot3TwoCheckLazy () {
        // prevent initialization
    }

    private static ParkingLot3TwoCheckLazy getInstance() {
        // check 1 not synchronized
        if(instance == null){
            // check 2 synchronized
            synchronized (ParkingLot3TwoCheckLazy.class){
                if(instance == null){
                    instance = new ParkingLot3TwoCheckLazy();
                }
            }
        }
        return instance;
    }
}
