package JavaTabanlıKonfigürasyon.Eticaret;

import AnatasyonTabanlıKonfigürasyon.Banka.Customer;
import AnatasyonTabanlıKonfigürasyon.ETicaret.OrderService;
import AnatasyonTabanlıKonfigürasyon.ETicaret.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(500.0);
        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.processPayment(600.0);



    }
}
