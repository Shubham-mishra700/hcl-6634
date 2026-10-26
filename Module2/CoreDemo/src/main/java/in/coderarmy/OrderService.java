package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.PopUpNotificationService;

public class OrderService {

   // EmailService notification = new EmailService();

//    NotificationService notification = new PopUpNotificationService();

    NotificationService notification;

    // injecting dependency using constructor
    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    public OrderService(){

    }

    // therefore with the help of constructor we can avoid creating object in OrderService.


    public void placeOrder(){
        System.out.println("Order placed");
        notification.sendNotification();
    }

    // injecting dependency using setter.

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
