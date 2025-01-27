package Design_Patterns.o2_Observer.Observable;

import Design_Patterns.o2_Observer.Observer.Notify_All;

import java.util.Observer;

public interface Amazon_Products {

    void add(Notify_All observer);
    void remove(Notify_All observer);

    void notify_all();

    void setData(int data);
    int getData();
}
