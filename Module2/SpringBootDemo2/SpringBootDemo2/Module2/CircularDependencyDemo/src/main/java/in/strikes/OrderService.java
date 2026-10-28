package in.strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService paymentService;

    // here the problem came  because of constructor because each one expecting each other object.

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }



    public void placeOrder(){

        paymentService.pay();
        //call here
        getOrderDetails();
        System.out.println("Order Placed");
    }

    public void getOrderDetails(){
        System.out.println("Order details");
    }
}
