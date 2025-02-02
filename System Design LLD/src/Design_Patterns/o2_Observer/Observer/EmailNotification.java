package Design_Patterns.o2_Observer.Observer;

import Design_Patterns.o2_Observer.Observable.Amazon_Products;

public class EmailNotification implements Notify_All{

    String email;
    Amazon_Products products;
    String productName;

    public EmailNotification(String email, Amazon_Products products, String productName) {
        this.email = email;
        this.products = products;
        this.productName = productName;
    }

    public void update(){
        sendEmail();
    }

    void sendEmail(){
        System.out.println("Email Sent to " + email + " for " + productName);
    }
}
