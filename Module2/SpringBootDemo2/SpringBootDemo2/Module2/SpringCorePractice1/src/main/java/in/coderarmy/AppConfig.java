package in.coderarmy;

import in.coderarmy.payment.CardPaymet;
import in.coderarmy.payment.PaymentServices;
import in.coderarmy.payment.UpiPayment;
import in.strikes.CartServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("mishra",23);
    }

    @Bean
    public CartServices createCartService(){
        return new CartServices();
    }

    @Bean
    public PaymentServices createCardPayment(){
        return new CardPaymet();
    }

    @Bean
    @Primary
    public PaymentServices createUpiPayment(){
        return new UpiPayment();
    }

    //here it recognize as dependency is goining through constructor.
    @Bean
    public OrderServices createOrderService( PaymentServices paymentServices){
        return new OrderServices(paymentServices);
    }

    // what if we inject dependency using field and here we dont have constructor

   /* @Bean
    public OrderServices createOrderService(){
        PaymentServices payment = createCardPayment();
        OrderServices order  = new OrderServices();
        order.setPayment(payment);
        return order;
    }*/

    // what if we use Autowired in above of setter method

  /*  @Bean
    public OrderServices createOrderService(){
        return new OrderServices();
    }*/

}
