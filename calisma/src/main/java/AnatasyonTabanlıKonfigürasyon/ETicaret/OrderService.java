package AnatasyonTabanlıKonfigürasyon.ETicaret;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService PaymentService;
    @Autowired
    public OrderService(PaymentService PaymentService){
        this.PaymentService = PaymentService;
    }
    public void placeOrder(double amount){
        System.out.println("Order Placed with amount " + amount);

    }
}
