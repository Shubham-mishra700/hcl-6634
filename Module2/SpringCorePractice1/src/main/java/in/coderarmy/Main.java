package in.coderarmy;

import in.strikes.CartServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        PaymentServices payment = new PaymentServices();
//
//        OrderServices order = new OrderServices(payment);
//        order.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderServices order = context.getBean(OrderServices.class);
        order.placeOrder();

        /*  now we can access the CartServices by injecting its jar file as dependency
        CartServices cart = new CartServices();
        cart.addToCart();
        */

//
//        User user =  context.getBean(User.class);
//        System.out.println(user.getAge());
//
//        CartServices cart = context.getBean(CartServices.class);
//        cart.addToCart();




    }
}
