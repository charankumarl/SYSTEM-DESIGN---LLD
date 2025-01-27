package Design_Patterns.o4_Factory_Abstract_Factory.Abstract_Factory;

import Design_Patterns.o4_Factory_Abstract_Factory.Factory.Pizza;

public interface Pizza_Factory {

    Pizza createPizza(String type);
}
