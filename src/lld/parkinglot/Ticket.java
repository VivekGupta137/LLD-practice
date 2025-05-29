package lld.parkinglot;

import lld.parkinglot.vehicle.Vehicle;

import java.util.Date;

public class Ticket {
    long entryTime;
    long exitTime ;
    Vehicle vehicle;


    public Ticket(long entry, Vehicle vehicle){
        this.entryTime = entry;
        this.vehicle = vehicle;
    }

    public void setExitTime(){
        exitTime = new Date().getTime();
    }

    public void printBill(){
        FeeCalculator feeCalculator = new FeeCalculator(this);
        feeCalculator.printBill();
    }
}
