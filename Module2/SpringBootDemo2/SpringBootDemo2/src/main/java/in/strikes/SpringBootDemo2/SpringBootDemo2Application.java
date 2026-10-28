package in.strikes.SpringBootDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemo2Application.class, args);
//
//		PaymentGateway payment = context.getBean(PaymentGateway.class);
//		payment.setType("Paytm");
//		payment.setRetryCount(5);

//		System.out.println(payment.getType());
//		System.out.println(payment.getRetryCount());


		//when there are too many instance variables in a class then we can use @ConfigurationProperties annotation to bind the properties from application.properties file to the instance variables of the class.

//          PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		System.out.println(paymentGateway.getType());
//		System.out.println(paymentGateway.getRetryCount());
//		System.out.println(paymentGateway.isEnabled());
//		System.out.println(paymentGateway.getTimeout());
	}

}
