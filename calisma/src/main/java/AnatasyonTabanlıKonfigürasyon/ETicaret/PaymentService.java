package AnatasyonTabanlıKonfigürasyon.ETicaret;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment(double amount){
        System.out.println("Payment processed for amount: "+amount);
    }
}
