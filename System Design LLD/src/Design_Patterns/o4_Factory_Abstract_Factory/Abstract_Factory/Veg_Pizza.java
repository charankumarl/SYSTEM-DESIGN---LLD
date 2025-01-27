package Design_Patterns.o4_Factory_Abstract_Factory.Abstract_Factory;

public class Veg_Pizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veg Pizza");
    }

    @Override
    public void box() {
        System.out.println("Packing Veg Pizza");
    }
}
