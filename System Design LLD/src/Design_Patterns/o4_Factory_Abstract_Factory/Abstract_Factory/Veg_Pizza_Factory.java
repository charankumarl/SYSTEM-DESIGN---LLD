package Design_Patterns.o4_Factory_Abstract_Factory.Abstract_Factory;

import Design_Patterns.o4_Factory_Abstract_Factory.Factory.Pizza;
import Design_Patterns.o4_Factory_Abstract_Factory.Factory.Veg_Pizza;

public class Veg_Pizza_Factory implements Pizza_Factory{

    @Override
    public Pizza createPizza(String type) {
        return new Veg_Pizza();
    }
}
