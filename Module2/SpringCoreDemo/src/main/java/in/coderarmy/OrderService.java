package in.coderarmy;

import in.coderarmy.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

  //  @Autowired   // not recommended
    private PaymentService paymentService;

    //@Autowired
    public OrderService( @Qualifier("upi")PaymentService paymentService) {

        this.paymentService = paymentService;
    }

//     @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }



    public void placeOrder(){

       paymentService.pay();
        System.out.println("Order placed");
    }
}
