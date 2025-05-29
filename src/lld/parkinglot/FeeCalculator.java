package lld.parkinglot;

import lld.parkinglot.vehicle.Vehicle;

public class FeeCalculator {
    Ticket ticket;

    public FeeCalculator(Ticket ticket){
        this.ticket = ticket;
    }

    public double calculateExtraCharges() {
        return 50; // base charge + gst etc
    }

    public double calculateParkingFee(){
        ticket.setExitTime();
        Vehicle vehicle = ticket.vehicle;
        double parkingChargePerMinute = vehicle.parkingChargePerMinute();
        int minutesPassed = (int)((ticket.exitTime - ticket.entryTime)/ 1000);

        double parkingCharge = parkingChargePerMinute * minutesPassed;
        double extraCharge = calculateExtraCharges();

        return parkingCharge + extraCharge;
    }

    public void printBill(){
        System.out.println("Calculating the bill");
        double totalFees = calculateParkingFee();
        System.out.println("Your parking fee : " + totalFees + " INR");
    }

}
