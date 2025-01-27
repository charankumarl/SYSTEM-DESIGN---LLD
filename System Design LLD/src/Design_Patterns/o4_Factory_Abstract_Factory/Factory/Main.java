package Design_Patterns.o4_Factory_Abstract_Factory.Factory;

public class Main {

    public static void main(String[] args) {

        Pizza veg = Pizza_Factory.createPizza("veg");
        veg.prepare();
        veg.bake();
        veg.box();

        Pizza non_veg = Pizza_Factory.createPizza("chicken");
        non_veg.prepare();
        non_veg.bake();
        non_veg.box();
    }
}
