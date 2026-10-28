package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.SmsService;
import jdk.swing.interop.SwingInterOpUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        NotificationService notification = new SmsService();

     //  OrderService order = new OrderService(notification);
        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}

// A class should ask what it needs and not build everything itself.


// IOC --> Inversion of control
