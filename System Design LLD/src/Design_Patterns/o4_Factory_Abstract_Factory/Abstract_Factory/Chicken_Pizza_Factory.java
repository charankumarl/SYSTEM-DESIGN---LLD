package Design_Patterns.o4_Factory_Abstract_Factory.Abstract_Factory;

import Design_Patterns.o4_Factory_Abstract_Factory.Factory.Chicken_Pizza;
import Design_Patterns.o4_Factory_Abstract_Factory.Factory.Pizza;

public class Chicken_Pizza_Factory implements Pizza_Factory{

    @Override
    public Pizza createPizza(String type) {
        return new Chicken_Pizza();
    }
}
