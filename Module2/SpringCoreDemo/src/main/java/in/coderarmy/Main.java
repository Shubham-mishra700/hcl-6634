package in.coderarmy;

import in.strikes.CartServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        PaymentService service = new PaymentService();
//        OrderService order = new OrderService(service );
//        order.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);// this line means ek spring container ko start kro using  annotation

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();


//        CartServices obj = new CartServices();
//        obj.addToCart();



//        User user = context.getBean(User.class);
//        System.out.println(user.getName());

//        CartServices cart = context.getBean(CartServices.class);
//        cart.addToCart();


    }
}
