package Design_Patterns.o4_Factory_Abstract_Factory.Factory;

public class Chicken_Pizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicken Pizza");
    }

    @Override
    public void box() {
        System.out.println("Packing Chicken Pizza");
    }
}
