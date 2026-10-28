package in.coderarmy;

import in.coderarmy.payment.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderServices {

    private PaymentServices payment;

    @Autowired
    public OrderServices(/*@Qualifier("cardPaymet")*/PaymentServices payment) {
        this.payment = payment;
    }


  //@Autowired
    public void setPayment(PaymentServices payment) {
        this.payment = payment;
    }

    public void placeOrder(){

        payment.pay();

        System.out.println("Ordered placed");

    }
}
