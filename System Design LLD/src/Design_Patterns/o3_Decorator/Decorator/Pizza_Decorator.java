package Design_Patterns.o3_Decorator.Decorator;

import Design_Patterns.o3_Decorator.Base.Pizza;

public abstract class Pizza_Decorator implements Pizza {

    Pizza pizza;

    public Pizza_Decorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public int cost() {
        return pizza.cost();
    }
}
