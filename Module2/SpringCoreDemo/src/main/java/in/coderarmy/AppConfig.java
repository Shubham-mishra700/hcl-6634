package in.coderarmy;

import in.coderarmy.payment.CardPayment;
import in.coderarmy.payment.PaymentService;
import in.strikes.CartServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.coderarmy")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("shubham",23);
    }

    @Bean

    public CartServices createCartService(){
        return new CartServices();
    }

    @Bean

    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean

    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }

}
