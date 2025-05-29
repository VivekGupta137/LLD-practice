package lld.parkinglot.parkinglot;

import lld.parkinglot.ParkingLotDriver;
import lld.parkinglot.Ticket;
import lld.parkinglot.parkingfloor.ParkingFloor;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floors;
    private List<Ticket> activeParkingTickets;

    ParkingLot(){
        this.activeParkingTickets = new ArrayList<>();
        this.floors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor){
        floors.add(floor);
        floor.setFloorNumber(floors.size());
    }
    public List<ParkingFloor> getFloors(){
        return floors;
    }

    public void addTicket(Ticket ticket){
        activeParkingTickets.add(ticket);
    }
    public void removeTicket(Ticket ticket){
        activeParkingTickets.remove(ticket);
    }
    public List<Ticket> getActiveParkingTickets(){
        return activeParkingTickets;
    }
}
