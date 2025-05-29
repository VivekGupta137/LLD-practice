package lld.parkinglot.vehicle;

public class Motorcycle implements Vehicle{
    private int vehicleNumber;

    public Motorcycle(int vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public VEHICLE_TYPE getType() {
        return VEHICLE_TYPE.BIKE;
    }

    @Override
    public double parkingChargePerMinute() {
        return 10;
    }

    @Override
    public int getVehicleNumber() {
        return vehicleNumber;
    }
}
