package Design_Patterns.o1_Stratergy.Solution;

public class Automatic_Gear implements Gear_Strategy{

    @Override
    public void gear() {
        System.out.println("Automatic Gear System");
    }
}
