package Design_Patterns.Parking_Lot.ParkingSpot;

import Design_Patterns.Parking_Lot.Vehicle.Type;

public class Four_Wheeler_Spot extends Parking_Spot{

    public Four_Wheeler_Spot(int spot_number) {
        super(spot_number, Type.CAR);
    }
}
