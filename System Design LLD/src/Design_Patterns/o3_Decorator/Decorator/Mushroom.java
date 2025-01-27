package Design_Patterns.o3_Decorator.Decorator;

import Design_Patterns.o3_Decorator.Base.Pizza;

public class Mushroom extends Pizza_Decorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    public String description() {
        return pizza.description() + "Mushroom, ";
    }

    public int cost() {
        return pizza.cost() + 50;
    }
}
