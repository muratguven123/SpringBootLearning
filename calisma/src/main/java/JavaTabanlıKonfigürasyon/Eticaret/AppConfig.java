package JavaTabanlıKonfigürasyon.Eticaret;

import AnatasyonTabanlıKonfigürasyon.ETicaret.OrderService;
import AnatasyonTabanlıKonfigürasyon.ETicaret.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService paymentService(){
        return new PaymentService();
    }
    @Bean
    public OrderService orderService(){
        return new OrderService(paymentService());
    }
}
