package Design_Patterns.o2_Observer.Observer;

import Design_Patterns.o2_Observer.Observable.Amazon_Products;

public class SmsNotification implements Notify_All{

    String mobile;
    Amazon_Products product;
    String productName;

    public SmsNotification(String mobile, Amazon_Products product, String productName) {
        this.mobile = mobile;
        this.product = product;
        this.productName = productName;
    }

    public void update(){
        sendSMS();
    }

    void sendSMS(){
        System.out.println("SMS sent to "+ mobile + " for product "+ productName);
    }
}