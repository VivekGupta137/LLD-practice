package lld.parkinglot.vehicle;

public interface Vehicle {
    public VEHICLE_TYPE getType();
    public double parkingChargePerMinute();
    public int getVehicleNumber();
}
