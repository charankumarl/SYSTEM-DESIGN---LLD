package Design_Patterns.Parking_Lot;

import Design_Patterns.Parking_Lot.CostCompute.*;
import Design_Patterns.Parking_Lot.Entrance_Gate.Entrance_Gate;
import Design_Patterns.Parking_Lot.ParkingSpot.Four_Wheeler_Spot;
import Design_Patterns.Parking_Lot.ParkingSpot.Parking_Spot_Manager;
import Design_Patterns.Parking_Lot.ParkingSpot.Parking_Spot_Manager_Four_Wheel;
import Design_Patterns.Parking_Lot.ParkingSpot.Two_Wheeler_Spot;
import Design_Patterns.Parking_Lot.Ticket.Ticket;
import Design_Patterns.Parking_Lot.Vehicle.Type;
import Design_Patterns.Parking_Lot.Vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        Parking_Spot_Manager<Four_Wheeler_Spot> fourWheelManager = new Parking_Spot_Manager_Four_Wheel();

        Four_Wheeler_Spot spot1 = new Four_Wheeler_Spot(1);
        Four_Wheeler_Spot spot2 = new Four_Wheeler_Spot(2);

        fourWheelManager.add(spot1);
        fourWheelManager.add(spot2);

        Parking_Spot_Manager<Two_Wheeler_Spot> twoWheelManager = new Parking_Spot_Manager_Four_Wheel();

        Two_Wheeler_Spot spot3 = new Two_Wheeler_Spot(1);
        Two_Wheeler_Spot spot4 = new Two_Wheeler_Spot(2);

        twoWheelManager.add(spot3);
        twoWheelManager.add(spot4);

        Entrance_Gate entranceGate = new Entrance_Gate(twoWheelManager);

        int spotnumber = entranceGate.findSpace();
        entranceGate.park(spotnumber);

        Ticket ticket = entranceGate.generateTicket(spotnumber, new Vehicle("KA-01-HH-1234", Type.BIKE));

        System.out.println("Ticket Number: " + ticket.toString());
    }
}
