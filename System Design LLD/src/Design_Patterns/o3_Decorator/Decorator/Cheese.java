package Design_Patterns.o3_Decorator.Decorator;

import Design_Patterns.o3_Decorator.Base.Pizza;

import java.security.PublicKey;

public class Cheese extends Pizza_Decorator{

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String description() {
        return pizza.description() + " Cheese";
    }

    public int cost() {
        return pizza.cost() + 10;
    }
}
