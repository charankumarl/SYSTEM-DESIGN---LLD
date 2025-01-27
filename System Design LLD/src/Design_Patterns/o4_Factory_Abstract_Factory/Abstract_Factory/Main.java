package Design_Patterns.o4_Factory_Abstract_Factory.Abstract_Factory;

import Design_Patterns.o4_Factory_Abstract_Factory.Factory.Pizza;

public class Main {

    public static void main(String[] args) {

        Pizza_Factory veg = Pizza_Factory_Producer.getFactory("veg");

        Pizza pizza = veg.createPizza("veg");

        pizza.prepare();
        pizza.bake();
        pizza.box();
    }
}
