package Design_Patterns.Parking_Lot.ParkingSpot;

import Design_Patterns.Parking_Lot.Vehicle.Type;

public class Two_Wheeler_Spot extends Parking_Spot {

    public Two_Wheeler_Spot(int spotNumber) {
        super(spotNumber, Type.BIKE);
    }
}