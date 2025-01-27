package Design_Patterns.o1_Stratergy.Problem;

public class Electric extends Bike{

    @Override
    void gear(){
        System.out.println("Automatic Gear System");  // Both Scooty and Electric have same gear system. Duplication of code
    }
}
