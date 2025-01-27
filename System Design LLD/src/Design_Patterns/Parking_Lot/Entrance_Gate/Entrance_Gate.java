package Design_Patterns.Parking_Lot.Entrance_Gate;

import Design_Patterns.Parking_Lot.ParkingSpot.Parking_Spot_Manager;
import Design_Patterns.Parking_Lot.Ticket.Ticket;
import Design_Patterns.Parking_Lot.Vehicle.Type;
import Design_Patterns.Parking_Lot.Vehicle.Vehicle;

public class Entrance_Gate <T extends Parking_Spot_Manager> {

    Parking_Spot_Manager parkingSpotManager;

    public Entrance_Gate(T parkingSpotManager){

        this.parkingSpotManager = parkingSpotManager;
    }

    public int findSpace() {

        return parkingSpotManager.find();

    }
    public void park(int spotNumber){

        parkingSpotManager.park(spotNumber);
    }

    public Ticket generateTicket(int spotNumber, Vehicle vehicle){

        return new Ticket(spotNumber, vehicle);
    }
}
