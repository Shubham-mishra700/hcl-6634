package in.strikes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Primary
    public OrderService getOrder(){
        return new OrderService();
    }

    @Bean
    public OrderService getOrder2(){
        return new OrderService();
    }

  /*  You have defined two separate beans: getOrder and getOrder2.
       - getOrder() creates one OrderService object.
        - getOrder2() creates another OrderService object.
      Even though @Scope("singleton") is present, each bean definition has its own singleton instance.*/

}
