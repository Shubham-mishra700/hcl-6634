package in.strikes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Scope("prototype")
public class OrderService {

    PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService=paymentService;

    }

    public void placeOrder(){

        paymentService.pay();

        System.out.println("Order placed");
    }

    public void OrderDetails(){
        System.out.println("Order detail");
    }
}
