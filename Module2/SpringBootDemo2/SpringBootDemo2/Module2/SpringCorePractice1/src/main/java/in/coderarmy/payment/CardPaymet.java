package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
//@Qualifier
public class CardPaymet implements PaymentServices{
    @Override

    public void pay(){
        System.out.println("Payment done via Card");
    }
}
